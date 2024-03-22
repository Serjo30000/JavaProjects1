/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.stock;

import java.util.Objects;

/**
 *
 * @author Serge
 */
public class Stock {
    private final String name;
    private int well;
    
    public Stock(String name,int well){
        this.name=name;
        this.well=well;
    }
    
    public Stock(Stock st){
        this.name=st.name;
        this.well=st.well;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWell(){
        return well;
    }
    
    public void setWell(int well){
        this.well=well;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}
