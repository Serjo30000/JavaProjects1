/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.numbs;

import java.util.List;
import java.util.Objects;
/**
 *
 * @author Serge
 */
public final class Fraction<T extends Number> extends Number implements Doublesumable<T>, Cloneable{
    private final int numerator;
    private final int denominator;
    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        if (denominator<0){
            throw new IllegalArgumentException("Вы ввели отрицательный знаменатель.");
        }
        if (denominator==0){
            throw new IllegalArgumentException("Вы ввели нулевой знаменатель.");
        }
        this.denominator=denominator;
    }
    
    public Fraction(int numerator){
        this(numerator,1);
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public String comp(Fraction f){
        return "" + numerator + "/" + denominator + " * " + f + " = " + (numerator*f.numerator) + "/" + (denominator*f.denominator);
    }
    
    
    public String div(Fraction f){
        return "" + numerator + "/" + denominator + " / " + f + " = " + (numerator*f.denominator*f.numerator/Math.abs(f.numerator)) + "/" + (denominator*Math.abs(f.numerator));
    }
    
    
    public String minus(Fraction f){
        int d = denominator;
        int n1 = numerator;
        int n2 = f.numerator;
        if (denominator!=f.denominator){
            d = denominator*f.denominator;
            n1 = numerator*f.denominator;
            n2 = f.numerator*denominator;
        }
        n1=n1-n2;
        return "" + numerator + "/" + denominator + " - " + f + " = " + (n1) + "/" + (d);
    }
    
    
    public String summ(Fraction f){
        int d = denominator;
        int n1 = numerator;
        int n2 = f.numerator;
        if (denominator!=f.denominator){
            d = denominator*f.denominator;
            n1 = numerator*f.denominator;
            n2 = f.numerator*denominator;
        }
        n1=n1+n2;
        return "" + numerator + "/" + denominator + " + " + f + " = " + (n1) + "/" + (d);
    }
    
    @Override
    public double doubleValue(){
        return (double)numerator/denominator;
    }
    @Override
    public int intValue(){
        return (int)numerator/denominator;
    }
    @Override
    public long longValue(){
        return (long)numerator/denominator;
    }
    @Override
    public float floatValue(){
        return (float)numerator/denominator;
    }
    @Override
    public double doubleSum(List <T> listn){
        double summ=0;
        for (int i=0;i<listn.size();i++){
            summ+=listn.get(i).doubleValue();
        }
        
        return summ;
    }
    @Override
    public int hashCode(){
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.numerator);
        hash = 45 * hash + Objects.hashCode(this.denominator);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass()) return false;
        Fraction fr = (Fraction) obj;
        if (this.numerator!=fr.numerator) return false;
        if (this.denominator!=fr.denominator) return false;
        return true;
    }
    @Override
    public Fraction clone() throws CloneNotSupportedException{
        try{
            return (Fraction)super.clone();
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString(){
        return "" + numerator + "/" + denominator;
    }
}
