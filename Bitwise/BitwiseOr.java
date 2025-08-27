
import java.util.Scanner;

public class BitwiseOr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR Operator\n");
        System.out.print("Please Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Second Number: ");
        int num2 = input.nextInt();

        int result = num1 | num2;                   
        System.out.println("Ihe Result is " + result);

    }
}
