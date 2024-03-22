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
public class KarateBoy{
    final private String name;
    public KarateBoy(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void kick(){
        System.out.println(name + ": бац!");
    }
    
    public void punch(){
        System.out.println(name + ": кия!");
    }
    
    public void jump(){
        System.out.println(name + ": вжух!");
    }
}
