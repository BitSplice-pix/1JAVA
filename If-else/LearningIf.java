public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "BOB" ;

        System.out.println("Before if");

        if (isMale) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Ms. " + name);
        }
        System.out.println("After if");
    }
}