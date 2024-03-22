/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Trafficlights;

import java.util.Iterator;

/**
 *
 * @author Serge
 */
public class TrafficLights implements Iterable<Colorable>{
    Colorable color = Color.BLACK;
    
    public void on(){
        color = Color.RED;
    }
    
    public void off(){
        color = Color.BLACK;
    }
    
    public Colorable next(){
        color = color.next();
        return color;
    }

    @Override
    public Iterator<Colorable> iterator() {
        return new LightIterator(color);
    }
}
