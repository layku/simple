package cn.layku.simple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongdingzhuo
 * @Title: TestController
 * @Package cn.layku.simple.controller
 * @Description: TODO
 * @date 2020/4/20 18:55
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public Object testReq(String name) {
        logger.info("[/test/hello]->{}", name);
        return "hello:" + name;
    }
}
