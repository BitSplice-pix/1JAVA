
import java.util.Scanner;

public class Logicalop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO TICKET DISCOUNT COUNTER");
        System.out.println("Please Enter your Age: ");
        int age = input.nextInt();
        System.out.println("Are You A Female? (True/False) ");
        boolean isFemale = input.nextBoolean();

        if(age < 5){
            System.out.println("You Got 75% Discount");
        } else if (isFemale){
            System.out.println("You Got 50% Discount");
        } else if (age > 60 && !isFemale){
            System.out.println("You Got 25% Discount");
        } else {
            System.out.println("You Got No Discount");
        }

    }
}