import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the degree:");
        System.out.println("1. celcius to fahrenheit");
        System.out.println("2. fahrenheit to celcius");
        System.out.println("3. kelvin to celcius");
        System.out.println("4. celcius to kelvin");
        System.out.println("5. fahrenheit to kelvin");
        System.out.println("6. kelvin to fahrenheit");
        System.out.print("Enter the number: ");
        Long a = input.nextLong();

        if (a == 1) {
            System.out.print("Enter the temperature in celcius: ");
            float b = input.nextFloat();
            float c = (b * 9 / 5) + 32;
            System.out.println("The given temperature is in fahrenheit is: " + c);
        } else if (a == 2) {
            System.out.print("Enter the temperature in fahrenheit: ");
            float b = input.nextFloat();
            float c = (b - 32) * 5 / 9;
            System.out.println("The given temperature is in celcius is: " + c);
        } else if (a == 3) {
            System.out.print("Enter the temperature in kelvin: ");
            double b = input.nextFloat();
            double c = (b - 273.15);
            System.out.println("The given temperature in celcius is: " + c);
        } else if (a == 4) {
            System.out.print("Enter the temperature in celcius: ");
            double b = input.nextFloat();
            double c = (b + 273.15);
            System.out.println("The given temperature in kelvin is: " + c);
        } else if (a == 5) {
            System.out.print("Enter the temperature in fahrenheit: ");
            double b = input.nextFloat();
            double c = (b - 32) * 5 / 9 + 273.15;
            System.out.println("The given temperature in kelvin is: " + c);
        } else if (a == 6) {
            System.out.print("Enter the temperature in kelvin: ");
            double b = input.nextFloat();
            double c = (b - 273.15) * 9 / 5 + 32;
            System.out.println("The given temperature in fahrenheit is: " + c);
        } else {
            System.out.println("Wrong Input");
        }
    }
}
