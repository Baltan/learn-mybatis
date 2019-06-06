package mapper;

import bean.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-06 14:50
 */
public interface AddressMapper {
    List<Address> getAddressByCountryOrState1(String country, String state);

    List<Address> getAddressByCountryOrState2(String country, String state);

    List<Address> getAddressByCountryOrState3(String country, String state);

    List<Address> getAddressByCountryOrState4(@Param("country") String country, @Param("state") String state);
}
