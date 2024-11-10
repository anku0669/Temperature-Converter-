import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();

        double temperature, convertedTemperature;

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F.");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = scanner.nextDouble();
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C.");
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }
}
