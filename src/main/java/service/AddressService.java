package service;

import bean.Address;
import config.MyBatisSqlSessionFactory;
import mapper.AddressMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-06 14:56
 */
public class AddressService {
    public List<Address> getAddressByCountryOrState1(String country, String state) {
        List<Address> addresses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);
            addresses = mapper.getAddressByCountryOrState1(country, state);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return addresses;
    }

    public List<Address> getAddressByCountryOrState2(String country, String state) {
        List<Address> addresses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);
            addresses = mapper.getAddressByCountryOrState2(country, state);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return addresses;
    }

    public List<Address> getAddressByCountryOrState3(String country, String state) {
        List<Address> addresses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);
            addresses = mapper.getAddressByCountryOrState3(country, state);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return addresses;
    }

    public List<Address> getAddressByCountryOrState4(String country, String state) {
        List<Address> addresses = null;
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSqlSession();
        try {
            AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);
            addresses = mapper.getAddressByCountryOrState4(country, state);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return addresses;
    }
}
