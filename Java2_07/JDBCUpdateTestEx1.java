package Java2_07;

import java.sql.*;

public class JDBCUpdateTestEx1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update `giftshop` set `price` = `price` + `price` * 0.7, `qty` = `qty` + 1 where `id` = 1001";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected. \n");

            String strSelect = "select * from giftshop where id = 1001";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id") + ", "
                + rset.getString("title") + ", "
                + rset.getDouble("price") + ", "
                + rset.getInt("qty"));
            }

            String strUpdate2 = "update `giftshop` set `price` = `price` + `price` * 0.5 where title = 'A Cup of Java'";
            System.out.println("The SQL statement is: " + strUpdate2 + "\n");
            int countUpdated2 = stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2 + " records affected. \n");

            String strUpdate3 = "update giftshop set qty = 0 where title = 'A Teaspoon of Java'";
            System.out.println("The SQL statement is: " + strUpdate3 + "\n");
            int countUpdated3 = stmt.executeUpdate(strUpdate3);
            System.out.println(countUpdated3 + " records affected. \n");



        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}

