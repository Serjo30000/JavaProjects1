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
public class ExcelFormula<T> implements ExcelCellable<T>{
    private T value;
    private int x;
    private int y;
    private ExcelFormalatable<T> ef;
    List<ExcelCellable<T>>lstEV=new ArrayList<>();
    public ExcelFormula(int x, int y,ExcelFormalatable<T> ef){
        this.x=x;
        this.y=y;
        this.ef=ef;
    }
    
    public ExcelFormula(ExcelFormula<T> eF){
        value=eF.value;
        x=eF.x;
        y=eF.y;
        ef=eF.ef;
        for (ExcelCellable<T> i: eF.lstEV){
            lstEV.add(i);
        }
    }
    
    public void addAddition(ExcelCellable<T> e){
        lstEV.add(e);
        valueForm();
    }
    
    public void removeAddition(int x){
        if (x<0 && x>this.x){
            throw new IllegalArgumentException("Вы вышли из списка");
        }
        lstEV.remove(x);
        valueForm();
    }
    
    public void valueForm(){
        value=ef.formulation(lstEV);
    }
    
    @Override
    public T getValue(){
        return value;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
