package com.qjs.example.springbootdemoconsume;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qianjiasong
 * @date 2019/1/24
 */
@Component
@FeignClient(value = "springboot-demo-provider")
public interface ServiceFeignClient {

    @RequestMapping(value = "/hello/test2")
    String hello(@RequestParam("q") String id);
}
