import java.util.*;

public class q1 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        // Q1 - Write a Java Program to print the sorted list of integers by using one of the collection set
        System.out.println("Q1 - Write a Java Program to print the sorted list of integers by using one of the collection set");

        System.out.println("Enter the list length : ");
        int n = scan.nextInt();

        Set<Integer> set = new TreeSet<>();
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++){
            set.add(scan.nextInt());
        }

        System.out.println("Output is : ");
        for(int ele : set){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
