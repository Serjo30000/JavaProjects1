/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.taskmanager;

/**
 *
 * @author Serge
 */
public interface Taskable<T> {
    boolean make(Tasks<T> t,T...lstT);
}
