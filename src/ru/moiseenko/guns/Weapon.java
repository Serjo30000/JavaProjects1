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
public abstract class Weapon {
    protected int bullets;
    public Weapon(int bullets){
        if (bullets<0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество патрон.");
        }
        this.bullets=bullets;
    }
    
    public String rechargeBullets(){
        if (bullets>0){
            return "Заряжен";
        }
        else{
            return "Разряжен";
        }
    }
    
    public void recharge(int bul){
        if (bul<=0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество патрон.");
        }
        bullets+=bul;
    }
    
    public void discharge(){
        bullets=0;
    }
    
    abstract public String fired();
    abstract public String fired(int nsec);
}
