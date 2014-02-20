package tim.blog.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tim.blog.api.model.DemoEntity;
import tim.blog.api.service.TestService;
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
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    TestService testService;

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String param) {
        logger.info(String.format("abc%s%s","a",param));
        return "Hello," + param;
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public DemoEntity demo(@RequestParam(value = "name", required = false, defaultValue = "abc") String name) {
        DemoEntity demo = new DemoEntity();
        demo.setId(123);
        demo.setName(name);
        return demo;
    }

    @RequestMapping(value = "/demo", method = {RequestMethod.POST, RequestMethod.PUT})
    public void demo(@ModelAttribute DemoEntity demo) {
        System.out.println(demo != null ? demo.getName() : "");
    }

    @RequestMapping(value = "/hib")
    public List<DemoEntity> hib() {
        return testService.getDemos();
    }
}
