package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/add")//默认情况下能够接收get、post请求
    @ResponseBody
    public String addOrder(Integer id,String name){//请求参数
        System.out.println(id+" "+name);
        return "addOrder--ok";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)//设置只接收post请求
    @ResponseBody
    public String deleteOrderPost(Integer id,String name){
        System.out.println(id+" "+name);
        return "deleteOrder--post--ok";
    }
}
