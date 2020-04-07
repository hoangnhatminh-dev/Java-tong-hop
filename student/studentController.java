package student;

import java.sql.*;
import java.util.ArrayList;


public class studentController {
    private ArrayList<student> student_list;
    public studentController(int id, String name, String address, String phone){
        this.student_list=new ArrayList<student>();
    }

    public boolean addNewStudent(student student){
        if (findStudent(student.getName())>=0){
            System.out.println("Student is already on file");
            return false;
        }
        student_list.add(student);
        return true;
    }

    private int findStudent(String student_name){
        for(int i=0; i<this.student_list.size();i++){
            student student = this.student_list.get(i);
            if (student.getName().equals(student_name)){
                return i;
            }
        }
        return -1;
    }

    //Display Student List
    public void displayStudent(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();

        ) {

            ResultSet rset = stmt.executeQuery("select * from student");

            ResultSetMetaData rsetMD = rset.getMetaData();

            int numColumns = rsetMD.getColumnCount();


            for(int i = 1; i <= numColumns; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();


            for(int i = 1; i <= numColumns; i++){
                System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();


            while(rset.next()){
                for(int i = 1; i <= numColumns; i++){

                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Save Student Records
    public void saveStudent(){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "");
                PreparedStatement pstmt = conn.prepareStatement("insert into student values (?, ?, ?, ?)");
        ) {
            conn.setAutoCommit(false);  // Disable auto-commit for each SQL statement
            for (int i=0; i<this.student_list.size(); i++){
                pstmt.setInt(1, student_list.get(i).getStudentID());  // Set values for parameters 1 to 5
                pstmt.setString(2, student_list.get(i).getName());
                pstmt.setString(3, student_list.get(i).getAddress());
                pstmt.setString(4, student_list.get(i).getPhone());
                pstmt.addBatch();
                pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

