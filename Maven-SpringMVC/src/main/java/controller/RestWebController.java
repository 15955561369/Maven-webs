package controller;

import entity.MemberEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//该注解能够自动实现@Controller注解和所有方法的@ResponseBody注解
@RequestMapping("response")
public class RestWebController {
    @RequestMapping("json")
    public MemberEntity responseJson(){
        return new MemberEntity("zzy","123");//返回类型自动解析为json数据
    }
}
