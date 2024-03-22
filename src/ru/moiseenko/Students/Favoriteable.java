/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Students;

/**
 *
 * @author Serge
 */
public interface Favoriteable<T> {
    boolean favorite(Student<T> st);
}
