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
public interface Polygonable{
    default void polygonalChain(){
        
    }
    default Lenable getPolygonalChain(){
        return null;
    }
}
