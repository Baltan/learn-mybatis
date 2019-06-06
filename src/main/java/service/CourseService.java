package service;

import bean.Course;
import config.MyBatisSqlSessionFactory;
import mapper.CourseMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-04 17:19
 */
public class CourseService {
    public List<Course> searchCourses1(Map<String, Object> map) {
        List<Course> courses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            courses = mapper.searchCourses1(map);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return courses;
    }

    public List<Course> searchCourses2(Map<String, Object> map) {
        List<Course> courses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            courses = mapper.searchCourses2(map);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return courses;
    }

    public List<Course> searchCourses3(Map<String, Object> map) {
        List<Course> courses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            courses = mapper.searchCourses3(map);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return courses;
    }

    public List<Course> searchCourses4(Map<String, Object> map) {
        List<Course> courses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            courses = mapper.searchCourses4(map);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return courses;
    }

    public List<Course> searchCourses5(Map<String, Object> map) {
        List<Course> courses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            courses = mapper.searchCourses5(map);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return courses;
    }

    public int updateCourse(Map<String, Object> map) {
        int recordsNum = 0;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            recordsNum = mapper.updateCourse(map);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return recordsNum;
    }
}
