package tim.blog.api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import tim.blog.api.model.Demo;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-9
 * Time: 下午1:49
 * This is a demo.
 */
@Controller
@RequestMapping(value="/resolver")
public class TestViewResolver {
    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        ModelAndView view=new ModelAndView();
        Demo demo=new Demo();
        demo.setName("name");
        demo.setId(123);
        view.addObject("message",demo);
        view.setViewName("index");
        return view;
    }
}
