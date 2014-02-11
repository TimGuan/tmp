package tim.blog.api.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-26
 * Time: 下午3:24
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(value = "login")
public class LoginController {
    /**
     * api不包含登入，授权j_spring_security_check,j_spring_security_logout
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "dologin", method = RequestMethod.POST)
    public String dologin(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        if (!StringUtils.isEmpty(session.getAttribute("username"))) {
            return "have logined";
        } else {
            session.setAttribute("username", request.getParameter("username"));
            return "success";
        }
    }

    @RequestMapping(value = "dologout")
    public String dologout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null)
            session.invalidate();
        return "success";
    }
}
