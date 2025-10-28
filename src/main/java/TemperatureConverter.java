public class TemperatureConverter {

        // 1. Convert Fahrenheit to Celsius
        public double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5.0 / 9.0;
        }

        // 2. Convert Celsius to Fahrenheit
        public double celsiusToFahrenheit(double celsius) {
            return (celsius * 9.0 / 5.0) + 32.0;
        }

        // 3. Convert Celsius to Kelvin
        public double celsiusToKelvin(double celsius) {
            return celsius + 273.15;
        }

        // Optional: main method to test all conversions
        public static void main(String[] args) {
            TemperatureConverter converter = new TemperatureConverter();

            double f = 98.6;
            double c = 25.0;

            System.out.println(f + "°F = " + converter.fahrenheitToCelsius(f) + "°C");
            System.out.println(c + "°C = " + converter.celsiusToFahrenheit(c) + "°F");
            System.out.println(c + "°C = " + converter.celsiusToKelvin(c) + "K");
        }
    }
