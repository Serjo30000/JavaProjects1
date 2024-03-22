/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.builds;

/**
 *
 * @author Serge
 */
public class Home {
    private final int floor;
    public Home(int floor){
        if (floor<=0){
            throw new IllegalArgumentException("Вы ввели недопустимое количество этажей.");
        }
        this.floor=floor;
    }
    public int getF(){
        return floor;
    }

    @Override
    public String toString(){
        if (floor%10==1 && (floor==1 || floor>=21)){
            return "Дом с " + floor + " этажом";
        }
        else{
            return "Дом с " + floor + " этажами";
        }
    }
}
