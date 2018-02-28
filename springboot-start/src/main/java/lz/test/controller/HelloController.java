package lz.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 万二(Zheng Liu)
 * @date 2018/02/08
 */
@RestController
public class HelloController {

    @Resource
    private String helloMsg;

    @RequestMapping("/hello.do")
    public String hello(String name) {
        return helloMsg + ", " + name;
    }
}
