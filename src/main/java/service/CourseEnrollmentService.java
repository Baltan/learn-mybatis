package service;

import config.MyBatisSqlSessionFactory;
import mapper.CourseEnrollmentMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-06 15:36
 */
public class CourseEnrollmentService {
    public List<Integer> getStudentIdByCourseId1() {
        List<Integer> ids = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseEnrollmentMapper mapper = sqlSession.getMapper(CourseEnrollmentMapper.class);
            ids = mapper.getStudentIdByCourseId1();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return ids;
    }

    public List<Integer> getStudentIdByCourseId2() {
        List<Integer> ids = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseEnrollmentMapper mapper = sqlSession.getMapper(CourseEnrollmentMapper.class);
            ids = mapper.getStudentIdByCourseId2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return ids;
    }

    public List<Integer> getStudentIdByCourseId3() {
        List<Integer> ids = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseEnrollmentMapper mapper = sqlSession.getMapper(CourseEnrollmentMapper.class);
            ids = mapper.getStudentIdByCourseId3();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return ids;
    }

    public List<Integer> getStudentIdByCourseId4() {
        List<Integer> ids = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseEnrollmentMapper mapper = sqlSession.getMapper(CourseEnrollmentMapper.class);
            ids = mapper.getStudentIdByCourseId4();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return ids;
    }
}
