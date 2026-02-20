package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * 测试捕获全局异常
     * @return
     */
    @RequestMapping("/exception")
    public String exception(){
        int j=1/0;
        return j+"";
    }
}
