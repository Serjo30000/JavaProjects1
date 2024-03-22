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
public class Man implements Manable{
    private final String name;
    private final int id;
    private ManRuleable rule;
    public Man(String name,int id){
        this.name=name;
        this.id=id;
    }
    protected Man(String name,int id,ManRuleable rule){
        this.name=name;
        this.id=id;
        this.rule=rule;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public ManRuleable getRule(){
        return rule;
    }
}
