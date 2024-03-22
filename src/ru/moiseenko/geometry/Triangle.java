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
public class Triangle implements Sfigurable,Shiftable{
    Point t1,t2,t3;
    private Lenable l;
    public Triangle(){
        this(0,0,0,0,0,0,new LomUnclosed());
    }
    public Triangle(Point t1, Point t2, Point t3, LomUnclosed l){
        this(t1.x,t1.y,t2.x,t2.y,t3.x,t3.y,l);
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3,LomUnclosed l){
        if ((Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))+Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-3)))<Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1))||(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))+Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)))<Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-3))||(Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-3))+Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)))<Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))){
            throw new IllegalArgumentException("Вы ввели несуществующий треугольник.");
        }
        t1=new Point(x1,y1);
        t2=new Point(x2,y2);
        t3=new Point(x3,y3);
        this.l=l;
    }
    @Override
    public double sFigure(){
        double p=(Math.sqrt((t1.x-t2.x)*(t1.x-t2.x)+(t1.y-t2.y)*(t1.y-t2.y))+Math.sqrt((t2.x-t3.x)*(t2.x-t3.x)+(t2.y-t3.y)*(t2.y-t3.y))+Math.sqrt((t3.x-t1.x)*(t3.x-t1.x)+(t3.y-t1.y)*(t3.y-t1.y)))/2;
        return Math.sqrt(p*(p-Math.sqrt((t1.x-t2.x)*(t1.x-t2.x)+(t1.y-t2.y)*(t1.y-t2.y)))*(p-Math.sqrt((t2.x-t3.x)*(t2.x-t3.x)+(t2.y-t3.y)*(t2.y-t3.y)))*(p-Math.sqrt((t3.x-t1.x)*(t3.x-t1.x)+(t3.y-t1.y)*(t3.y-t1.y))));
    }
    @Override
    public Lenable getPolygonalChain(){
        return l;
    }
    @Override
    public void polygonalChain(){
        l.addLomaneS(t1,t2,t3);
    }
    @Override
    public String toString(){
        return "Треугольник в точках " + t1 + ", " + t2 + ", " + t3;
    }
    @Override
    public void shiftCoordinate(String nameC, int c) {
        if (nameC.equals("x")){
            t1=new Point(t1.x+c,t1.y);
            t2=new Point(t2.x+c,t2.y);
            t3=new Point(t3.x+c,t3.y);
        }
        else if (nameC.equals("y")){
            t1=new Point(t1.x,t1.y+c);
            t2=new Point(t2.x,t2.y+c);
            t3=new Point(t3.x,t3.y+c);
        }
    }
}
