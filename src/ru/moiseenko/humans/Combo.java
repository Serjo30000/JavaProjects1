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
public class Combo{
    public List<Punchable> punchs = new ArrayList<>();
    
    public void perfome(KarateBoy karatist){
        for (Punchable p: punchs){
            p.attack(karatist);
        }
    }
}
