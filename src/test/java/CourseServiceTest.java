import bean.Course;
import org.junit.Test;
import service.CourseService;

import java.util.*;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-04 17:22
 */
public class CourseServiceTest {
    CourseService courseService = new CourseService();

    @Test
    public void testSearchCourses1() {
        Map<String, Object> map = new HashMap<>();
        map.put("tutorId", 1);
        map.put("courseName", "%java%");
        map.put("startDate", new Date());
        List<Course> courses = courseService.searchCourses1(map);
        if (courses != null) {
            System.out.println(courses);
        }
    }

    @Test
    public void testSearchCourses2() {
        Map<String, Object> map = new HashMap<>();
        map.put("tutorId", 1);
        map.put("courseName", "%java%");
        map.put("startDate", new Date());
        map.put("searchBy", "Tutor");
        List<Course> courses = courseService.searchCourses2(map);
        if (courses != null) {
            System.out.println(courses);
        }
    }

    @Test
    public void testSearchCourses3() {
        Map<String, Object> map = new HashMap<>();
        map.put("tutorId", 1);
        map.put("courseName", "%java%");
        map.put("startDate", new Date());
        List<Course> courses = courseService.searchCourses3(map);
        if (courses != null) {
            System.out.println(courses);
        }
    }

    @Test
    public void testSearchCourses4() {
        Map<String, Object> map = new HashMap<>();
        map.put("tutorId", 1);
        map.put("courseName", "%java%");
        List<Course> courses = courseService.searchCourses4(map);
        if (courses != null) {
            System.out.println(courses);
        }
    }

    @Test
    public void testSearchCourses5() {
        Map<String, Object> map = new HashMap<>();
        map.put("tutorIds", Arrays.asList(1, 2, 3));
        List<Course> courses = courseService.searchCourses5(map);
        if (courses != null) {
            System.out.println(courses);
        }
    }

    @Test
    public void updateCourse() {
        Map<String, Object> map = new HashMap<>();
        map.put("tutorId", 2);
        map.put("endDate", new Date());
        map.put("id", 2);
        int recordsNum = courseService.updateCourse(map);
        System.out.println(recordsNum);
    }
}
