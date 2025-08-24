public class IfelseLadder {
    public static void main(String[] args) {
        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

        if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        } else if (isAnAdult){
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello child");
        }
    }
}