/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.numbs;

/**
 *
 * @author Serge
 */
public class Time {
    private int hours, minutes, seconds;
    public Time(int seconds){
        this(0,0,seconds);
    }
    public Time(int minutes,int seconds){
        this(0,minutes,seconds);
    }
    public Time(int hours, int minutes, int seconds){
        if (hours>24 || minutes>60 || seconds>60){
            this.hours=hours%24;
            this.minutes=minutes%60;
            this.seconds=seconds%60;
        }
        else{
            this.hours=hours;
            this.minutes=minutes;
            this.seconds=seconds;
        }
    }
    
    public int getSeconds(){
        return seconds;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getHours(){
        return hours;
    }
    public void setSeconds(int sec){
        if (sec<0 || sec>=60){
            throw new IllegalArgumentException("Недопустимое значение.");
        }
        seconds=sec;
    }
    public void setMinutes(int mnt){
        if (mnt<0 || mnt>=60){
            throw new IllegalArgumentException("Недопустимое значение.");
        }
        minutes=mnt;
    }
    public void setHours(int hrs){
        if (hours<0 || hours>=24){
            throw new IllegalArgumentException("Недопустимое значение.");
        }
        hours=hrs;
    }
    @Override
    public String toString(){
        String str="";
        if (hours<10){
            str+="0" + hours + ":";
        }
        else{
            str+="" + hours + ":";
        }
        if (minutes<10){
            str+="0" +minutes + ":";
        }
        else{
            str+="" + minutes + ":";
        }
        if (seconds<10){
            str+="0" + seconds;
        }
        else{
            str+="" + seconds;
        }  
        return str;
    }
}
