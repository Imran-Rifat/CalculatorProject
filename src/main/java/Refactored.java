import java.util.Scanner;

public class Refactored {
    private static final double FAHRENHEIT_TO_CELSIUS_RATIO = 5.0 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT_RATIO = 9.0 / 5.0;
    private static final double FAHRENHEIT_OFFSET = 32.0;
    private static final double KELVIN_OFFSET = 273.15;

    private static final int CELSIUS_TO_FAHRENHEIT_CHOICE = 1;
    private static final int FAHRENHEIT_TO_CELSIUS_CHOICE = 2;
    private static final int CELSIUS_TO_KELVIN_CHOICE = 3;
    private static final int EXIT_CHOICE = 4;

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * CELSIUS_TO_FAHRENHEIT_RATIO + FAHRENHEIT_OFFSET;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET) * FAHRENHEIT_TO_CELSIUS_RATIO;
    }

    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + KELVIN_OFFSET;
    }

    public static void displayMenu() {
        System.out.println("\nTemperature Conversion Menu:");
        System.out.println(CELSIUS_TO_FAHRENHEIT_CHOICE + ") Convert Celsius to Fahrenheit");
        System.out.println(FAHRENHEIT_TO_CELSIUS_CHOICE + ") Convert Fahrenheit to Celsius");
        System.out.println(CELSIUS_TO_KELVIN_CHOICE + ") Convert Celsius to Kelvin");
        System.out.println(EXIT_CHOICE + ") Exit");
        System.out.print("Please enter your choice (1-4): ");
    }

    private static double getTemperatureInput(Scanner scanner, String unit) {
        System.out.print("Enter temperature in " + unit + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number: ");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }

    private static void displayConversionResult(double result) {
        System.out.printf("Conversion result: %.2f%n", result);
    }

    private static void performConversion(Scanner scanner, int userChoice) {
        double inputTemperature;
        double result;

        switch (userChoice) {
            case CELSIUS_TO_FAHRENHEIT_CHOICE:
                inputTemperature = getTemperatureInput(scanner, "Celsius");
                result = convertCelsiusToFahrenheit(inputTemperature);
                displayConversionResult(result);
                break;

            case FAHRENHEIT_TO_CELSIUS_CHOICE:
                inputTemperature = getTemperatureInput(scanner, "Fahrenheit");
                result = convertFahrenheitToCelsius(inputTemperature);
                displayConversionResult(result);
                break;

            case CELSIUS_TO_KELVIN_CHOICE:
                inputTemperature = getTemperatureInput(scanner, "Celsius");
                result = convertCelsiusToKelvin(inputTemperature);
                displayConversionResult(result);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Conversion Application!");

        while (true) {
            displayMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
                continue;
            }

            int userChoice = scanner.nextInt();

            if (userChoice == EXIT_CHOICE) {
                System.out.println("Thank you for using the Temperature Converter. Goodbye!");
                break;
            }

            if (userChoice >= CELSIUS_TO_FAHRENHEIT_CHOICE && userChoice <= CELSIUS_TO_KELVIN_CHOICE) {
                performConversion(scanner, userChoice);
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}