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
public class LightIterator implements Iterator<Colorable>{
    Colorable t;
    public LightIterator(Colorable color){
        this.t=color;
    }
    @Override
    public boolean hasNext() {
        if (t==Color.BLACK)return false;
        return true;
    }

    @Override
    public Colorable next() {
        t=t.next();
        return t;
    }
    
}
