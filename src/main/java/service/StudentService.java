package service;

import bean.Student;
import config.MyBatisSqlSessionFactory;
import mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-03 17:34
 */
public class StudentService {
    public Student getStudentById(int id) {
        Student student = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();

        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            student = mapper.getStudentById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return student;
    }
}
