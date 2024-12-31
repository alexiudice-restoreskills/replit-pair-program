import com.restore.InvoiceCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBase {

    @Test
    public void testSingleItemSameCurrency() {
        InvoiceCalculator calculator = new InvoiceCalculator();
        calculator.addItem(100.0, "USD");

        double total = calculator.getTotal("USD");
        assertEquals(100.0, total, 0.001);
    }

    @Test
    public void testSingleItemWithConversionUSDToGBP() {
        // to be filled in
    }

    /**
     * Create a test that adds multiple items in different currencies and then verifies the calculator total when converted to EUR
     */
    @Test
    public void testMultipleItemsDifferentCurrenciesToEUR() {
        // to be filled in
    }

    /**
     * What other tests do you need to cover all your features?
     */
}
