import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");

        // Input temperature
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        // Input unit
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        double convertedTemperature;

        // Conversion logic
        if (unit == 'C') {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature + " °F");
        } else if (unit == 'F') {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + convertedTemperature + " °C");
        } else {
            System.out.println("Invalid unit. Please enter C or F.");
        }

        scanner.close();
    }
}