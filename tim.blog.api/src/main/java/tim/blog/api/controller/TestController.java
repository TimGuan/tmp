package tim.blog.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tim.blog.api.model.Demo;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-9
 * Time: 下午1:49
 * This is a demo.
 */
@RestController
@RequestMapping(value="/test")
public class TestController {
    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value="name")String param){
        return "Hello,"+param;
    }
    @RequestMapping(value = "/demo")
    public Demo demo(@RequestParam(value="name",required=false,defaultValue = "abc")String name){
        Demo demo=new Demo();
        demo.setId(123);
        demo.setName(name);
        return demo;
    }
}
