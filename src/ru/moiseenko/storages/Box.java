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
public class Box<T> {
    private T ob;
    
    public T getBox(){
        T obs = ob;
        ob=null;
        return obs;
    }
    
    public void setBox(T obs){
        if (isBox()){
            throw new IllegalArgumentException("Нельзя положить что-то в заполненную коробку.");
        }
        ob=obs;
    }
    
    public boolean isBox(){
        if (ob==null){
            return false;
        }
        else{
            return true;
        }
    }
}
