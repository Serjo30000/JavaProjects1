/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Trafficlights;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Color implements Colorable{
    private String colorName;
    private Color colorNext;
    public static final Color GREEN = new Color("Green");
    public static final Color RED = new Color("Red");
    public static final Color BLACK = new Color("Black");
    
    private Color(String colorName){
        this.colorName=colorName;
    }
    
    static{
        GREEN.colorNext=RED;
        RED.colorNext=GREEN;
        BLACK.colorNext=BLACK;
    }
    
    @Override
    public Colorable next() {
        return colorNext;
    }
    
    @Override
    public String toString(){
        return colorName;
    }
}
