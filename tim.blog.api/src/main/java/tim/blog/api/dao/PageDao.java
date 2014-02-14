package tim.blog.api.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.stereotype.Repository;
import tim.blog.api.model.Category;
import tim.blog.api.model.Page;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-2-14
 * Time: 下午1:56
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class PageDao extends BaseDao{
    public List<Page> getAllPage() {
        Criteria criteria = getSession().createCriteria(Page.class);
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        List<Page> result = criteria.list();
        return result;
    }
}
