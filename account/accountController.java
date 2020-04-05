package account;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class accountController {
    ArrayList<accountModel> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    //Account
    public void selectAccount() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String selectAcc = "select * from account";
            System.out.println("The SQL statement is: " + selectAcc + "\n");
            ResultSet rset = stmt.executeQuery(selectAcc);

            while (rset.next()) {
                System.out.println(rset.getString("username") + ", "
                        + rset.getString("password") + ", "
                        + rset.getString("role"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void createAccount(accountModel accountModel) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String newAcc = "insert into account (username, password, role) values (" + "'" + accountModel.getUsername() + "', '"  + accountModel.getPassword() + "', '"  + accountModel.getRole()  +  "')";
            System.out.println("The SQL statement is: " + newAcc + "\n");
            int newAccInserted = stmt.executeUpdate(newAcc);
            System.out.println(newAccInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Book
    public void selectBook(){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){

            System.out.println("============================================================================");
            String strSelect = "select * from book";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");

            while (rset.next()){
                int book_id = rset.getInt("book_id");
                String book_name = rset.getString("book_name");
                double book_price = rset.getDouble("book_price");
                int book_available = rset.getInt("book_available");
                int dis_id = rset.getInt("dis_id");
                int author_id = rset.getInt("author_id");
                int genre_id = rset.getInt("genre_id");
                System.out.println(book_id + ", " + book_name + ", " + book_price + ", " + book_available + ", " + dis_id + ", " + author_id + ", " + genre_id);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void insertBook(book book){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                //Step2
                Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into book (book_id, book_name, book_price, book_available, dis_id, author_id, genre_id) values (" + "'" + book.getBookId() +"', " + " '"
                    + book.getName() + "', "
                    + book.getPrice() + ", "
                    + book.getQty() +", "
                    + book.getDisID() + ", "
                    + book.getAuthorID() + ", "
                    + book.getGenreID() + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteBook(int book_id){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();
        ){
            String sqlDelete = "DELETE FROM book WHERE book_id = " +  "'" + book_id + "'";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateBook(int book_id, double book_price , int book_available){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update book set "
                    + "book_price = " + book_price
                    + ", book_available = " + book_available
                    + " where book_id = " + book_id;
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    //Customer
    public void selectCustomer(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from customer";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getInt("customer_id") + ", "
                        + rset.getString("customer_name") + ", "
                        + rset.getString("customer_address") + ", "
                        + rset.getString("customer_phone") + ", "
                        + rset.getString("customer_email"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void insertCustomer(customer customer){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
        ){
            String sqlInsert = "insert into customer (customer_name, customer_address, customer_phone, customer_email) values " +
                    "(" + "'" + customer.getCustomerName() + "', '"
                    + customer.getCustomerAddress() + "', '"
                    + customer.getCustomerPhone() + "', '"
                    + customer.getCustomerEmail()  +  "'" +  ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteCustomer(int customer_id){
        accountView views = new accountView();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {

            String sqlSelect = "select * from invoice where customer_id = " + "'" + customer_id + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if (rset.next()) {
                System.out.println("Invoice available");
            }else{
                String sqlDelete = "DELETE FROM customer WHERE customer_id = " + customer_id;
                System.out.println("The SQL statement is: " + sqlDelete + "\n");
                int countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + " records deleted.\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void updateCustomer( int customer_id, String customer_address ,String customer_phone, String customer_email ){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update customer set "
                    + "customer_address =" + "'" + customer_address + "'"
                    + ",customer_phone =" + "'" + customer_phone + "'"
                    + ",customer_email =" + "'" + customer_email + "'"
                    +  " where customer_id = " + customer_id ;

            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }





}
