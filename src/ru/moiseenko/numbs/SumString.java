/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.numbs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class SumString<T extends String> implements Doublesumable<T> {
    Doublesumable fr;
    public SumString(Fraction fr){
        this.fr=fr;
    }
    @Override
    public double doubleSum(List <T> listn){
        List <Integer> listI=new ArrayList<>();
        for (int i=0;i<listn.size();i++){
            try { 
                listI.add(Integer.valueOf(listn.get(i)));
            } catch (NumberFormatException e) { 
                throw new IllegalArgumentException("Введено не числовое значение");
            } 
        }
        return fr.doubleSum(listI);
    }
}
