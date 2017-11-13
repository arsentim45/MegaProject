import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void getBalance() throws Exception {
        Customer customer = new Customer(200);
        assertThat("Wrong balance", 200, is(customer.getBalance()));
    }
}
