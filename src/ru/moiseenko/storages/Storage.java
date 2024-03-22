/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.storages;

/**
 *
 * @author Serge
 * @param <T>
 */
public class Storage<T> {
    private final T ob;
    
    public Storage(T ob){
        this.ob=ob;
    }
    
    public T getStorage(){
        if (ob!=null && (ob instanceof String) && ob.equals("hello")){
            return (T)"hello world";
        }
        else if (ob!=null && (ob instanceof Number) && ob.equals(99)){
            return (T)Integer.valueOf(("-1"));
        }
        else if (ob==null){
            return (T)"default";
        }
        else{
            return ob;
        }
    }
}
