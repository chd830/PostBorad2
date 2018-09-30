package ac.dankook.postboard.repository;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {
    @Autowired
    private SqlSession sqlSession;
    static final Logger LOGGER = LoggerFactory.getLogger(TestRepositoryImpl.class);
    public void testMybatisRepository() {
        LOGGER.debug("TestRepositoryImpl");
        sqlSession.selectOne("testMapper.insertTestData");
    }
}
