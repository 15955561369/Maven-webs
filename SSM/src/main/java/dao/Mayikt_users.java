package dao;

import entity.UserEntity;

import java.util.List;

/**
 * 数据库访问层
 * @表 mayikt_users的代理接口
 */
public interface Mayikt_users {
    //查询所有用户
    List<UserEntity> getUsers();
    //查询单个用户
    UserEntity findById(Integer id);
    //新增用户
    int insertUser(UserEntity user);
    //修改用户
    int updateUser(UserEntity user);
    //删除用户
    int deleteUser(Integer id);
}
