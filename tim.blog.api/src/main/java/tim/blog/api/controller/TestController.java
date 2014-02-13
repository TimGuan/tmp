package tim.blog.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tim.blog.api.model.DemoEntity;
import tim.blog.api.service.TestService;

import javax.annotation.Resources;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-9
 * Time: 下午1:49
 * This is a demo.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String param) {
        return "Hello," + param;
    }

    @RequestMapping(value = "/demo")
    public DemoEntity demo(@RequestParam(value = "name", required = false, defaultValue = "abc") String name) {
        DemoEntity demo = new DemoEntity();
        demo.setId(123);
        demo.setName(name);
        return demo;
    }

    @RequestMapping(value = "/hib")
    public List<DemoEntity> hib() {
        return testService.getDemos();
    }
}
