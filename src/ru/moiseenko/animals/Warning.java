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
public class Warning implements Meowable{
    Meowable animal;
    public Warning(Meowable animal){
        this.animal=animal;
    }
    @Override
    public void meow() {
        System.out.println("Внимание");
        animal.meow();
    }
    
}
