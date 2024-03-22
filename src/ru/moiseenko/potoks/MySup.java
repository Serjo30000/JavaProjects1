/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.potoks;

import java.util.function.Supplier;

/**
 *
 * @author Serge
 */
public class MySup implements Supplier<String>{
    String[] arr = {"qq","wr","aa","ee"};
    int x=0;
    @Override
    public String get(){
        if(x==arr.length){
            x=0;
        }
        return arr[x++];
    }
}
