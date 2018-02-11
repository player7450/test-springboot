package lz.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 万二(Zheng Liu)
 * @date 2018/02/08
 */
@RestController
public class HelloController {

    @RequestMapping("/hello.do")
    public String hello(String name) {
        return "hello, " + name;
    }
}
