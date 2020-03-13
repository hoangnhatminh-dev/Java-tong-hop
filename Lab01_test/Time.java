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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    public Time(int hour, int minute, int second){
        if(hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60){
            System.out.println("Input incorrect. Please check again");
        }else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    public void setHour(int hour){
        if(hour < 0 || hour > 24){
            System.out.println("Input incorrect. Hour must be between 0 and 24.");
        }else{
            this.hour = hour;
        }
    }
    
    public void setMinute(int minute){
        if(hour < 0 || hour > 60){
            System.out.println("Input incorrect. Minute must be between 0 and 60.");
        }else{
            this.minute = minute;
        }
    }
    
    public void setSecond(int second){
        if(second < 0 || second > 60){
            System.out.println("Input incorrect. Second must be between 0 and 60.");
        }else{
            this.second = second;
        }
    }
    
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60){
            System.out.println("Input incorrect. Please check again");
        }else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    
    public Time nextSecond(){
        second++;
        if(this.second >= 60){
            this.second = 0;
            minute++;
            if(this.minute >= 60){
                this.minute = 0;
                hour++;
                if(this.hour > 23){
                    this.hour = 0;
                }
            }
        }
        return this;
    }
    
    public Time nextSecondLoop(int x, int y){
        while(x<y){
            x++;
            second++;
            if(this.second >= 60){
                this.second = 0;
                minute++;
                if(this.minute >= 60){
                    this.minute = 0;
                    hour++;
                    if(this.hour > 23){
                        this.hour = 0;
                        
                    }
                }
            }
            System.out.println("Time: " + this.hour + ":" + this.minute + ":" + this.second);
        }return this;
    }
    
    public Time previousSecond(){
        second--;
        if(this.second <= 0){
            this.second = 59;
            minute--;
            if(this.minute <= 0){
                this.minute = 59;
                hour--;
                if(this.hour <= 0){
                    hour = 0;
                    minute = 0;
                    second = 0;
                }
            }
        }
        return this;
    }
    
    public Time previousSecondLoop(int x, int y){
        while(x < y){
            x++;
            second--;
            if(this.second < 0){
                this.second = 59;
                minute--;
                if(this.minute < 0){
                    this.minute = 59;
                    hour--;
                    if(this.hour < 0){
                        hour = 0;
                        minute = 0;
                        second = 0;
                    }
                }
            }
            System.out.println("Time: " + this.hour + ":" + this.minute + ":" + this.second);
        }return this;
    }
    
//Code ve viec dat thoi gian chay den mot thoi gian cho truoc
//    public Time Alarm(Time another){
//        while(this.hour < another.hour 
//                && this.minute < another.minute 
//                && this.second < another.second){
//                second++;
//                if(this.second >= 60){
//                    this.second = 0;
//                    minute++;
//                    if(this.minute >= 60){
//                        this.minute = 0;
//                        hour++;
//                        if(this.hour > 23){
//                            this.hour = 0;
//                        }
//                    }
//                }
//            }return this;
//        }
//    }

    
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    
}
