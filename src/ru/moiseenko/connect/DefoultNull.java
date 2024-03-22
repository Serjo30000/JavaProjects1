/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.connect;

import java.util.Objects;

/**
 *
 * @author Serge
 */
public class DefoultNull<Connection> {
    private static final DefoultNull<?> EMPTY = new DefoultNull<>(null);
    private final Connection value;
    public static<Connection> DefoultNull<Connection> empty() {
        DefoultNull<Connection> t = (DefoultNull<Connection>) EMPTY;
        return t;
    }
    
    private DefoultNull(Connection value) {
        this.value = value;
    }
    
    public static <Connection> DefoultNull<Connection> of(Connection value) {
        return new DefoultNull<>(Objects.requireNonNull(value));
    }
    
    public Connection get() {
        if (value == null) {
            throw new IllegalArgumentException("Не правильно вернулось значение");
        }
        return value;
    }
}
