package tim.blog.api.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tim.blog.api.model.CategoryEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: guankaiqiang
 * Date: 14-2-13
 * Time: 下午11:58
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Transactional
public class CategoryDao extends BaseDao {
    public List<CategoryEntity> getAllCategory() {
        Criteria criteria = getSession().createCriteria(CategoryEntity.class);
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        List<CategoryEntity> result = criteria.list();
        return result;
    }
}
