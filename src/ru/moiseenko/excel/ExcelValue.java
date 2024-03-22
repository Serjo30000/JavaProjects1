/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.excel;

/**
 *
 * @author Serge
 */
public class ExcelValue<T> implements ExcelCellable<T>{
    private T value;
    private int x;
    private int y;
    public ExcelValue(int x, int y, T value){
        this.x=x;
        this.y=y;
        this.value=value;
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
