package mapper;

import bean.Department;

import java.util.List;

public interface DepartmentMapper {
    int insertDepartment(Department department);

    Department getDepartmentById(int did);

    List<Department> getAllDepartments();
}