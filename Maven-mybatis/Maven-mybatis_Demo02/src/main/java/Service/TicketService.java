package Service;

import Entity.TicketEntity;
import Mapper.TicketsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TicketService {
    private TicketsMapper ticketsMapper;
    private SqlSession sqlSession;
    /**
     * 无参构造函数，每次new出TicketService时都会自行得到ticketMapper对象，这样在其他方法里面就不用再写了
     * @throws IOException
     */
    public TicketService() throws IOException {
        //加载Mybatis配置文件(自动去resources下查找)
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession
        sqlSession = sqlSessionFactory.openSession();
        //代理开发模式
        ticketsMapper= sqlSession.getMapper(TicketsMapper.class);
    }

    /**
     * 获取所有车票信息
     * @return List
     */
    public List<TicketEntity> getAllTickets(){
        return ticketsMapper.getAllTickets();
    }

    /**
     * 查询单个车票
     * @param id
     * @return TicketEntity
     */
    public TicketEntity getById(String id){
        return ticketsMapper.getById(id);
    }

    /**
     * 添加车票
     * @param ticket
     * @return 受影响行数
     */
    public int addTicket(TicketEntity ticket){
        int result=ticketsMapper.addTicket(ticket);
        //需要手动提交事务
        sqlSession.commit();
        return result;
    }

    /**
     * 删除车票
     * @param id
     * @return 受影响行数
     */
    public int deleteById(String id){
        int result=ticketsMapper.deleteById(id);
        //需要手动提交事务
        sqlSession.commit();
        return result;
    }

    /**
     * 修改车票信息
     * @param ticket
     * @return 受影响行数
     */
    public int updateTicket(TicketEntity ticket){
        int result=ticketsMapper.updateTicket(ticket);
        //需要手动提交事务
        sqlSession.commit();
        return result;
    }

    /**
     * 多条件查询
     * @param departure_point
     * @param arrive_point
     * @return List
     */
    public List<TicketEntity> getByParams(String departure_point,String  arrive_point){
        return ticketsMapper.getByParams(departure_point,arrive_point);
    }
    public List<TicketEntity> dynamicSQL(String id,String departure_point,String arrive_point){
        return ticketsMapper.dynamicSQL(id,departure_point,arrive_point);
    }
}
