package tim.blog.api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-9
 * Time: 下午1:49
 * This is a demo.
 */
@RestController
@RequestMapping(value = "/security")
public class TestSecurity {
    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String param) {
        return "Hello," + param;
    }
}
