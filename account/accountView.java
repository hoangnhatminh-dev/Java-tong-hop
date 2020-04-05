package account;

import java.sql.*;
import java.util.Scanner;

public class accountView {

    final int SENTINEL = 0;
    int n;
    Scanner scanner = new Scanner(System.in);
    accountController ac = new accountController();

    public static void main(String[] args) {
        accountView views = new accountView();
        views.accountViewMenu();
    }

    public void accountViewMenu(){
        System.out.println("Sign Up/Sign In");
        accountView views = new accountView();
        views.menu();
        n = scanner.nextInt();
        while (n != SENTINEL) {
            switch (n) {
                case 1:
                    views.signUp();
                    break;
                case 2:
                    views.signIn();
                    return;
            }
            views.accountViewMenu();
            n = scanner.nextInt();
        }
        System.out.println("Bye....See you again!");
    }


    public void menu(){
        System.out.println("===================================================");
        System.out.println("0.Out....");
        System.out.println("1.Sign Up");
        System.out.println("2.Sign In");
    }
    public void signUp(){
        System.out.println("Enter name: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        System.out.println("Enter role: ");
        String role = scanner.next();
        accountModel account = new accountModel(username, password,role);
        ac.createAccount(account);
        ac.selectAccount();
    }

    public void signIn(){
        accountView views = new accountView();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("Enter username: ");
            String username = scanner.next();
            System.out.println("Enter password: ");
            String password = scanner.next();
            String sqlSelect = "select * from account where username = " + "'" + username + "'" + "and password = " + "'" + password + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if (rset.next()) {
                System.out.println("Logged in successfully");
                views.menuLogIn();
                n = scanner.nextInt();
                while (n!= SENTINEL){
                    switch (n) {
                        case 1:
                            views.manageBook();
                        case 2:
                            views.manageCustomer();
                    }
                    views.menuLogIn();
                    n = scanner.nextInt();
                }
            }else{
                System.out.println("Login unsuccessful");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void manageBook(){
        accountView views = new accountView();
        views.menuBook();
        int x;
        x = scanner.nextInt();
        while ( x != SENTINEL){
            switch (x) {
                case 1:
                    views.addBook();
                    break;
                case 2:
                    views.updateBook();
                    break;
                case 3: views.deleteBook();
                    break;
                case 4: ac.selectBook();
                    break;
            }
            views.menuBook();
            x = scanner.nextInt();
        }
    }

    public void manageCustomer(){
        accountView views = new accountView();
        views.menuCustomer();
        int y;
        y = scanner.nextInt();
        while ( y != SENTINEL){
            switch (y){
                case 1:
                    views.addCustomer();
                    break;
                case 2:
                    views.updateCustomer();
                    break;
                case 3:
                    views.deleteCustomer();
                    break;
                case 4 :
                    ac.selectCustomer();
                    break;
            }
            views.menuCustomer();
            y = scanner.nextInt();
        }
    }
    //Customer
    public void menuCustomer(){
        System.out.println("0.Return");
        System.out.println("1.Insert Customer");
        System.out.println("2.Update Customer");
        System.out.println("3.Delete book");
        System.out.println("4.Show Customer's info");
    }

    public void addCustomer(){
        System.out.println("Enter name: ");
        String customer_name = scanner.next();

        System.out.println("Enter address: ");
        String customer_address = scanner.next();

        System.out.println("Enter phone: ");
        String customer_phone = scanner.next();

        System.out.println("Enter email: ");
        String customer_email = scanner.next();
        customer customer = new customer(customer_name, customer_address, customer_phone, customer_email);
        ac.insertCustomer(customer);
    }

    public void deleteCustomer(){
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        ac.deleteCustomer(id);
    }

    public void updateCustomer(){
        System.out.println("Enter id: ");
        int customer_id = scanner.nextInt();
        System.out.println("Enter address: ");
        String customer_address = scanner.next();
        System.out.println("Enter phone: ");
        String customer_phone = scanner.next();
        System.out.println("Enter email: ");
        String customer_email = scanner.next();
        ac.updateCustomer(customer_id, customer_address, customer_phone, customer_email);
    }

    //LogAccount
    public void menuLogIn(){
        System.out.println("1.Book list manage");
        System.out.println("2.Customer list manage");
    }

    //Books
    public void menuBook(){
        System.out.println("0. Return");
        System.out.println("1. Insert book");
        System.out.println("2. Update book");
        System.out.println("3. Delete book");
        System.out.println("4. Show book list");
    }

    public void addBook(){
        System.out.println("Enter book id: ");
        int book_id = scanner.nextInt();

        System.out.println("Enter name: ");
        String book_name = scanner.next();

        System.out.println("Enter price: ");
        double book_price = scanner.nextDouble();

        System.out.println("Enter qty: ");
        int book_available = scanner.nextInt();

        System.out.println("Enter distributer ID: ");
        int dis_id = scanner.nextInt();

        System.out.println("Enter author ID: ");
        int author_id = scanner.nextInt();

        System.out.println("Enter genre ID: ");
        int genre_id = scanner.nextInt();

        book book = new book(book_id, book_name, book_price, book_available, dis_id, author_id, genre_id);
        ac.insertBook(book);
    }

    public void deleteBook(){
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        ac.deleteBook(id);
    }

    public void updateBook(){
        System.out.println("Enter id: ");
        int book_id = scanner.nextInt();
        System.out.println("Enter price: ");
        double book_price = scanner.nextDouble();
        System.out.println("Enter qty: ");
        int book_available = scanner.nextInt();
        ac.updateBook(book_id, book_price, book_available);
    }
}

