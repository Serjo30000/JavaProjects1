/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Serge
 */
public class LomUnclosed implements Lenable, Cloneable, Comparator<List<Point>>{
    private List<Point> points;
    public LomUnclosed(){
        this(new ArrayList<>());
    }
    public LomUnclosed(List<Point> points){
        if (points==null){
            throw new IllegalArgumentException("Пустой список");
        }
        this.points=Arrays.asList(new Point[points.size()]);
        for (int i=0;i<points.size();i++){
            this.points.set(i, new Point(points.get(i)));
        }
    }
    public List<Point> getLom(){
        return List.copyOf(points);
    }
    public void setLom(List<Point> points1){
        if (points1==null){
            throw new IllegalArgumentException("Вы ввели пустой список");
        }
        points=Arrays.asList(new Point[points1.size()]);
        for (int i=0;i<points1.size();i++){
            points.set(i, new Point(points1.get(i)));
        }
    }
    @Override
    public void addLomane(Point p){
        List <Point> points1 = new ArrayList<>();
        for (int i=0;i<points.size();i++){
            points1.add(new Point(points.get(i)));
        }
        points1.add(p);
        points=Arrays.asList(new Point[points1.size()]);
        for (int i=0;i<points1.size();i++){
            points.set(i, new Point(points1.get(i)));
        }
    }
    @Override
    public void addLomaneS(Point p, int ln1, int ln2){
        List<Point> point=new ArrayList<>();
        point.add(new Point(p));
        point.add(new Point(p.x+ln1,p.y));
        point.add(new Point(p.x+ln1,p.y-ln2));
        point.add(new Point(p.x,p.y-ln2));
        points=Arrays.asList(new Point[point.size()]);
        for (int i=0;i<point.size();i++){
            points.set(i, new Point(point.get(i)));
        }
    }
    @Override
    public void addLomaneS(Point p1, Point p2,Point p3){
        List<Point> point=new ArrayList<>();
        point.add(new Point(p1));
        point.add(new Point(p2));
        point.add(new Point(p3));
        points=Arrays.asList(new Point[point.size()]);
        for (int i=0;i<point.size();i++){
            points.set(i, new Point(point.get(i)));
        }
    }
    @Override
    public double lenLom(){
        double lenn=0;
        if (points.size()>1){
            for (int i=0;i<points.size()-1;i++){
                lenn+=Math.sqrt((points.get(0).x-points.get(1).x)*(points.get(0).x-points.get(1).x)+(points.get(0).y-points.get(1).y)*(points.get(0).y-points.get(1).y));
            }
        }
        return lenn;
    }
    @Override
    public Lenable getPolygonalChain(){
        return new LomUnclosed(getLom());
    }
    @Override
    public String toString(){
        return "Линия " + points;
    }
    
    @Override
    public int compare(List<Point> points1, List<Point> points2) {
        if (points1.size()!=points2.size()){
            return 0;
        }
        else if (points1.isEmpty() && points2.isEmpty()){
            return 1;
        }
        for (int i=0;i<points1.size();i++){
            if (!(points1.get(i).x==points2.get(i).x && points1.get(i).y==points2.get(i).y)){
                return 0;
            }
        }
        return 1;
    }
    
    @Override
    public int hashCode(){
        int hash = 3;
        hash = 3 * hash + Objects.hashCode(this.points);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()==this.getClass()){
            LomUnclosed ln = (LomUnclosed) obj;
            return compare(this.points,ln.points)==1;
        }
        if (obj instanceof LomClosed){
            LomUnclosed ln = (LomClosed) obj;
            return compare(this.points,ln.points)==1;
        }
        return false;
    }
    @Override
    public LomUnclosed clone() throws CloneNotSupportedException{
        try{
            LomUnclosed lm = (LomUnclosed)super.clone();
            lm.setLom(getLom());
            return lm;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
