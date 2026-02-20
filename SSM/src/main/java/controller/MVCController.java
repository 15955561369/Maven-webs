package controller;

import entity.UserEntity;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

/**
 * 控制器层
 */
@RestController
public class MVCController {
    UserService userService=new UserService();


    /**
     * 查询所有用户
     * @return 列表List
     */
    @GetMapping("/users")//restful接口风格
    public List<UserEntity> getUsers(){
        return userService.getUsers();
    }

    /**
     * 查询单个用户
     * @param id
     * @return UserEntity
     */
    @GetMapping("/users/{id}")
    public UserEntity findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    /**
     * 新增用户
     * @param userEntity
     * @return 受影响行数
     */
    @PostMapping("/users")
    public int insertUser(@RequestBody UserEntity userEntity){
        return userService.insertUser(userEntity);
    }

    /**
     * 修改用户
     * @param userEntity
     * @return 受影响行数
     */
    @PutMapping("/users")
    public int updateUser(@RequestBody UserEntity userEntity){
        return userService.updateUser(userEntity);
    }

    /**
     * 删除用户
     * @param id
     * @return 受影响行数
     */
    @DeleteMapping("/users/{id}")
    public int deleteUser(@PathVariable("id") Integer id){
        return userService.deleteUser(id);
    }
}
