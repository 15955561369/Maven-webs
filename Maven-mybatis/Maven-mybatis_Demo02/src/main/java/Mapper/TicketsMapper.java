package Mapper;

import Entity.TicketEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketsMapper {
    //获取所有数据
    List<TicketEntity> getAllTickets();

    //根据Id查询
    TicketEntity getById(String id);

    //添加数据
    int addTicket(TicketEntity ticket);

    //删除数据
    int deleteById(String id);

    //更新数据
    int updateTicket(TicketEntity ticket);

    //@Param实现多条件查询
    List<TicketEntity> getByParams(@Param("departure_point") String departure_point
            , @Param("arrive_point") String arrive_point);

    //动态SQL语句
    List<TicketEntity> dynamicSQL(@Param("id") String id
            , @Param("departure_point") String departure_point
            , @Param("arrive_point") String arrive_point);
}
