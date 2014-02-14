package tim.blog.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tim.blog.api.dao.PageDao;
import tim.blog.api.model.Page;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-2-14
 * Time: 下午1:42
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class PageController {
    @Autowired
    private PageDao pageDao;
    @RequestMapping("/page")
    public List<Page> getAllPage(){
        return pageDao.getAllPage();
    }
}
