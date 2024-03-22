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
public class Dog extends Cat {
    public Dog(String name){
        super(name);
    }
    @Override
    public void meow(){
        System.out.println("Гав");
    }
    @Override
    public void meow(int n){
        for (int i=0;i<n;i++){
            System.out.print("Гав ");
        }
        System.out.println();
    }
    @Override
    public String toString(){
        return "собака: " + getName();
    }
}
