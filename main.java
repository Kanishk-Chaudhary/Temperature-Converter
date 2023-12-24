import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the degree:");
        System.out.println("1. celcius to fahrenheit");
        System.out.println("2. fahrenheit to celcius");
        Long a = input.nextLong();
        if (a == 1) {
            System.out.print("Enter the tempreture in celcius : ");
            float c = input.nextFloat();
            float d = (c * 9 / 5) + 32;
            System.out.println("The given tempreture is in fahrenheit is : " + d);
        } else if (a == 2) {
            System.out.print("Enter the tempreture in fahrenheit: ");
            float e = input.nextFloat();
            float f = (e - 32) * 5 / 9;
            System.out.println("The given tempreture is in celcius is: " + f);
        } else {
            System.out.println("Enter Correct one");
        }
    }
}
