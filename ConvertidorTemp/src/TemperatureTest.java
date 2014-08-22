import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class TemperatureTest {
    @Test
    public void testCelciusTo() throws Exception {

        Temperature temperature = new Kelvin(0);
        double result = temperature.toCelcius();

        assertThat(result, CoreMatchers.is(-273.0));

    }

    @Test
    public void testConvertTo() {
        Temperature temperature = new Celsius(0);
        double resultTest = temperature.convertTo(UnitTemperature.KELVIN);
        double resultTest2 = temperature.convertTo(UnitTemperature.RANKINE);
        double resultTest3 = temperature.convertTo(UnitTemperature.FAHRENHEIT);
        assertThat(resultTest, CoreMatchers.is(273.0));
        assertThat(resultTest2, CoreMatchers.is(491.67));
        assertThat(resultTest3, CoreMatchers.is(32.0));
    }
}
