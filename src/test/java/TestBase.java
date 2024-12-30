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

    @Test
    public void testMultipleItemsDifferentCurrenciesToEUR() {
        // to be filled in
    }
}
