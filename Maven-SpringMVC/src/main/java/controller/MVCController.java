package controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller//表示SpringMVC的控制器
public class MVCController {

    @RequestMapping(value = "/gethello")//定义url映射
    @ResponseBody//返回json数据
    public String hello(){
        System.out.println("中文hello。。。");
        return "{\"code\":200,\"msg\":\"hello\"}";
    }
}
