/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lomans;



/**
 *
 * @author Serge
 */
public interface Lennable extends Polygonalble{
    double lenLom();
    default void addLomane(Pointt p){
        
    }
    default void addLomaneS(Pointt p, int ln1, int ln2){
        
    }
    default void addLomaneS(Pointt p1, Pointt p2,Pointt p3){
        
    }
}
