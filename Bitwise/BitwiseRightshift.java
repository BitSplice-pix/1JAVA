
import java.util.Scanner;

public class BitwiseRightshift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Right Shift Operator\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();

        int result = num >> 1;                   
        System.out.println("Ihe Result is " + result);

    }
}
