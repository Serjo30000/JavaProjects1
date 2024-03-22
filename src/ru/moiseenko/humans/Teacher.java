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
public class Teacher extends Man{
    private String job;
    public Teacher(String name,int id,ManRuleable rule,String job){
        super(name,id,rule);
        this.job=job;
    }
    
    @Override
    public String getJob(){
        return job;
    }
}
