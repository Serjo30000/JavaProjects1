/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Students;
import java.util.Objects;
/**
 *
 * @author Serge
 */
public class DefoltT<Student> {
    private static final DefoltT<?> EMPTY = new DefoltT<>(null);
    private final Student value;
    public static<Student> DefoltT<Student> empty() {
        DefoltT<Student> t = (DefoltT<Student>) EMPTY;
        return t;
    }
    
    private DefoltT(Student value) {
        this.value = value;
    }
    
    public static <Student> DefoltT<Student> of(Student value) {
        return new DefoltT<>(Objects.requireNonNull(value));
    }
    
    public Student get() {
        if (value == null) {
            throw new IllegalArgumentException("Не правильно вернулось значение");
        }
        return value;
    }
}
