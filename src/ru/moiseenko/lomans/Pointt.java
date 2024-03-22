/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lomans;


import java.util.Objects;

/**
 *
 * @author Serge
 */
public class Pointt implements Cloneable, Pointable,Shiftsable{
    int x, y;
    public Pointt(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Pointt(Pointt p){
        this(p.x,p.y);
    }
    @Override
    public String toString(){
        return "{" + x + ";" + y + "}";
    }
    @Override
    public int hashCode(){
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.x);
        hash = 45 * hash + Objects.hashCode(this.y);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass()) return false;
        Pointt p = (Pointt) obj;
        if (this.x!=p.x) return false;
        if (this.y!=p.y) return false;
        return true;
    }
    @Override
    public Pointt clone() throws CloneNotSupportedException{
        try{
            return (Pointt)super.clone();
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public void shiftCoordinate(String nameC, int c) {
        if (nameC.equals("x")){
            this.x=this.x+c;
        }
        else if (nameC.equals("y")){
            this.y=this.y+c;
        }
    }
}
