package bean;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-06 15:23
 */
public class CourseEnrollment {
    private int courseId;
    private int studentId;

    public CourseEnrollment() {
    }

    public CourseEnrollment(int courseId, int studentId) {
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "CourseEnrollment{" +
                "courseId=" + courseId +
                ", studentId=" + studentId +
                '}';
    }
}
