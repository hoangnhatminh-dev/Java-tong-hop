package giftcontroller;

import giftmodel.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class GiftController {
    ArrayList<Gift> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);


    public void menu() {
        System.out.println("1 - Hiển thị toàn bộ danh sách có trong thư việc");
        System.out.println("2 - Nhập thông tin sách và insert");
        System.out.println("3 - Nhập id sách muốn xóa và delete ");
    }

    public void giftSelect() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from giftshop";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void giftInsert(Gift gift){
        try(
                //Step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                //Step2
                Statement stmt = conn.createStatement();
        ){

            //Insert a record
            String sqlInsert = "insert into giftshop values (" + gift.getID() + ", '" + gift.getName() + "', "  + gift.getPrice() + ", "  + gift.getQty()+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void giftDelete(int id){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();
        ){
            String sqlDelete = "DELETE FROM giftshop WHERE id = "+id;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
