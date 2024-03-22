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
public class ShootGun extends PistolGun{
    final private int speedBul;
    final private int nsec;
    public ShootGun(){
        this(30,30);
    }
    public ShootGun(int maxBullets){
        this(maxBullets/2,maxBullets);
    }
    public ShootGun(int speedBul, int maxBullets){
        this(speedBul, maxBullets, 0,1);
    }
    public ShootGun(int speedBul, int maxBullets, int bullets, int nsec){
        super(maxBullets,bullets);
        if (speedBul<=0 || nsec<=0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество патрон.");
        }
        this.speedBul=speedBul;
        this.nsec=nsec;
    }
    
    public int getspeedBul(){
        return speedBul;
    }
    public int getNsec(){
        return nsec;
    }
    @Override
    public String fired(){
        String str="";
        if (getBullets()>0){
            for (int i=0;i<nsec*speedBul && getBullets()>0;i++){
                str+="Бах ";
                setBullets(getBullets()-1);
            }
            return str;
        }
        else{
            return "Клац!";
        }
    }
}
