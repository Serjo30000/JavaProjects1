/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.notconstructor;

/**
 *
 * @author Serge
 */
public final class Storagen<T> {
    private T ob;
    private RuleStoragen<T> rule;
    
    public void setRule(RuleStoragen<T> rule){
        this.rule=rule;
    }
    
    public void addOb(T obj){
        if (rule.ruleStor(obj)){
            ob=obj;
        }
    }
    
    public T getStoragen(T obj){
        if (ob==null){
            return obj;
        }
        else if (ob instanceof Number && (Integer)ob==99){
            return (T)Integer.valueOf(("-1"));
        }
        else if (ob instanceof String && ((String)ob).equals("hello")){
            return (T)"hello world";
        }
        return (T)new Object();
    }
}
