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
public final class Green implements Colorable{
    final static Colorable greenColor=new Green();
    private Green(){
        
    }
    @Override
    public String toString(){
        return "Зелёный";
    }
    
    @Override
    public Colorable next() {
        return Yellow.yellowColor;
    }
    
}
