/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.defaultst;

/**
 *
 * @author Serge
 */
public class Defol<T> {
    Act<T> act;
    Defol(Act a){
        act=a;
    }
    public T ar(T def){
        if(act==null || act.act()==null) return def;
        return act.act();
    }
}
