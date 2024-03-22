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
public class Catodog implements Meowable{
    Cat cat;
    Dog dog;
    public Catodog(Cat cat,Dog dog){
        this.cat=cat;
        this.dog=dog;
    }
    @Override
    public void meow(){
        cat.meow();
        dog.meow();
    }
    @Override
    public String toString(){
        return "Котопёс: " + cat.getName() + " и " + dog.getName();
    }
}
