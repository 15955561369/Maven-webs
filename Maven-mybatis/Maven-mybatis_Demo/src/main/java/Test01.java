import UserEntity.UserEntity;
import Mapper.usersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //加载Mybatis配置文件(自动去resources下查找)
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //定位namespace的mapper执行getByUsers方法
//        List<UserEntity> userEntities = sqlSession.selectList("userMapper.getByUsers", UserEntity.class);
//        System.out.println(userEntities);
        //代理开发模式
        usersMapper mapper = sqlSession.getMapper(usersMapper.class);//传入代理接口
        List<UserEntity> userEntities = mapper.getByUsers();
        System.out.println(userEntities);
        sqlSession.close();
    }
}
