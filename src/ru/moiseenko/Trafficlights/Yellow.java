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
public final class Yellow implements Colorable {
    final static Colorable yellowColor=new Yellow();
    private Yellow(){
        
    }
    @Override
    public String toString(){
        return "Жёлтый";
    }

    @Override
    public Colorable next() {
        return Red.redColor;
    }
    
}
