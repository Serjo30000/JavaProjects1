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
public class Watchman {
    private Manable man;
    
    public Watchman(Manable man){
        this.man=man;
    }
    
    public boolean checkUser(){
        if (man.getRule()==null){
            return false;
        }
        return man.getRule().examination(man);
    }
}
