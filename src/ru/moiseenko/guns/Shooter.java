/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.guns;

/**
 *
 * @author Serge
 */
public class Shooter {
    String name;
    Weaponable guns;
    public Shooter(String name){
        this(name,null);
    }
    public Shooter(String name, Weaponable guns){
        this.name=name;
        this.guns=guns;
    }
    public String shotbul(){
        if (guns==null){
            return "не могу участвовать в перестрелке";
        }
        else{
            return guns.fired();
        }
    }
    public String rechargeBul(){
        if (guns==null){
            return "не могу участвовать в перестрелке";
        }
        else{
            return guns.rechargeBullets();
        }
    }
    public void rechargS(int bul){
        if (guns==null){
            System.out.println("не могу участвовать в перестрелке");
        }
        else{
            guns.recharge(bul);
        }
    }
    public void dischargeS(){
        if (guns==null){
            System.out.println("не могу участвовать в перестрелке");
        }
        else{
            guns.discharge();
        }
    }
    @Override
    public String toString(){
        return "Стрелок: " + name;
    }
}
