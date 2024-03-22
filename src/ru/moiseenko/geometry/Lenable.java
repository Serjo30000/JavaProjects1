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
public interface Lenable extends Polygonable{
    double lenLom();
    default void addLomane(Point p){
        
    }
    default void addLomaneS(Point p, int ln1, int ln2){
        
    }
    default void addLomaneS(Point p1, Point p2,Point p3){
        
    }
}
