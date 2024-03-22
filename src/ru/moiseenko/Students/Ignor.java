/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Students;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Ignor<T> implements Comparable<Message<T>>{
    private List<Message<T>>lstMsg=new ArrayList<>();
    public Ignor(Message<T>...msg){
        for (Message<T> i : msg) {
            this.lstMsg.add(i);
        }
    }
    @Override
    public int compareTo(Message<T> msg) {
        for (Message<T> i : lstMsg){
            if (msg.equals(i)){
                return 1;
            }
        }
        return 0;
    }
    public void addMsg(Message<T>...msg){
        for (Message<T> i : msg) {
            this.lstMsg.add(i);
        }
    }
    
    public void removeMsg(int index){
        lstMsg.remove(index);
    }
}
