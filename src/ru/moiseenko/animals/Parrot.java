/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Parrot implements Singable {
    private final String song;
    public Parrot(){
        this("");
    }
    public Parrot(String song){
        this.song=song;
    }
    
    public String getSong(){
        return song;
    }
    @Override
    public String singing(){
        String str="";
        List <String> listWords = new ArrayList<>(Arrays.asList(song.split(" ")));
        for (int i=0;i<listWords.size();i++){
            int r = (int) Math.ceil(Math.random()*listWords.get(i).length());
            List <String> listWordsSymbols = new ArrayList<>(Arrays.asList(listWords.get(i).split("")));
            int k=0;
            for (int j=0;j<listWordsSymbols.size();j++){
                if (r>k){
                    k++;
                    str+=listWordsSymbols.get(listWordsSymbols.size()-j-1);
                }
                else{
                    str+=listWordsSymbols.get(j-k);
                }
            }
            str+=" ";
        }
        return str;
    }
}
