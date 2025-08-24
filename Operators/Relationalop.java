
import java.util.Scanner;

public class Relationalop{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("\nWELCOME TO LICENSE PORTAL\n");
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("Your Eligible to Apply for License");
        } else {
            System.out.println("Beta Cycle Chalao");
        }

        
    }
}