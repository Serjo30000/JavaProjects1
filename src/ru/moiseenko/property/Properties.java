/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.property;

/**
 *
 * @author Serge
 */
public class Properties {
    private String name;
    private Object obj;
    public Properties(String name){
        if (name==null){
            throw new IllegalArgumentException("Пустое имя");
        }
        this.name=name;
    }
    public Properties(Object obj){
        if (obj==null){
            throw new IllegalArgumentException("Пустой объект");
        }
        this.obj=obj;
    }
    public String getName(){
        return name;
    }
    public Object getObj(){
        return obj;
    }
    public void setName(String nam){
        if (nam==null){
            throw new IllegalArgumentException("Пустое имя");
        }
        name=nam;
    }
    public void setObj(Object objj){
        if (obj==null){
            throw new IllegalArgumentException("Пустой объект");
        }
        obj=objj;
    }
    @Override
    public String toString(){
        if (name!=null){
            return name;
        }
        else{
            return ""+obj;
        }
        
    }
}
