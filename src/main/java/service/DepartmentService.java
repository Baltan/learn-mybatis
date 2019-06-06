package service;

import bean.Department;
import config.MyBatisSqlSessionFactory;
import mapper.DepartmentMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DepartmentService {
    public int createDepartment(Department department) {
        int result = 0;
        /**
         * SqlSession 对象实例不是线程安全的，并且不被共享。
         * 每一个线程应该有它自己的 SqlSession 实例。
         * 所以 SqlSession 的作用域最好就是其所在方法的作用域。
         * 从 Web 应用程序角度上看，SqlSession 应该存在于 request 级别作用域上。
         */
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            DepartmentMapper deptMapper = sqlSession.getMapper(DepartmentMapper.class);
            result = deptMapper.insertDepartment(department);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return result;
    }

    public Department getDepartmentById(int did) {
        Department department = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            DepartmentMapper deptMapper = sqlSession.getMapper(DepartmentMapper.class);
            department = deptMapper.getDepartmentById(did);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return department;
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            DepartmentMapper deptMapper = sqlSession.getMapper(DepartmentMapper.class);
            departments = deptMapper.getAllDepartments();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return departments;
    }
}