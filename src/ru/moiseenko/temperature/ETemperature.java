/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.temperature;

/**
 *
 * @author Serge
 */
public enum ETemperature {
    COLD("Холодно"),GOOD("Хорошо"),HOT("Горячо");
    private String str;
    
    ETemperature(String str){
        this.str=str;
    }
    
    public String getTemp(){
        return str;
    }
    
    public static ETemperature temper(int temp){
        if (temp>=-50 && temp<10){
            return ETemperature.COLD;
        }
        else if(temp>=10 && temp<25){
            return ETemperature.GOOD;
        }
        else if(temp>=25 && temp<60){
            return ETemperature.HOT;
        }
        else{
            return null;
        }
    }
}
