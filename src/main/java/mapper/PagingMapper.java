package mapper;

import bean.Paging;
import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2020-03-18 18:06
 */
public interface PagingMapper {
    List<Paging> getPages1(int offset, int limit);

    Page<Paging> getPages2(RowBounds rowBounds);

    Page<Paging> getPages3();
}
