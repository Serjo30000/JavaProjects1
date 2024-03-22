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
public class Name {
    private String firstName, secondName, family;
    public Name(String firstName){
        this(firstName, null, null);
    }
    public Name(String firstName, String family){
        this(firstName, family, null);
    }
    public Name(String firstName, String family, String secondName){
        if (((firstName==null || firstName.equals("")) && (family==null || family.equals("")) && (secondName==null || secondName.equals("")))){
            throw new IllegalArgumentException("Вы ввели пустую строку.");
        }
        this.firstName=firstName;
        this.family=family;
        this.secondName=secondName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String s){
        if (s!=null && !s.equals("")){
            firstName=s;
        }
    }
    
    public String getSecondName(){
        return secondName;
    }
    
    public void setSecondName(String s){
        if (s!=null && !s.equals("")){
            secondName=s;
        }
    }
    
    public String getFamily(){
        return family;
    }
    
    public void setFamily(String s){
        if (s!=null && !s.equals("")){
            family=s;
        }
    }
    
    @Override
    public String toString(){
        String str="";
        if (firstName!=null){
            str+=firstName+" ";
        }
        if (secondName!=null){
            str+=secondName+" ";
        }
        if (family!=null){
            str+=family+" ";
        }
        return str;
    }
}
