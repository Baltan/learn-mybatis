package mapper;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-06 15:20
 */
public interface CourseEnrollmentMapper {
    List<Integer> getStudentIdByCourseId1();

    List<Integer> getStudentIdByCourseId2();

    List<Integer> getStudentIdByCourseId3();

    List<Integer> getStudentIdByCourseId4();
}
