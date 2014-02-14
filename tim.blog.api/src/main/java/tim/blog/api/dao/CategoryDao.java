package tim.blog.api.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.stereotype.Repository;
import tim.blog.api.model.Category;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: guankaiqiang
 * Date: 14-2-13
 * Time: 下午11:58
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class CategoryDao extends BaseDao {
    public List<Category> getAllCategory() {
        Criteria criteria = getSession().createCriteria(Category.class);
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        List<Category> result = criteria.list();
        return result;
    }
}
