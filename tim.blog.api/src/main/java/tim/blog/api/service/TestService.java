package tim.blog.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tim.blog.api.dao.TestDao;
import tim.blog.api.model.DemoEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kaiqiang.guan
 * Date: 14-2-11
 * Time: 上午10:51
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class TestService {
    @Autowired
    private TestDao testDao;

    public List<DemoEntity> getDemos() {
        return testDao.getDemos();
    }
}
