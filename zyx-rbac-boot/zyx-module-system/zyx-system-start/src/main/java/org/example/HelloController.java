package org.example;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello,World!";
    }
}
/**
 * 功能描述
 *
 * @author: scott
 * @date: 2023年07月06日 10:54
 */