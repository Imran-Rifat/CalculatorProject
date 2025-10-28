import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TemperatureConverterTest {
    @Test
    void testFahrenheitToCelsius(){
        TemperatureConverter temp = new TemperatureConverter();
        assertEquals(35.0 ,temp.fahrenheitToCelsius(95)) ;
    }
    @Test
    void testCelsiusToFahrenheit(){

        TemperatureConverter temp = new TemperatureConverter();
        assertEquals(95.0,temp.celsiusToFahrenheit(35)) ;
    }
    @Test
    void  testCelsiustoKelvin(){
        TemperatureConverter temp = new TemperatureConverter();
        assertEquals(298.15,temp.celsiusToKelvin(25));
    }
}
