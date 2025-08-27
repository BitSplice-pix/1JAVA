
import java.util.Scanner;

public class BitwiseLeftshift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Left Shift Operator\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();

        int result = num << 4;                   
        System.out.println("Ihe Result is " + result);

    }
}
