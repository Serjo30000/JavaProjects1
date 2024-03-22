/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lomans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Serge
 */
public class LomanUnclosed implements Lennable, Cloneable, Comparator<List<Pointt>>{
    private List<Pointt> points;
    public LomanUnclosed(){
        this(new ArrayList<>());
    }
    public LomanUnclosed(List<Pointt> points){
        if (points==null){
            throw new IllegalArgumentException("Пустой список");
        }
        this.points=Arrays.asList(new Pointt[points.size()]);
        for (int i=0;i<points.size();i++){
            this.points.set(i, new Pointt(points.get(i)));
        }
    }
    public List<Pointt> getLom(){
        return List.copyOf(points);
    }
    public void setLom(List<Pointt> points1){
        if (points1==null){
            throw new IllegalArgumentException("Вы ввели пустой список");
        }
        points=Arrays.asList(new Pointt[points1.size()]);
        for (int i=0;i<points1.size();i++){
            points.set(i, new Pointt(points1.get(i)));
        }
    }
    @Override
    public void addLomane(Pointt p){
        List <Pointt> points1 = new ArrayList<>();
        for (int i=0;i<points.size();i++){
            points1.add(new Pointt(points.get(i)));
        }
        points1.add(p);
        points=Arrays.asList(new Pointt[points1.size()]);
        for (int i=0;i<points1.size();i++){
            points.set(i, new Pointt(points1.get(i)));
        }
    }
    @Override
    public void addLomaneS(Pointt p, int ln1, int ln2){
        List<Pointt> point=new ArrayList<>();
        point.add(new Pointt(p));
        point.add(new Pointt(p.x+ln1,p.y));
        point.add(new Pointt(p.x+ln1,p.y-ln2));
        point.add(new Pointt(p.x,p.y-ln2));
        points=Arrays.asList(new Pointt[point.size()]);
        for (int i=0;i<point.size();i++){
            points.set(i, new Pointt(point.get(i)));
        }
    }
    @Override
    public void addLomaneS(Pointt p1, Pointt p2,Pointt p3){
        List<Pointt> point=new ArrayList<>();
        point.add(new Pointt(p1));
        point.add(new Pointt(p2));
        point.add(new Pointt(p3));
        points=Arrays.asList(new Pointt[point.size()]);
        for (int i=0;i<point.size();i++){
            points.set(i, new Pointt(point.get(i)));
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
    public Lennable getPolygonalChain(){
        return new LomanUnclosed(getLom());
    }
    @Override
    public String toString(){
        return "Линия " + points;
    }
    
    @Override
    public int compare(List<Pointt> points1, List<Pointt> points2) {
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
            LomanUnclosed ln = (LomanUnclosed) obj;
            return compare(this.points,ln.points)==1;
        }
        if (obj instanceof LomamClosed){
            LomanUnclosed ln = (LomamClosed) obj;
            return compare(this.points,ln.points)==1;
        }
        return false;
    }
    @Override
    public LomanUnclosed clone() throws CloneNotSupportedException{
        try{
            LomanUnclosed lm = (LomanUnclosed)super.clone();
            lm.setLom(getLom());
            return lm;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
