package tim.blog.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tim.blog.api.model.DemoEntity;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-9
 * Time: 下午1:49
 * This is a demo.
 */
@Controller
@RequestMapping(value = "/resolver")
public class TestViewResolver {
    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        ModelAndView view = new ModelAndView();
        DemoEntity demo = new DemoEntity();
        demo.setName("name");
        demo.setId(123);
        view.addObject("message", demo);
        view.setViewName("index");
        return view;
    }
}
