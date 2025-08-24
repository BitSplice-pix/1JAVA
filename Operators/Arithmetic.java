
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Calculator!\n");
        System.out.print("Please enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Please enter the value of b: ");
        int b = input.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Addition is = " + sum + "\nSubtraction is = " + sub + "\nMultiplication is = " + mul
                + "\nDvision is = " + div + "\nModulus is = " + mod);

        double x = 5;
        double y = 3;

        System.out.println("The add is : " + (x + y));
        System.out.println("The subtraction is : " + (x - y));
        System.out.println("The multiplication is : " + (x * y));
        System.out.println("The Division is : " + (x / y));
        System.out.println("The Modulud is : " + (x % y));
    }
}
