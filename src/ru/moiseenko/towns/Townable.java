/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.towns;

/**
 *
 * @author Serge
 */
public interface Townable {
    void addRoad(Road r);
    default void addRoad(Road r, SmartTown t){
        
    }
}
