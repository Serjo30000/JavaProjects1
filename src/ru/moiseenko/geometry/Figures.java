/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.geometry;

/**
 *
 * @author Serge
 */
public abstract class Figures {
    final Point t1;
    public Figures(Point t1){
        this.t1=t1;
    }
    
    abstract double sFigure();
}
