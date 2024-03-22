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
public class Parent<T> {
    private List<Relation<T>>lstRelat=new ArrayList<>();
    private Ignor<T> ignor;
    public Parent(Ignor<T> ignor){
        this.ignor=ignor;
    }
    public void alert(Student<T> st,Message<T> msg){
        if (ignor.compareTo(msg)==1){
            for (int i=0;i<lstRelat.size();i++){
                if (st.equals(lstRelat.get(i).getStudent())){
                    lstRelat.get(i).getReaction().react(msg);
                }
            }
        }
    }
    
    public void addRelation(Student<T> st,Reactable<T> react,Favoriteable<T> favorite){
        lstRelat.add(new Relation(st,react,favorite));
    }
    
    public Ignor<T> getIgnor(){
        return ignor;
    }
    
    public Relation<T> getRelat(Student<T> st){
        for (int i=0;i<lstRelat.size();i++){
            if (st.equals(lstRelat.get(i).getStudent())){
                return lstRelat.get(i);
            }
        }
        return null;
    }
}
