/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.towns;

/**
 *
 * @author Serge
 */
public class Road {
    private Town town;
    private int price;
    public Road(Town town){
        this(town, 0);
    }
    public Road(Town town, int price){
        if (town==null){
            throw new IllegalArgumentException("Вы ввели неправильно город.");
        }
        this.town=town;
        if (price<0){
            throw new IllegalArgumentException("Вы ввели неправильно цену пути.");
        }
        this.price=price;
    }
    
    public Town getTown(){
        return town;
    }
    
    public void setTown(Town t){
        if (t==null){
            throw new IllegalArgumentException("Вы ввели пустой город.");
        }
        for (int i=0;i<town.getlistTown().size();i++){
            if (t.getName().equals(town.getlistTown().get(i).getTown().getName())){
                throw new IllegalArgumentException("Вы ввели несколько прямых дорог между городами.");
            }
        }
        town=new Town (t.getName(),t.getlistTown());
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int pr){
        if (pr<0){
            throw new IllegalArgumentException("Вы ввели неправильно цену пути.");
        }
        price=pr;
    }
    
    @Override
    public String toString(){
        if (price>0){
            return "" + town.getName() + ": " + price +" ";
        }
        else{
            return "" + town.getName() + " ";
        }
    }
}
