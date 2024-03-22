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
public final class Black implements Colorable{
    final static Colorable blackColor=new Black();
    private Black(){

    }
    @Override
    public String toString(){
        return "Чёрный";
    }
    @Override
    public Colorable next() {
        return blackColor;
    }
    
}
