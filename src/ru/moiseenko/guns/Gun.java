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
public class Gun extends Weapon {
    int bulletshot;
    final private int speedBul;
    private final int maxBullets;
    public Gun(){
        this(30,30);
    }
    public Gun(int maxBullets){
        this(maxBullets/2,maxBullets);
    }
    public Gun(int speedBul, int maxBullets){
        this(speedBul, maxBullets, 0);
    }
    public Gun(int speedBul, int maxBullets, int bullets){
        super(bullets);
        if (speedBul<=0 || maxBullets<=0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество патрон.");
        }
        this.maxBullets=maxBullets;
        this.speedBul=speedBul;
        this.bulletshot=0;
    }
    
    public int getmaxBullets(){
        return maxBullets;
    }
    
    public int getspeedBul(){
        return speedBul;
    }
    @Override
    public void discharge(){
        bulletshot+=bullets;
        bullets=0;
    }
    @Override
    public void recharge(int bul){
        if (bul<=0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество патрон.");
        }
        else if (bul<=maxBullets){
            bullets=bullets+bul;
        }
        else if (bul>maxBullets){
            bullets=bullets+maxBullets;
            bulletshot=bulletshot + bul - maxBullets;
        }
    }
    @Override
    public String fired(){
        String str="";
        if (bullets>0){
            for (int i=0;i<speedBul && bullets>0;i++){
                str+="Бах ";
                bullets=bullets-1;
            }
            return str;
        }
        else{
            return "Клац!";
        }
    }
    @Override
    public String fired(int nsec){
        String str="";
        if (bullets>0){
            
            for (int i=0;i<nsec*speedBul && bullets>0;i++){
                str+="Бах ";
                bullets=bullets-1;
            }
            return str;
        }
        else{
            return "Клац!";
        }
    }
}
