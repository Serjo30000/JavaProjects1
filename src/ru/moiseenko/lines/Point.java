/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lines;

import java.util.Objects;

/**
 *
 * @author Serge
 */
public class Point implements Cloneable, Pointable{
    final int x, y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p){
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
        Point p = (Point) obj;
        if (this.x!=p.x) return false;
        if (this.y!=p.y) return false;
        return true;
    }
    @Override
    public Point clone() throws CloneNotSupportedException{
        try{
            return (Point)super.clone();
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
