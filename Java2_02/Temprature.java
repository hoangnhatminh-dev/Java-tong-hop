package Java2_02;
import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        int total = 0;

        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter the temp for days " + (i+1) + ": ");
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i ++){
            total = total + arr[i];
        }

        int average = total / arr.length;

        System.out.println("The average is: " + average);
    }
}
