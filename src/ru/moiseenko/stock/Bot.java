/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.stock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Bot implements Shareholdable {
    private List<Stock>lstStock=new ArrayList<>();
    private Warningstockable rule;
    
    public Bot(Warningstockable rule){
        this.rule=rule;
    }
    
    @Override
    public void alert(Stock st) {
        for (int i=0;i<lstStock.size();i++){
            if (rule.warning(st,lstStock.get(i))==true){
                lstStock.get(i).setWell(st.getWell());
                System.out.println("надо покупать ORCL");
            }
        }
    }
    
    public void addLstStock(Stock st){
        lstStock.add(new Stock(st));
    }
    
    public Stock getLStock(int x){
        return lstStock.get(x);
    }
}
