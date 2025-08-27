
import java.util.Scanner;

public class BitwiseAnd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND Operator\n");
        System.out.print("Please Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Second Number: ");
        int num2 = input.nextInt();

        int result = num1 & num2; // The input i take is 13 and 7 (1101 0111) = (0101) = 5                           
        System.out.println("Ihe Result is " + result);

    }
}
