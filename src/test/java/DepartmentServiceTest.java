import bean.Department;
import org.junit.Test;
import service.DepartmentService;

import java.util.List;

public class DepartmentServiceTest {

    DepartmentService deptService = new DepartmentService();


    @Test
    public void testCreateDepartment() {
        Department department = new Department("研发部", "XX 路 YY 号", "010-55551234");
        deptService.createDepartment(department);
    }

    @Test
    public void testGetDepartmentById() {
        int did = 1001;
        Department department = deptService.getDepartmentById(did);
        if (department != null) {
            System.out.println(department);
        }
    }

    @Test
    public void testGetAllDepartments() {
        List<Department> departments = deptService.getAllDepartments();
        if (departments != null) {
            System.out.println(departments);
        }
    }
}