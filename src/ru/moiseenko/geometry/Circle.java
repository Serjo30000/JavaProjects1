/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.geometry;

/**
 *
 * @author Serge
 */
public class Circle implements Sfigurable,Shiftable{
    Point t;
    final private int r;
    public Circle(){
        this(0,0,0);
    }
    public Circle(Point t, int r){
        this(t.x,t.y,r);
    }
    public Circle(int x, int y, int r){
        t=new Point(x,y);
        if (r<0){
            throw new IllegalArgumentException("Вы ввели недопустимый радиус.");
        }
        this.r=r;
    }
    public int getR(){
        return r;
    }
    @Override
    public double sFigure(){
        return r*r*Math.PI;
    }
    
    @Override
    public String toString(){
        return "Круг в точке " + t + " с радиусом " + r;
    }

    @Override
    public void shiftCoordinate(String nameC, int c) {
        if (nameC.equals("x")){
            t=new Point(t.x+c,t.y);
        }
        else if (nameC.equals("y")){
            t=new Point(t.x,t.y+c);
        }
    }
}
