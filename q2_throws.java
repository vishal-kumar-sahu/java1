import java.util.*;

public class q2_throws {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        // Q2 - Write a Java program to throw arithmetic exception using "throw" and "throws"
        System.out.println("Q2 - Write a Java program to throw arithmetic exception using \"throw\" and \"throws\"");

        System.out.println("Enter numerator : ");
        int a = scan.nextInt();

        System.out.println("Enter denominator : ");
        int b = scan.nextInt();

        divide(a, b);

    }
    public static void divide(int numerator, int denominator) throws ArithmeticException{
        try {
            System.out.println(numerator / denominator);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
