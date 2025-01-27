/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lomans;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Serge
 */
public class LomamClosed extends LomanUnclosed{
    public LomamClosed(){
        this(new ArrayList<>());
    }
    public LomamClosed(List<Pointt> points){
        super(points);
    }
    @Override
    public double lenLom(){
        double lenn=Math.sqrt((getLom().get(0).x-getLom().get(getLom().size()-1).x)*(getLom().get(0).x-getLom().get(getLom().size()-1).x)+(getLom().get(0).y-getLom().get(getLom().size()-1).y)*(getLom().get(0).y-getLom().get(getLom().size()-1).y));
        return super.lenLom()+lenn;
    }
        @Override
    public Lennable getPolygonalChain(){
        return new LomamClosed(getLom());
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
        hash = 3 * hash + Objects.hashCode(this.getLom());
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()==this.getClass()){
            LomanUnclosed ln = (LomamClosed) obj;
            return compare(this.getLom(),ln.getLom())==1;
        }
        if (obj instanceof LomanUnclosed){
            LomanUnclosed ln = (LomanUnclosed) obj;
            return compare(this.getLom(),ln.getLom())==1;
        }
        return false;
    }
    @Override
    public LomamClosed clone() throws CloneNotSupportedException{
        try{
            LomamClosed lm = (LomamClosed)super.clone();
            lm.setLom(getLom());
            return lm;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
