package com.hacker.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 赵静超
 * @date : 2020/1/27
 * @description :
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getServerPort(){
        return "order微服务的端口号: "+this.port;
    }
}
