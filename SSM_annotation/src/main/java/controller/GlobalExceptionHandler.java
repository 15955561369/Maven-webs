package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> handleException(Exception e){
        System.out.println("系统出现异常："+e);
        Map<String,Object> map = new HashMap<>();
        map.put("code",500);
        map.put("msg","出现异常："+e.getMessage());
        return map;
    }
}
