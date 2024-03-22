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
public class MeowCount implements Meowable{
    Meowable animal;
    public int count;
    public MeowCount(Meowable animal){
        this.animal=animal;
    }
    @Override
    public void meow(){
        animal.meow();
        count++;
    }
    
}
