/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.potoks;

/**
 *
 * @author Serge
 */
public interface Changer<T,R> {
    R act(T y);
}
