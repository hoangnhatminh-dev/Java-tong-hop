import java.sql.*;

public class JDBCUpdateTestEx2 {
    public static void main(String[] args) {

        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "UPDATE `categories` SET `CategoryName` = 'SeafoodVN' WHERE `categories`.`CategoryID` = 8";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected. \n");

            String select = "SELECT * FROM categories";
            System.out.println("The SQL statement is: " + select + "\n");
            ResultSet rset = stmt.executeQuery(select);
            while(rset.next()){
                System.out.println(rset.getInt("CategoryID") + ", "
                        + rset.getString("CategoryName") + ", "
                        + rset.getString("Description"));
            }

            String strUpdate2 = "UPDATE `customers` SET `Address` = '1A Yet Kieu - Hanoi' WHERE `customers`.`CustomerID` = 'FRANK'";
            System.out.println("The SQL statement is: " + strUpdate2 + "\n");
            int countUpdated2 = stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2 + " records affected. \n");

            String select2 = "SELECT * FROM customers";
            System.out.println("The SQL statement is: " + select2 + "\n");
            ResultSet rset2 = stmt.executeQuery(select2);
            while(rset2.next()){
                System.out.println(rset2.getString("CustomerID") + ", "
                        + rset2.getString("Address"));
            }

            String strUpdate3 = "UPDATE `products` SET `UnitPrice` = `UnitPrice` + `UnitPrice` * 0.1, `Discontinued` = b'0' WHERE `products`.`CategoryID` = 5 OR `products`.`CategoryID` = 7 OR `products`.`CategoryID` = 8";
            System.out.println("The SQL statement is: " + strUpdate3 + "\n");
            int countUpdated3 = stmt.executeUpdate(strUpdate3);
            System.out.println(countUpdated3 + " records affected. \n");

            String select3 = "SELECT * FROM products WHERE `products`.`CategoryID` = 5 OR `products`.`CategoryID` = 7 OR `products`.`CategoryID` = 8";
            System.out.println("The SQL statement is: " + select3 + "\n");
            ResultSet rset3 = stmt.executeQuery(select3);

            while(rset3.next()){
                System.out.println(rset3.getString("ProductID") + ", "
                        + rset3.getString("ProductName") + ", "
                        + rset3.getString("UnitPrice") + ", "
                        + rset3.getString("CategoryID"));
            }

            String strUpdate4 = "UPDATE `orders` SET `ShipVia` = '3' WHERE `orders`.`OrderID` = 10313";
            System.out.println("The SQL statement is: " + strUpdate4 + "\n");
            int countUpdated4 = stmt.executeUpdate(strUpdate4);
            System.out.println(countUpdated4 + " records affected. \n");

            String select4 = "SELECT * FROM `orders` WHERE `orders`.`OrderID` = 10313";
            System.out.println("The SQL statement is: " + select4 + "\n");
            ResultSet rset4 = stmt.executeQuery(select4);

            while(rset4.next()){
                System.out.println(rset4.getString("OrderID") + ", "
                        + rset4.getString("ShipVia"));
            }







        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
