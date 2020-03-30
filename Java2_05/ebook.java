package Java2_05;

import java.sql.*;

public class ebook{
    public static void main(String[] args) {
        try(

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");

                Statement stmt = conn.createStatement();

        ){
//1.HIỂN THỊ 3 ĐƠN HÀNG MỚI TIẾP NHẬN
            System.out.println("============================================================================");
            String strSelect = "select * from invoice ORDER BY invoice_id DESC LIMIT 3";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");
            int rowCount = 0;
            while (rset.next()) {
                int invoice_id = rset.getInt("invoice_id");
                String invoice_status = rset.getString("invoice_status");
                int customer_id = rset.getInt("customer_id");
                System.out.println(invoice_id + ", " + invoice_status + ", " + customer_id);
                rowCount++;
            }
            System.out.println("Total number of record = " + rowCount);


//2.HIỂN THỊ ĐƠN HÀNG THEO MÃ KHÁCH HÀNG
        System.out.println("============================================================================");
        String strSelect1 = "select * from invoice WHERE  customer_id = 5";
        System.out.println("The SQL statement is: " + strSelect1 + "\n");

        ResultSet rset1 = stmt.executeQuery(strSelect1);

        System.out.println("The records selected are: ");
        int rowCount1 = 0;
        while (rset1.next()){
            int invoice_id = rset1.getInt("invoice_id");
            String invoice_status = rset1.getString("invoice_status");
            int customer_id = rset1.getInt("customer_id");
            System.out.println(invoice_id + ", " + invoice_status + ", " + customer_id);
            rowCount1++;
        }
        System.out.println("Total number of record = " + rowCount1);

//3.HIỂN THỊ TRẠNG THÁI ĐƠN HÀNG THEO MÃ ĐƠN HÀNG
        System.out.println("============================================================================");
        String strSelect2 = "select * from invoice WHERE  invoice_id = 2";
        System.out.println("The SQL statement is: " + strSelect2 + "\n");
        ResultSet rset2 = stmt.executeQuery(strSelect2);
        System.out.println("The records selected are: ");
        int rowCount2 = 0;
        while (rset2.next()){
            int invoice_id = rset2.getInt("invoice_id");
            String invoice_status = rset2.getString("invoice_status");
            int customer_id = rset2.getInt("customer_id");
            System.out.println(invoice_id + ", " + invoice_status + ", " + customer_id);
            rowCount2++;
        }
        System.out.println("Total number of record = " + rowCount2);

//4.HIỂN THỊ THÔNG TIN CHI TIẾT CỦA MỘT ĐƠN HÀNG  THEO MÃ ĐƠN ĐƯỢC NHẬP VÀO
        System.out.println("============================================================================");
        String strSelect3 = "select * from invoice WHERE  invoice_id = 7";
        System.out.println("The SQL statement is: " + strSelect3 + "\n");
        ResultSet rset3 = stmt.executeQuery(strSelect3);
        System.out.println("The records selected are: ");
        int rowCount3 = 0;
        while (rset3.next()){
            int invoice_id = rset3.getInt("invoice_id");
            String invoice_status = rset3.getString("invoice_status");

            System.out.println(invoice_id + ", " + invoice_status);
            rowCount3++;
        }
        System.out.println("Total number of record = " + rowCount3);

//5.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐANG CHỜ XỬ LÝ
        System.out.println("============================================================================");
        String strSelect4 = "SELECT * FROM invoice WHERE invoice_status = `Processing`";
        System.out.println("The SQL statement is: " + strSelect4 + "\n");
        ResultSet rset4 = stmt.executeQuery(strSelect4);
        System.out.println("The records selected are: ");
        int rowCount4 = 0;
        while (rset4.next()){
            int invoice_id = rset4.getInt("invoice_id");
            String invoice_status = rset4.getString("invoice_status");

            System.out.println(invoice_id + ", " + invoice_status);
            rowCount4++;
        }
        System.out.println("Total number of record = " + rowCount4);

//6.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ ĐÓNG GÓI
        System.out.println("============================================================================");
        String strSelect5 = "select * from invoice WHERE  invoice_status = `Packaged`";
        System.out.println("The SQL statement is: " + strSelect5 + "\n");
        ResultSet rset5 = stmt.executeQuery(strSelect5);
        System.out.println("The records selected are: ");
        int rowCount5 = 0;
        while (rset5.next()){
            int invoice_id = rset5.getInt("invoice_id");
            String invoice_status = rset5.getString("invoice_status");

            System.out.println(invoice_status + ", " + invoice_status);
            rowCount5++;
        }
        System.out.println("Total number of record = " + rowCount5);

//7.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GỬI VẬN CHUYỂN
        System.out.println("============================================================================");
        String strSelect6 = "SELECT * FROM invoice WHERE invoice_status = `Delievered`";
        System.out.println("The SQL statement is: " + strSelect6 + "\n");
        ResultSet rset6 = stmt.executeQuery(strSelect5);
        System.out.println("The records selected are: ");
        int rowCount6 = 0;
        while (rset6.next()){
            int invoice_id = rset6.getInt("invoice_id");
            String invoice_status = rset6.getString("invoice_status");

            System.out.println(invoice_id + ", " + invoice_status);
            rowCount6++;
        }
        System.out.println("Total number of record = " + rowCount6);

//8.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GIAO HÀNG THÀNH CÔNG
        System.out.println("============================================================================");
        String strSelect7 = "select * from invoice WHERE  invoice_status = 'Completed'";
        System.out.println("The SQL statement is: " + strSelect7 + "\n");
        ResultSet rset7 = stmt.executeQuery(strSelect7);
        System.out.println("The records selected are: ");
        int rowCount7 = 0;
        while (rset7.next()){
            int invoice_id = rset7.getInt("invoice_id");
            String invoice_status = rset7.getString("invoice_status");

            System.out.println(invoice_id + ", " + invoice_status);
            rowCount7++;
        }
        System.out.println("Total number of record = " + rowCount7);

//9.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ BỊ HỦY
        System.out.println("============================================================================");
        String strSelect9 = "select * from invoice WHERE  invoice_status = 'Canceled'";
        System.out.println("The SQL statement is: " + strSelect9 + "\n");
        ResultSet rset9 = stmt.executeQuery(strSelect9);
        System.out.println("The records selected are: ");
        int rowCount9 = 0;
        while (rset9.next()){
            int invoice_id = rset9.getInt("invoice_id");
            String invoice_status = rset9.getString("invoice_status");

            System.out.println(invoice_id + ", " + invoice_status);
            rowCount9++;
        }
        System.out.println("Total number of record = " + rowCount9);
    }catch(SQLException ex){
        ex.printStackTrace();
        }
    }//Step5
}
