/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Trafficlights;

/**
 *
 * @author Serge
 */
public final class Red implements Colorable {
    final static Colorable redColor=new Red();
    private Red(){
        
    }
    @Override
    public String toString(){
        return "Красный";
    }
    
    @Override
    public Colorable next() {
        return Green.greenColor;
    }
    
}
