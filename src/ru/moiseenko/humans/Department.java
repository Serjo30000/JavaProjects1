/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.humans;

/**
 *
 * @author Serge
 */
public class Department {
    protected String otdels;
    protected Worker bossS;
    
    public Department(String otdels){
        this(otdels,null);
    }
    
    public Department(Worker bossS){
        this(null,bossS);
    }
    
    public Department(String otdels, Worker bossS){
        if (otdels==null && bossS==null){
            throw new IllegalArgumentException("Пустые значение.");
        }
        this.otdels=otdels;
        this.bossS=bossS;
    }
    
    protected Boolean isBoss(String name,Department dp){
        if (bossS.name.equals(name)&&otdels.equals(dp.otdels)){
              return true;
        }
        else{
            return false;
        }
    }
}
