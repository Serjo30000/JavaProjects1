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
public class Rectangle implements Sfigurable,Shiftable{
    Point t;
    final private int n1,n2;
    private Lenable l;
    public Rectangle(){
        this(0,0,0,0,new LomUnclosed());
    }
    public Rectangle(Point t, int n1, int n2, LomUnclosed l){
        this(t.x,t.y,n1,n2,l);
    }
    public Rectangle(int x, int y, int n1, int n2,LomUnclosed l){
        t = new Point(x,y);
        if (n1<0 || n2<0){
            throw new IllegalArgumentException("Вы ввели недопустимые стороны.");
        }
        this.n1=n1;
        this.n2=n2;
        this.l=l;
    }
    public int getN1(){
        return n1;
    }
    public int getN2(){
        return n2;
    }
    @Override
    public double sFigure(){
        return n1*n2;
    }
    @Override
    public Lenable getPolygonalChain(){
        return l;
    }
    @Override
    public void polygonalChain(){
        l.addLomaneS(t,n1,n2);
    }
    public boolean isSquare(){
        if (n1==n2){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        if (!isSquare()){
            return "Прямоугольник в точке " + t + " со сторонами " + n1 + ", " + n2;
        }
        else{
            return "Квадрат в точке " + t + " со стороной " + n1;
        }
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
