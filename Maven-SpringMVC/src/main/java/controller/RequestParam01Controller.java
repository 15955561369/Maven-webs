package controller;

import entity.MemberEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/*
* 四种请求参数 非常简单
* 1.普通参数
* 2.对象（嵌套对象）类型
* 3.数组类型
* 4.集合类型
* */
@Controller
@RequestMapping("/param")
public class RequestParam01Controller {
    //1.普通参数
    @RequestMapping("/addmember")
    @ResponseBody
    //如果传递参数和形参不同，可以用@RequestParam进行绑定
    public String addMember(@RequestParam(name ="id") String memberId,//如果进行了RequestParam，默认情况下required为true，即必须传递相应参数，否则会报错
                            @RequestParam(name ="name",required = false) String memberName){
        System.out.println(memberId+" "+memberName);
        return "addMember--ok";
    }
    //2.对象（嵌套对象）类型，地址栏参数为对象的属性名
    @RequestMapping("/entity")
    @ResponseBody
    public String add(MemberEntity memberEntity) {
        return memberEntity.toString();
    }
    //3.数组类型
    @RequestMapping("/arrays")
    @ResponseBody
    public String array(String[] arrays){
        return Arrays.toString(arrays);
    }
    //4.集合类型，和数组类似，不过需要加上@RequestParam注解
    @RequestMapping("/list01")
    @ResponseBody
    public String list(@RequestParam List<String> list){
        return list.toString();
    }
}
