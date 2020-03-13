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
public class SumProductMinMax3 {
    public static void main(String[] args) {
        int n1, n2, n3, sum, product, min, max;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        n1 = in.nextInt();
        System.out.println("Enter 2nd number: ");
        n2 = in.nextInt();
        System.out.println("Enter 3rd number: ");
        n3 = in.nextInt();
        
        sum = n1 + n2 + n3;
        System.out.println("The sum is: " + sum);
        
        product = n1 * n2 * n3;
        System.out.println("The product is: " + product);
        
        min = n1;
        if(n2 < min){
            min = n2;
        }
        if(n3 < min){
            min = n3;
        }
        System.out.println("The min is: " + min);
        max = n3;
        if(n2 > max){
            max = n2;
        }
        if(n1 > max){
            max = n1;
        }
        System.out.println("The max is: " + max);
    }
}
