import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RefactoredTest {

    @Test
    public void testConvertCelsiusToFahrenheit() {
        assertEquals(32.0, Refactored.convertCelsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, Refactored.convertCelsiusToFahrenheit(100), 0.01);
        assertEquals(-40.0, Refactored.convertCelsiusToFahrenheit(-40), 0.01);
    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        assertEquals(0.0, Refactored.convertFahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, Refactored.convertFahrenheitToCelsius(212), 0.01);
        assertEquals(-40.0, Refactored.convertFahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testConvertCelsiusToKelvin() {
        assertEquals(273.15, Refactored.convertCelsiusToKelvin(0), 0.01);
        assertEquals(373.15, Refactored.convertCelsiusToKelvin(100), 0.01);
        assertEquals(233.15, Refactored.convertCelsiusToKelvin(-40), 0.01);
    }
}
