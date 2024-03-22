/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Students;

/**
 *
 * @author Serge
 */
public class Defolt<T>{
    private T t;
    private DefoltRule<T> defRule;
    
    public Defolt(){

    }
    public Defolt(T t){
        this.t=t;
    }
    public Defolt(T t,DefoltRule<T> defRule){
        this.defRule=defRule;
        if (this.defRule.getRule(t)==true){
            this.t=(T)new Object();
        }
        else{
            this.t=t;
        }
    }
    
    public T getOr(T def){
        if (defRule==null && t==null)return def;
        if (defRule==null && t!=null)return t;
        if (defRule!=null)return t;
        return null;
    }
}