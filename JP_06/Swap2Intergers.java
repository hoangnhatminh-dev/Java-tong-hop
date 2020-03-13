/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_06;
import java.util.Scanner;

/**
 *
 * @author rough
 */
public class Swap2Intergers {
    public static void main(String[] args) {
        int n1, n2, temp;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        n1 = in.nextInt();
        System.out.println("Enter 2nd number: ");
        n2 = in.nextInt();
        
        temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.println("1st number is: " + n1 + ". 2nd number is: " + n2);
    }
}
