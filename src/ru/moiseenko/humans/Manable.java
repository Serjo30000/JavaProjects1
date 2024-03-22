/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.humans;

/**
 *
 * @author Serge
 */
public interface Manable {
    ManRuleable getRule();
    String getName();
    int getId();
    default String getJob(){
        return null;
    }
}
