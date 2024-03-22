/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.defaultst;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Serge
 */
public class Data<T> {
    private List<T>arr = new ArrayList<>();
    
    public static <R>Data<R>of(R...mas){
        Data<R> res = new Data<>();
        for(R r:mas)res.arr.add(r);
        return res;
    }
    
    public Data<T> action(Action<T> act){
        for(int i=0;i<arr.size();i++){
            arr.set(i, act.make(arr.get(i)));
        }
        return this;
    }
    
    public Data<T> filter(Predicate<T> predicate){
        for (int i=0;i<arr.size();i++){
            if (!predicate.test(arr.get(i))){
                arr.remove(arr.get(i));
                i--;
            }
        }
        return this;
    }
    
    public List<T> get(){
        return new ArrayList<>(arr);
    }
}
