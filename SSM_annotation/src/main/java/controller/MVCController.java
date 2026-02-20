package controller;

import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 控制器层
 */
@RestController
public class MVCController {
    @Autowired
    private UserService userService;

    /**
     * 定义接口返回规范
     * @param code 状态码
     * @param msg 信息
     * @param data 返回的数据
     * @return Map
     */
    public Map<String,Object> setResult(Integer code, String msg, Object data){
        Map<String,Object> result=new HashMap<>();
        result.put("code",code);
        result.put("msg",msg);
        result.put("data",data);
        return result;
    }

    /**
     * 查询所有用户
     * @return 列表List
     */
    @GetMapping("/users")//restful接口风格
    public Map<String,Object> getUsers(){
        List<UserEntity> users=userService.getUsers();
        return users.size()>0?setResult(200,"ok",users)
                :setResult(500,"have no users",null);
    }

    /**
     * 查询单个用户
     * @param id
     * @return UserEntity
     */
    @GetMapping("/users/{id}")
    public Map<String,Object> findById(@PathVariable("id") Integer id){
        if(id==null){
            return  setResult(500,"id is null",null);
        }
        UserEntity user=userService.findById(id);
        if(user==null){
            return  setResult(500,"the user is not existed",null);
        }
        return setResult(200,"success",userService.findById(id)) ;
    }

    /**
     * 新增用户
     * @param userEntity
     * @return 受影响行数
     */
    @PostMapping("/users")
    public Map<String,Object> insertUser(@RequestBody UserEntity userEntity){
        return userService.insertUser(userEntity)>0?setResult(200,"insert success",null)
                :setResult(500,"insert failed",null);
    }

    /**
     * 修改用户
     * @param userEntity
     * @return 受影响行数
     */
    @PutMapping("/users")
    public Map<String,Object> updateUser(@RequestBody UserEntity userEntity){
        return userService.updateUser(userEntity)>0?setResult(200,"update success",null)
                :setResult(500,"update failed",null);
    }

    /**
     * 删除用户
     * @param id
     * @return 受影响行数
     */
    @DeleteMapping("/users/{id}")
    public Map<String,Object> deleteUser(@PathVariable("id") Integer id){
        return userService.deleteUser(id)>0?setResult(200,"delete success",null)
                :setResult(500,"delete failed",null);
    }
}
