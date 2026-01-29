package Test;

import Entity.TicketEntity;
import Mapper.TicketsMapper;
import Service.TicketService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException {

        TicketService ticketService = new TicketService();
        //查询所有车票
        List<TicketEntity> allTickets = ticketService.getAllTickets();
        for (TicketEntity ticketEntity : allTickets) {
            System.out.println(ticketEntity);
        }
        //查询G2026
        TicketEntity g2026 = ticketService.getById("1 or (1=1)");//自动防止注入攻击
        System.out.println(g2026);
        //添加车票
        //int result=ticketService.addTicket(new TicketEntity("D2025","西安",new Date(),"西安北",new Date(),45.9f));
        //System.out.println(result);
        //删除指定车票
        int rs=ticketService.deleteById("D2023");
        System.out.println(rs);
        //修改指定车票
        int res=ticketService.updateTicket(new TicketEntity("D2025","北京西",new Date(),"上海浦东",new Date(),500.2f));
        System.out.println(res);
        //多条件查询
        List<TicketEntity> tickets = ticketService.getByParams("合肥南","芜湖");
        for (TicketEntity ticketEntity : tickets) {
            System.out.println(ticketEntity);
        }
        //动态SQL语句
        List<TicketEntity> ticketEntities = ticketService.dynamicSQL("G2026", null, "芜湖");
        for (TicketEntity ticketEntity : ticketEntities) {
            System.out.println(ticketEntity);
        }
    }
}
