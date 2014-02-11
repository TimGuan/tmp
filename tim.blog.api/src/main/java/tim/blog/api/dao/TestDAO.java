package tim.blog.api.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.springframework.stereotype.Repository;
import java.util.List;
import tim.blog.api.model.DemoEntity;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-2-11
 * Time: 上午10:56
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class TestDao extends BaseDao {
    public List<DemoEntity> getDemos() {
        Criteria criteria = getSession().createCriteria(DemoEntity.class);
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        List<DemoEntity> result = criteria.list();
        return result;
    }
}
