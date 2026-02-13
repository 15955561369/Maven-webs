package controller;

import entity.MemberEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
* 请求数据Json
* */
@Controller
@RequestMapping("/json")
public class RequestJsonController {
    /**
     * 1.以实体类方式接收json
     * @接收参数加上@RequestBody标记，表示接收json数据。客户端以post方式在请求体中写入json数据。
     *
     */
    @RequestMapping("/entity")
    @ResponseBody
    public String receiveJson01(@RequestBody MemberEntity memberEntity){
        return memberEntity.toString();
    }
}
