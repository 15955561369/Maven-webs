package dao;

import entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 数据库访问层
 * @表 mayikt_users的代理接口
 */
public interface Mayikt_users {
    //查询所有用户
    @Select("select * from mayikt_users")
    List<UserEntity> getUsers();
    //查询单个用户
    @Select("select * from mayikt_users where id=#{id}")
    UserEntity findById(Integer id);
    //新增用户
    @Insert("INSERT INTO `ssm`.`mayikt_users` (`id`, `name`, `age`, `addres`) VALUES (null,#{name},#{age},#{addres})")
    int insertUser(UserEntity user);
    //修改用户
    @Update("UPDATE `ssm`.`mayikt_users` SET `name` = #{name}, `age` = #{age}, `addres` = #{addres} WHERE `id` = #{id}")
    int updateUser(UserEntity user);
    //删除用户
    @Delete("delete from mayikt_users where id=#{id}")
    int deleteUser(Integer id);
}
