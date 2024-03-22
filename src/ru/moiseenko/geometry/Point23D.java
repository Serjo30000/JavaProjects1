/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Serge
 */
public class Point23D {
    private List<Integer> points=new ArrayList<>(); 
    private Point23D(int x, int y){
        points=new ArrayList<>();
        this.points.add(x);
        this.points.add(y);
    }
    
    private Point23D(int x, int y, int z){
        this(x,y);
        this.points.add(z);
    }
    
    public static Point23D create(int...point){
        if (point.length==2){
            return new Point23D(point[0],point[1]);
        }
        else if (point.length==3){
            return new Point23D(point[0],point[1],point[2]);
        }
        return null;
    }
    
    @Override
    public String toString(){
        if (points.size()==2){
            return "{" + points.get(0) + ";" + points.get(1) + "}";
        }
        else{
            return "{" + points.get(0) + ";" + points.get(1) + ";" + points.get(2) + "}";
        }
    }
    @Override
    public int hashCode(){
        return Objects.hash(points);
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass()) return false;
        Point23D p = (Point23D) obj;
        return Objects.equals(this.points, p.points);
    }
    @Override
    public Point23D clone() throws CloneNotSupportedException{
        try{
            return (Point23D)super.clone();
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
