import org.junit.Test;
import service.CourseEnrollmentService;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-06 15:38
 */
public class CourseEnrollmentTest {
    CourseEnrollmentService courseEnrollmentService = new CourseEnrollmentService();

    @Test
    public void testGetStudentIdByCourseId1() {
        List<Integer> ids = courseEnrollmentService.getStudentIdByCourseId1();
        if (ids != null) {
            System.out.println(ids);
        }
    }

    @Test
    public void testGetStudentIdByCourseId2() {
        List<Integer> ids = courseEnrollmentService.getStudentIdByCourseId2();
        if (ids != null) {
            System.out.println(ids);
        }
    }

    @Test
    public void testGetStudentIdByCourseId3() {
        List<Integer> ids = courseEnrollmentService.getStudentIdByCourseId3();
        if (ids != null) {
            System.out.println(ids);
        }
    }

    @Test
    public void testGetStudentIdByCourseId4() {
        List<Integer> ids = courseEnrollmentService.getStudentIdByCourseId4();
        if (ids != null) {
            System.out.println(ids);
        }
    }
}
