package tim.blog.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-9
 * Time: 下午1:49
 * This is a demo.
 */
@Controller
//@RequestMapping(value="/test")
public class TestController {
    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value="name")String param){
        return "Hello,"+param;
    }
    @RequestMapping(value = "/hello2")
    public String hello2(){
        return "Hello";
    }
}
