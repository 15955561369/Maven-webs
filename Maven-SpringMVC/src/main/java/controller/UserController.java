package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//声明为控制器类
@RequestMapping("/user")//给本类中所有的URL添加前缀
public class UserController {
    @RequestMapping("/add")
    @ResponseBody//回复json数据
    public String addUser(){
        return "addUser ok";
    }

    @RequestMapping("/select")//映射URL不允许重复
    @ResponseBody
    public String selectUser(){
        return "selectUser ok";
    }
}
