/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.humans;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Serge
 */
public class ComboKarateBoy{
    public List<Karateable> karates=new ArrayList<>();
    
    public void karateka(){
        for (Karateable k: karates){
            k.attack();
        }
    }
}
