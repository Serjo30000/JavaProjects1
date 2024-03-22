/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.generationname;

import java.util.Objects;

/**
 *
 * @author Serge
 */
public class NameGener {
    private String firstName, secondName, family;
    public NameGener(String firstName){
        this(firstName, null, null);
    }
    public NameGener(String firstName, String family){
        this(firstName, family, null);
    }
    public NameGener(String firstName, String family, String secondName){
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
    public int hashCode() {
        return Objects.hash(firstName, secondName, family);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final NameGener other = (NameGener) obj;
        if (!(Objects.equals(this.firstName, other.firstName)||Objects.equals(this.firstName, other.secondName)||Objects.equals(this.firstName, other.family))) {
            return false;
        }
        if (!(Objects.equals(this.secondName, other.firstName)||Objects.equals(this.secondName, other.secondName)||Objects.equals(this.secondName, other.family))) {
            return false;
        }
        if (!(Objects.equals(this.family, other.firstName)||Objects.equals(this.family, other.secondName)||Objects.equals(this.family, other.family))) {
            return false;
        }
        return true;
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
