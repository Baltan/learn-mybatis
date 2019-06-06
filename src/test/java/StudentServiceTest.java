import bean.Student;
import org.junit.Test;
import service.StudentService;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-03 17:40
 */
public class StudentServiceTest {
    StudentService studentService = new StudentService();

    @Test
    public void testGetStudentById() {
        int id = 1;
        Student student = studentService.getStudentById(id);
        if (student != null) {
            System.out.println(student);
        }
    }
}
