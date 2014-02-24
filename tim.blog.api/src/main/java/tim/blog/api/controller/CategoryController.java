package tim.blog.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tim.blog.api.dao.CategoryDao;
import tim.blog.api.model.Category;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: guankaiqiang
 * Date: 14-2-13
 * Time: 上午12:22
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class CategoryController {
    private static final Logger logger= LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private CategoryDao categoryDao;
    @RequestMapping(value="/category",method = RequestMethod.GET)
    public List<Category> getAllCategory(){
        return categoryDao.getAllCategory();
    }
}
