import bean.Tutor;
import org.junit.Test;
import service.TutorService;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-04 14:47
 */
public class TutorServiceTest {
    TutorService tutorService = new TutorService();

    @Test
    public void testGetTutorById() {
        int id = 1;
        Tutor tutor = tutorService.getTutorById(id);
        if (tutor != null) {
            System.out.println(tutor);
        }
    }
}
