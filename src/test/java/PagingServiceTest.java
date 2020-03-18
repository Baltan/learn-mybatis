import bean.Paging;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import service.PagingService;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2020-03-18 18:20
 */
public class PagingServiceTest {
    PagingService pagingService = new PagingService();

    @Test
    public void getPages1() {
        List<Paging> pagingList = pagingService.getPages1(3, 4);
        if (pagingList != null) {
            System.out.println(pagingList);
        }
    }

    @Test
    public void getPages2() {
        Page<Paging> pagingList = pagingService.getPages2(3, 2);
        if (pagingList != null) {
            pagingList.forEach(System.out::println);
        }
    }

    @Test
    public void getPages3() {
        PageHelper.startPage(2, 3);
        Page<Paging> pagingList = pagingService.getPages3();
        if (pagingList != null) {
            pagingList.forEach(System.out::println);
        }

//        PageInfo<Paging> pageInfo = new PageInfo<>(pagingList);
//        if (pageInfo != null) {
//            System.out.println(pageInfo.);
//        }
    }
}
