package controller;

import entity.MemberEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestfulController {//使用restful接口风格

    /**
     * 查询User
     * @param id
     * @return
     */
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)//只接收GET方法
    public String getUser(@PathVariable("id") Integer id){//使用@PathVariable传入查询ID
        System.out.println("查询User：id="+id);
        return "select--ok";
    }

    /**
     * 添加User
     * @param memberEntity
     * @return
     */
    @PostMapping("/user")//该注解等价于@RequestMapping(value="/user",method = RequestMethod.POST)
    public String addUser(@RequestBody MemberEntity memberEntity){//传入json数据，用实体类接收
        System.out.println("添加用户:"+memberEntity.toString());
        return "insert--ok";
    }

    /**
     * 修改User
     * @param memberEntity
     * @return
     */
    @PutMapping("/user")//PUT请求方法
    public String updateUser(@RequestBody MemberEntity memberEntity){
        System.out.println("修改用户:"+memberEntity.toString());
        return "update--ok";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")//DELETE请求方法
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除User：id="+id);
        return "delete--ok";
    }
}
