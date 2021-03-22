package com.wkcto.springcloud.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/service/hello")
    public String hello(){
        //业务处理
        return "hello,srping cloud";
    }
}
