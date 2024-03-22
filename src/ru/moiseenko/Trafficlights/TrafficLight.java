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
public class TrafficLight{
    Colorable color = Black.blackColor;
    
    public void on(){
        color = Red.redColor;
    }
    
    public void off(){
        color = Black.blackColor;
    }
    
    public Colorable next(){
        color = color.next();
        return color;
    }
}
