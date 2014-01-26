package tim.blog.api.controller;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-26
 * Time: 下午3:24
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(value="login")
public class LoginController {
    @RequestMapping(value="dologin",method = RequestMethod.POST)
    public String dologin(HttpServletRequest request,HttpServletResponse response){
        if(request.getSession().getAttribute("username")==null||
                ((String)request.getSession().getAttribute("username")).equals(""))
        {
            request.getSession().setAttribute("username",request.getParameter("username"));
            System.out.println("111");
        }
        return "success";
    }
    @RequestMapping(value="dologout")
    public String dologin(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        System.out.println(session.getAttribute("username"));
        if(session != null)
            session.invalidate();
        return "success";
    }
}
