package com.qjs.example.springbootdemoconsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianjiasong
 * @date 2019/1/24
 */
@RestController
public class ConsumeController {

    @Autowired
    ServiceFeignClient serviceAFeignClient;

    @RequestMapping("/hello")
    public String hi(@RequestParam String q) {
        return serviceAFeignClient.hello(q);
    }


}
