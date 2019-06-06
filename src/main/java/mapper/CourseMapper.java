package mapper;

import bean.Course;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-04 17:17
 */
public interface CourseMapper {
    List<Course> searchCourses1(Map<String, Object> map);

    List<Course> searchCourses2(Map<String, Object> map);

    List<Course> searchCourses3(Map<String, Object> map);

    List<Course> searchCourses4(Map<String, Object> map);

    List<Course> searchCourses5(Map<String, Object> map);

    int updateCourse(Map<String, Object> map);
}
