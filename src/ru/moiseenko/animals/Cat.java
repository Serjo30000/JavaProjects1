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
public class Cat implements Meowable{
    private final String name;
    public Cat(String name){
        if (name==null){
            throw new IllegalArgumentException("Вы ввели неправильно имя кота.");
        }
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void meow(){
        System.out.println("Мяу");
    }
    @Override
    public void meow(int n){
        for (int i=0;i<n;i++){
            System.out.print("Мяу ");
        }
        System.out.println();
    }
    @Override
    public String toString(){
        return "кот: " + name;
    }
}
