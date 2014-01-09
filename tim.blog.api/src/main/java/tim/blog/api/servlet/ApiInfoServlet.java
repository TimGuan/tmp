package tim.blog.api.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-1-9
 * Time: 上午10:57
 * api info,format as xml
 */
@WebServlet("/apiInfo")
public class ApiInfoServlet extends HttpServlet{
    private static final long   serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().write("api info".getBytes(Charset.forName("utf-8")));
        resp.getOutputStream().close();
    }
}
