package tim.blog.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    private static final Logger logger= LoggerFactory.getLogger(PageController.class);
    @Autowired
    private PageDao pageDao;
    @RequestMapping(value="/page",method= RequestMethod.GET)
    public List<Page> getAllPage(){
        return pageDao.getAllPage();
    }
}
