
import java.util.Scanner;

public class BitwiseNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Not/Compliment Operator\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();

        int result = ~num;                   
        System.out.println("Ihe Result is " + result);

    }
}
