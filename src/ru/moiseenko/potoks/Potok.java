/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.potoks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Potok<T> {
    List<T>x=new ArrayList<>();
    public static <R> Potok<R>of(R...mas){
        Potok<R> res = new Potok<>();
        for(R r:mas)res.x.add(r);
        return res;
    }
    public <R> Potok<R>map(Changer<T,R>action){
        Potok<R>res=new Potok<>();
        for (int i=0;i<x.size();i++){
            res.x.add(action.act(x.get(i)));
        }
        return res;
    }
    public T reduce(T startVal,Action<T>action){
        T res=startVal;
        for(int i=0;i<x.size();i++){
            res=action.act(res,x.get(i));
        }
        return res;
    }
    public Potok<T>filtres(Uslovie<T>uslovie){
        for (int i=0;i<x.size();i++){
            if (!uslovie.act(x.get(i))){
                x.remove(x.get(i));
                i--;
            }
        }
        return this;
    }
}
