import com.restore.InvoiceCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBase {

    @Test
    public void testSingleItemSameCurrency() {
        InvoiceCalculator calculator = new InvoiceCalculator();
        calculator.addItem("Gold Bar", 100.0, "USD");

        double total = calculator.getTotal("USD");
        assertEquals(100.0, total, 0.001);
    }

    /**
     * Create a test that sets an exchange rate, adds an item in USD, then get the expected total in GBP
     */
    @Test
    public void testSingleItemWithConversionUSDToGBP() {
        // to be filled in
    }

    /**
     * What other tests do we need to cover all your features?
     */
}
