/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.humans;

/**
 *
 * @author Serge
 */
public class Humane {
    private Name fio;
    private String name;
    private final Humane father;
    private int heigth;
    public Humane(String name, int heigth){
        this(name,null,heigth,null);
    }
    public Humane(String name, int heigth, Humane father){
        this(name,null,heigth,father);
    }
    public Humane(Name fio, int heigth){
        this(null,fio,heigth,null);
    }
    public Humane(Name fio, int heigth, Humane father){
        this(null,fio,heigth,father);
    }
    private Humane(String name, Name fio, int heigth, Humane father){
        if (heigth<0 || heigth>500){
            throw new IllegalArgumentException("Вы ввели недопустимый рост человека.");
        }
        this.name=name;
        if (fio==null){
            this.fio=new Name(name);
        }
        else{
            this.fio=fio;
        }
        this.heigth=heigth;
        this.father=father;
    }
    
    public int getHeigth(){
        return heigth;
    }
    
    public void setHeigth(int h){
        if (h<0 || h>500){
            throw new IllegalArgumentException("Вы ввели недопустимый рост человека.");
        }
        heigth=h;
    }
    
    public Humane getFather(){
        return father;
    }
    
    public Name getFIO(){
        return fio;
    }
    
    public String getName(){
        return name;
    }
    
    public void humanHelper(){
        if (fio.getFamily()==null && father!=null && father.fio.getFamily()!=null){
            fio.setFamily(father.fio.getFamily());
        }
        if (fio.getSecondName()==null &&  father!=null && father.fio.getFirstName()!=null && father.fio.getFirstName().equals("Сергей")){
            fio.setSecondName("Сергеевич");
        }
        else if (fio.getSecondName()==null &&  father!=null && father.fio.getFirstName()!=null && father.fio.getFirstName().equals("Лев")){
            fio.setSecondName("Львович");
        }
        else if (fio.getSecondName()==null &&  father!=null && father.fio.getFirstName()!=null){
            fio.setSecondName(father.fio.getFirstName() + "ович");
        }
    }

    @Override
    public String toString(){
        String str2="";
        if (father==null){
            str2="Человека с Именем " + fio + "и ростом " + heigth;
        }
        else if (father.fio.getFirstName()!=null){
            humanHelper();
            str2="Человека с Именем " + fio + "и ростом " + heigth + " и отцом " + father.fio.getFirstName();
        }
        return str2;
    }
}
