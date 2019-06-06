package service;

import bean.Tutor;
import config.MyBatisSqlSessionFactory;
import mapper.TutorMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-04 14:43
 */
public class TutorService {
    public Tutor getTutorById(int id) {
        Tutor tutor = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();

        try {
            TutorMapper mapper = sqlSession.getMapper(TutorMapper.class);
            tutor = mapper.getTutorById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return tutor;
    }
}
