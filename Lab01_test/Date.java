/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01_test;

/**
 *
 * @author rough
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date (){
        day = 1;
        month = 1;
        year = 1900;
    }
    
    public Date(int day, int month, int year){
        if(day < 0 || day > 31 || month < 0 || month > 12 || year < 1900 || year > 9999){
            System.out.println("Input incorrect. Please check again");
        }else{
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
    
    public int getDay(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setDay(int day){
        if(day < 0 || day > 31){
            System.out.println("Day must be between 1 and 31");
        }else{
            this.day = day;
        }
    }
    
    public void setMonth(int month){
        if(month < 0 || month > 12){
            System.out.println("Month must be between 1 and 12");
        }else{
            this.month = month;
        }
    }
    
    public void setYear(int year){
        if(year < 1900 || year > 9999){
            System.out.println("Year must be between 1900 and 9999");
        }else{
            this.year = year;
        }
    }
    
    public void setDate(int day, int month, int year){
        if(day < 0 || day > 31 || month < 0 || month > 12 || year < 1900 || year > 9999){
            System.out.println("Input incorrect. Please check again");
        }else{
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
    
        
    @Override
    
    public String toString(){
        return  String.format("%02d/%02d/%04d", day, month, year);
                
    }
    
        
    
           
}
