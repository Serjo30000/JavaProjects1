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
public class PistolGun implements Weaponable{
    int bulletshot;
    private int bullets;
    private final int maxBullets;
    public PistolGun(){
        this(5);
    }
    public PistolGun(int maxBullets){
        this(maxBullets, 0);
    }
    public PistolGun(int maxBullets, int bullets){
        if (maxBullets<0 || bullets<0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество патрон.");
        }
        this.maxBullets=maxBullets;
        this.bulletshot=bullets;
        this.bullets=bullets;
    }
    
    
    public int getmaxBullets(){
        return maxBullets;
    }
    
    public int getBullets(){
        return bullets;
    }
    
    public void setBullets(int bul){
        if (bul>=0){
            bullets=bul;
        }
    }
    @Override
    public String rechargeBullets(){
        if (bullets>0){
            return "Заряжен";
        }
        else{
            return "Разряжен";
        }
    }
    @Override
    public void recharge(int bul){
        if (bul<0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество патрон.");
        }
        else if (bul<=maxBullets){
            bullets+=bul;
        }
        else if (bul>maxBullets){
            bullets+=maxBullets;
            bulletshot=bulletshot + bul - maxBullets;
        }
    }
    @Override
    public void discharge(){
        bulletshot+=bullets;
        bullets=0;
    }
    @Override
    public String fired(){
        if (bullets>0){
            bullets--;
            return "Бах!";
        }
        else{
            return "Клац!";
        }
    }
}
