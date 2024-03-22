/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Points {
    private List <Properties> prop;
    public Points(){
        this(new ArrayList<>());
    }
    public Points(List <Properties> prop){
        if (prop==null){
            throw new IllegalArgumentException("Пустой список.");
        }
        this.prop=Arrays.asList(new Properties[prop.size()]);
        for (int i=0;i<prop.size();i++){
            this.prop.set(i, new Properties(prop.get(i)));
        }
    }
    public void addProp(Properties pr){
        List <Properties> props = new ArrayList<>();
        for (int i=0;i<prop.size();i++){
            props.add(prop.get(i));
        }
        props.add(pr);
        prop=Arrays.asList(new Properties[props.size()]);
        for (int i=0;i<props.size();i++){
            prop.set(i, new Properties(props.get(i)));
        }
    }
    
    public List <Properties> getListprop(){
        return List.copyOf(prop);
    }
    
    public void setListprop(List <Properties> props){
        prop=Arrays.asList(new Properties[props.size()]);
        for (int i=0;i<props.size();i++){
            prop.set(i, new Properties(props.get(i)));
        }
    }
    
    @Override
    public String toString(){
        String str="Точка в координате ";
        for (int i=0;i<prop.size();i++){
            str+=prop.get(i);
            if (i!=prop.size()-1){
                str+=", ";
            }
        }
        return str;
    }
}
