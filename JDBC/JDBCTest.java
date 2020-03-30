package JDBC;
import java.sql.*; //Using "Connection", "Statement" and "ResultSet" classes in Java.sql package

public class JDBCTest {
    public static void main(String[] args) {
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
                //  ?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC => fix lỗi timezone của JDBC

                // Step 2: Allocate a 'Statement' object in the Connection

                Statement stmt = conn.createStatement();
        ) {
            //Execute a SQL SELECT query. The Query result is returned in a "ResultSet" object.
            String strSelect = "select title, price, qty from books";
            System.out.println("The SQL statment is: " + strSelect + "\n"); //Echo for debugging

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");

            //Process the ResultSet by scrolling the cursor forward via next().
            //For each row, retrieve the contents of the cells with getXxx(ColumnName)/
            int rowCount = 0;
            while(rset.next()){ //Move the cursor to the next row, return false if no more row
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

        }catch(SQLException ex){
            ex.printStackTrace();
        }//Close conn and stmt - Done auto by try-with-resources (JDK 7)

    }
}
