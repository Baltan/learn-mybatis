package service;

import bean.Paging;
import com.github.pagehelper.Page;
import config.MyBatisSqlSessionFactory;
import mapper.PagingMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2020-03-18 18:12
 */
public class PagingService {
    public List<Paging> getPages1(int offset, int limit) {
        List<Paging> pagingList = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            PagingMapper mapper = sqlSession.getMapper(PagingMapper.class);
            pagingList = mapper.getPages1(offset, limit);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return pagingList;
    }

    public Page<Paging> getPages2(int offset, int limit) {
        Page<Paging> pagingList = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            PagingMapper mapper = sqlSession.getMapper(PagingMapper.class);
            pagingList = mapper.getPages2(new RowBounds(offset, limit));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return pagingList;
    }

    public Page<Paging> getPages3() {
        Page<Paging> page = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            PagingMapper mapper = sqlSession.getMapper(PagingMapper.class);
            page = mapper.getPages3();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return page;
    }
}
