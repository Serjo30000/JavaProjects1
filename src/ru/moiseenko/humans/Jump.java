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
public class Jump implements Punchable{
    @Override
    public void attack(KarateBoy karate) {
        karate.jump();
    }
    
}
