/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.convert;

/**
 *
 * @author Serge
 */
public abstract class AbstractConverter {
    Object obj;
    public AbstractConverter(){
        
    }
    protected abstract Object readConverter(Object ob);
    
    protected abstract void funConverter(Object ob);
    
    protected abstract void writeConverter(Object ob);
    
    public final void doConverter(Object ob){
        funConverter(readConverter(ob));
        writeConverter(ob);
    }
    
    public Object getObj(){
        return obj;
    }
}
