/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.animals;

/**
 *
 * @author Serge
 */
public interface Meowable {
    void meow();
    default void meow(int n){
        
    }
    
}
