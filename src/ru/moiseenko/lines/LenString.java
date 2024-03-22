/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lines;

/**
 *
 * @author Serge
 */
public class LenString<T extends String> implements Lenable<T> {
    Lenable<Pointable> ln;
    public LenString(Lenable<Pointable> ln){
        this.ln=ln;
    }
    @Override
    public double lenLom(T... points) {
        int len=0;
        for (T p : points){
            len+=p.length();
        }
        return ln.lenLom(new Point(len,0),new Point(0,0));
    }
}
