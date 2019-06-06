import bean.Address;
import org.junit.Test;
import service.AddressService;

import java.util.List;

/**
 * Description:
 *
 * @author Baltan
 * @date 2019-06-06 14:58
 */
public class AddressServiceTest {
    AddressService addressService = new AddressService();

    @Test
    public void testGetAddressByCountryOrState1() {
        String country = "Allen";
        String state = "CA";
        List<Address> addresses = addressService.getAddressByCountryOrState1(country, state);
        if (addresses != null) {
            System.out.println(addresses);
        }
    }

    @Test
    public void testGetAddressByCountryOrState2() {
        String country = "Allen";
        String state = "CA";
        List<Address> addresses = addressService.getAddressByCountryOrState2(country, state);
        if (addresses != null) {
            System.out.println(addresses);
        }
    }

    @Test
    public void testGetAddressByCountryOrState3() {
        String country = "Allen";
        String state = "CA";
        List<Address> addresses = addressService.getAddressByCountryOrState3(country, state);
        if (addresses != null) {
            System.out.println(addresses);
        }
    }

    @Test
    public void testGetAddressByCountryOrState4() {
        String country = "Allen";
        String state = "CA";
        List<Address> addresses = addressService.getAddressByCountryOrState4(country, state);
        if (addresses != null) {
            System.out.println(addresses);
        }
    }
}
