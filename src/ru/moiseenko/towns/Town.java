/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.towns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Comparator;
/**
 *
 * @author Serge
 */
public class Town implements Townable, Comparator<List<Road>>{
    private String name;
    private List<Road> listTown;
    public Town(String name, List<Road> listTown){
        if (name==null){
            throw new IllegalArgumentException("Вы ввели пустое имя.");
        }
        this.name=name;
        for (int i=0;i<listTown.size();i++){
            int k=0;
            for (int j=0;j<listTown.size();j++){
                if (listTown.get(i).getTown().name.equals(listTown.get(j).getTown().name)){
                    k++;
                }
                if (k>1){
                    throw new IllegalArgumentException("Вы ввели несколько прямых дорог между городами.");
                }
            }
        }
        this.listTown=Arrays.asList(new Road[listTown.size()]);
        for (int i=0;i<listTown.size();i++){
            this.listTown.set(i, new Road(listTown.get(i).getTown(),listTown.get(i).getPrice()));
        }
    }
    
    public void removeRoad(int index){
        List <Road> listTowns = new ArrayList<>();
        for (int i=0;i<listTown.size();i++){
            listTowns.add(new Road(listTown.get(i).getTown(),listTown.get(i).getPrice()));
        }
        if (index>=listTowns.size() || index<0){
            throw new IllegalArgumentException("Вы удаляете несуществующий элемент списка.");
        }
        listTowns.remove(index);
        listTown=Arrays.asList(new Road[listTowns.size()]);
        for (int i=0;i<listTowns.size();i++){
            listTown.set(i, new Road(listTowns.get(i).getTown(),listTowns.get(i).getPrice()));
        }
    }
    @Override
    public void addRoad(Road r){
        List <Road> listTowns = new ArrayList<>();
        
        for (int i=0;i<listTown.size();i++){
            listTowns.add(new Road(listTown.get(i).getTown(),listTown.get(i).getPrice()));
        }
        listTowns.add(r);
        for (int i=0;i<listTowns.size();i++){
            int k=0;
            for (int j=0;j<listTowns.size();j++){
                if (listTowns.get(i).getTown().name.equals(listTowns.get(j).getTown().name)){
                    k++;
                }
                if (k>1){
                    throw new IllegalArgumentException("Вы добавили несколько прямых дорог между городами.");
                }
            }
        }
        listTown=Arrays.asList(new Road[listTowns.size()]);
        for (int i=0;i<listTowns.size();i++){
            listTown.set(i, new Road(listTowns.get(i).getTown(),listTowns.get(i).getPrice()));
        }
    }
    public String getName(){
        return name;
    }
    
    public void setName(String names){
        int k=0;
        for (int j=0;j<listTown.size();j++){
            if (name.equals(listTown.get(j).getTown().name)){
                k++;
            }
            if (k==1){
                throw new IllegalArgumentException("Вы добавили несколько прямых дорог между городами.");
            }
        }
        name=names;
    }
    
    public List<Road> getlistTown(){
        return List.copyOf(listTown);
    }
    
    public void setlistTown(List <Road> listTowns){
        for (int i=0;i<listTowns.size();i++){
            int k=0;
            for (int j=0;j<listTowns.size();j++){
                if (listTowns.get(i).getTown().name.equals(listTowns.get(j).getTown().name)){
                    k++;
                }
                if (k>1){
                    throw new IllegalArgumentException("Вы добавили несколько прямых дорог между городами.");
                }
            }
        }
        listTown=Arrays.asList(new Road[listTowns.size()]);
        for (int i=0;i<listTowns.size();i++){
            listTown.set(i, new Road(listTowns.get(i).getTown(),listTowns.get(i).getPrice()));
        }
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
        for (int i=0;i<listTown.size();i++){
            hash = 3 * hash + Objects.hashCode(this.listTown.get(i).getTown().getName());
            hash = 5 * hash + Objects.hashCode(this.listTown.get(i).getPrice());
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()==this.getClass()){
            Town tw = (Town) obj;
            return compare(this.listTown,tw.listTown)==1;
        }
        if (obj instanceof SmartTown){
            Town tw = (SmartTown) obj;
            return compare(this.listTown,tw.listTown)==1;
        }
        return false;
    }
    
    @Override
    public String toString(){
        String str="";
        for (int i=0;i<listTown.size();i++){
            str+=listTown.get(i);
        }
        return name + " - " + str;
    }
}
