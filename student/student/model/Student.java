package student.model;

public class Student {
    private int student_id;
    private String student_name;
    private String student_address;
    private String  student_phone;

    public Student(int student_id, String student_name, String student_address, String student_phone){
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_address = student_address;
        this.student_phone = student_phone;
    }

    public int getStudentID(){ return this.student_id; }
    public String getName(){return this.student_name;}
    public String getAddress(){return this.student_address;}
    public String getPhone(){return this.student_phone;}

    public void setStudentID(int student_id){this.student_id = student_id;}
    public void setName(String student_name){this.student_name = student_name;}
    public void setAddress(String student_address){this.student_address = student_address;}
    public void setPhone(String student_phone){this.student_phone = student_phone;}

    public static Student addStudent(int student_id, String student_name, String student_address, String student_phone){
        return new Student(student_id,student_name,student_address,student_phone);
    }

    @Override
    public String toString(){
        return "Student_id = " + this.student_id
                + "student_name = " + this.student_name
                + "student_address = " + this.student_address
                + "student_phone = " + this.student_phone;
    }
}
