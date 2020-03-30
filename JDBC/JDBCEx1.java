package JDBC;
import java.sql.*;
import java.util.Scanner;

public class JDBCEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
                //  ?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC => fix lỗi timezone của JDBC

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = conn.createStatement();
        ) {
            //1. Delete
            String sqlDelete = "delete from books where id < 8000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records inserted.\n");

            //2. Insert
            String sqlInsert = "insert into books values "
                    + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                    + "(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "records inserted.\n");

            //3. Insert One
            String sqlInsertOne = "insert into books values "
                    + "(2001, 'Java JDBC MySQL', 'ThiDK'";
            System.out.println("The SQL statement is: " + sqlInsertOne + "\n");
            int countInsertedOne = stmt.executeUpdate(sqlInsertOne);
            System.out.println(countInsertedOne + " recordds inserted.\n");

            //4. Delete one
            String sqlDeleteOne = "delete from books where id = 8001";
            System.out.println("The SQL statement is: " + sqlDeleteOne + "\n");
            int countDeletedOne = stmt.executeUpdate(sqlDeleteOne);
            System.out.println(countDeletedOne + " records inserted.\n");

            //5. Insert
            System.out.println("Insert book ID: ");
            String bookID = scanner.nextLine();

            System.out.println("Insert book name: ");
            String bookName = scanner.nextLine();

            System.out.println("Insert book's author: ");
            String bookAuthor = scanner.nextLine();

            String sqlUser = "insert into books values "
                    + "(bookID, bookName, bookAuthor)";
            System.out.println("The SQL statement is " + sqlUser + "\n");
            int countUserInserted = stmt.executeUpdate(sqlUser);
            System.out.println(countUserInserted + " records inserted.\n");

        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
