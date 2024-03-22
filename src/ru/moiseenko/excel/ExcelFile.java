/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.excel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class ExcelFile<T> {
    private List<List<ExcelCellable<T>>>lstE=new ArrayList<>();
    private int x=0;
    private int y=0;
    public ExcelFile(int x,int y){
        if (x<0 || y<0){
            throw new IllegalArgumentException("Отрицательная координата");
        }
        this.x=x;
        this.y=y;
        lstE=new ArrayList<>(this.x);
        for (int i=0;i<this.x;i++){
            lstE.add(new ArrayList<>());
            for (int j=0;j<this.y;j++){
                lstE.get(i).add(null);
            }
        }
    }
    
    public void add(int x,int y,ExcelCellable<T> e){
        if (x<0 && x>this.x || y<0 && y>this.y){
            throw new IllegalArgumentException("Вы вышли из таблицы");
        }
        lstE.get(x).set(y, e);
    }
    
    public void remove(int x,int y){
        if (x<0 && x>this.x || y<0 && y>this.y){
            throw new IllegalArgumentException("Вы вышли из таблицы");
        }
        lstE.get(x).set(y, null);
    }
    
    public List<List<ExcelCellable<T>>> getLstE(){
        return new ArrayList<>(lstE);
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
