/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.towns;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Serge
 */
public class SmartTown extends Town{
    public SmartTown(String name, List<Road> listTown){
        super(name, listTown);
    }
    @Override
    public void addRoad(Road r, SmartTown t){
        super.addRoad(r);
        r.getTown().addRoad(new Road(new Town(t.getName(),t.getlistTown()),r.getPrice()));
    }
    
    @Override
    public int compare(List<Road> listTown1,List<Road> listTown2) {
        if (listTown1.size()!=listTown2.size()){
            return 0;
        }
        else if (listTown1.isEmpty() && listTown2.isEmpty()){
            return 1;
        }
        for (int i=0;i<listTown1.size();i++){
            if (!(listTown1.get(i).getTown().getName().equals(listTown2.get(i).getTown().getName()) && listTown1.get(i).getPrice()==listTown2.get(i).getPrice())){
                return 0;
            }
        }
        return 1;
    }
    
    @Override
    public int hashCode(){
        int hash = 3;
        for (int i=0;i<getlistTown().size();i++){
            hash = 3 * hash + Objects.hashCode(this.getlistTown().get(i).getTown().getName());
            hash = 5 * hash + Objects.hashCode(this.getlistTown().get(i).getPrice());
        }
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()==this.getClass()){
            Town ln = (SmartTown) obj;
            return compare(this.getlistTown(),ln.getlistTown())==1;
        }
        if (obj instanceof Town){
            Town tw = (Town) obj;
            return compare(this.getlistTown(),tw.getlistTown())==1;
        }
        return false;
    }
    
}
