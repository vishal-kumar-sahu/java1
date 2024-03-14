import java.util.*;

public class q2_throw {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        // Q2 - Write a Java program to throw arithmetic exception using "throw" and "throws"
        System.out.println("Q2 - Write a Java program to throw arithmetic exception using \"throw\" and \"throws\"");

        System.out.println("Enter a positive integer : ");
        int num = scan.nextInt();

        if(num <= 0){
            throw new ArithmeticException("Entered number is not a positive integer");
        }

        System.out.println("Entered number is : " + num);

    }
}
