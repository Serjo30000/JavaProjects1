/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.animals;

/**
 *
 * @author Serge
 */
public class Cuckoo implements Singable {
    @Override
    public String singing(){
        String str="";
        int r = (int) Math.ceil(Math.random()*10);
        if (r<1){
            r=1;
        }
        for (int i=0;i<r;i++){
            str+="ку-ку ";
        }
        return str;
    }
}
