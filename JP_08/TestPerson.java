/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author rough
 */
public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("MM", "NN", "BA", 2020, 50000);
        
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
        System.out.println(s1.getProgram());
        System.out.println(s1.getYear());
        System.out.println(s1.getFee());
        
        s1.setAddress("NMN");
        s1.setProgram("BAB");
        s1.setYear(2019);
        s1.setFee(100000);
        
        System.out.println(s1.toString());
        
        Staff st1 = new Staff("AA","BB","BAS", 30000);
        System.out.println(st1.getName());
        System.out.println(st1.getAddress());
        System.out.println(st1.getSchool());
        System.out.println(st1.getPay());
        
        st1.setAddress("BBA");
        st1.setSchool("BSAA");
        st1.setPay(50000);
        
        System.out.println(st1.toString());
        
        
    }
}
