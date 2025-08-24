public class Unaryoperator {
    public static void main(String[] args) {
        int a = 5;
        a += 4; //This is the Shorthand operator += , -= , *= , /= , %= ;
        System.out.println(a);
        
        a++; // This is the unary operator which incremet or derement the given value by 1;
         System.out.println(a);
          
        a--;
         System.out.println(a);
        ++a;
         System.out.println(a);

         int b = 30;
         System.out.println(b++); //post increment ;
         System.out.println(b);

         int c = 20;
         System.out.println(c--); //post decrement ;
         System.out.println(c);

         
    }
}