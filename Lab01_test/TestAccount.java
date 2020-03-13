/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01_test;

/**
 *
 * @author rough
 */
public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("C1", "Nguyen Van A");
        System.out.println(acc1.toString());
        System.out.println("The ID is: " + acc1.getID());
        System.out.println("The name is: " + acc1.getName());
        System.out.println("The balance is: " + acc1.getBalance());
        System.out.println("The balance after transfer is: " + acc1.credit(20000));
        System.out.println("The balance after debit is: " + acc1.debit(10000));
        System.out.println(acc1.toString());
        
        Account acc2 = new Account("C2", "Nguyen Van B", 50000);
        System.out.println(acc2.toString());
        System.out.println("The ID is: " + acc2.getID());
        System.out.println("The name is: " + acc2.getName());
        System.out.println("The balance is: " + acc2.getBalance());
        System.out.println("The balance after credit is: " + acc2.credit(10000));
        System.out.println("The balance after debit is: " + acc2.debit(30000));
        System.out.println(acc2.toString());

        System.out.println("The balance in the first account is: " + acc1.getBalance() 
                            + ". The balance in the second account is: " + acc2.getBalance()
                            + ". The money transfer is: " + acc2.transferTo(acc1, 10000)
                            + ". The money left in the second account is: " + acc2.getBalance()
                            + ". The new balance in first account is: " + acc1.getBalance());
    }
}
