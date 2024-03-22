/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.humans;

/**
 *
 * @author Serge
 */
public class KarateFight implements Karateable{
    private final KarateBoy karate;
    private final Punchable punchs;
    
    public KarateFight(KarateBoy karate,Punchable punchs){
        this.karate=karate;
        this.punchs=punchs;
    }

    @Override
    public void attack() {
        punchs.attack(karate);
    }
}
