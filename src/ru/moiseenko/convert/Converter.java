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
public class Converter extends AbstractConverter{
    public Converter(){
        super();
    }
    private Converter(Object ob){
        obj=ob;
    }
    @Override
    protected Object readConverter(Object ob) {
        return new Converter(ob).obj;
    }

    @Override
    protected void funConverter(Object ob) {
        if (!(obj==null || ob==obj || ob.getClass()==obj.getClass())){
            obj=null;
        }
    }

    @Override
    protected void writeConverter(Object ob) {
        obj=new Converter(ob).obj;
    }
}