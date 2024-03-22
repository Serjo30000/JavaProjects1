/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lomans;

/**
 *
 * @author Serge
 */
public class PointPrinter {
    private Lennable lm;
    private PointRuleL rule;
    private int shift;
    public PointPrinter(Lennable lm,int shift,PointRuleL rule){
        this.lm=lm;
        this.shift=shift;
        this.rule=rule;
    }
    public Pointt printPoint(){
        if (rule.checking(lm,shift)==false){
            LomanUnclosed lom = (LomanUnclosed)lm;
            if (!isShift()){
                throw new IllegalArgumentException("Вышли за пределы списка");
            }
            int shiftC=shift;
            shift++;
            return lom.getLom().get(shiftC);
        }
        else{
            LomamClosed lom = (LomamClosed)lm;
            int shiftC=shift;
            shift++;
            if (!isShift()){
                shift=0;
            }
            return lom.getLom().get(shiftC);
        }
    }
    
    public boolean isShift(){
        if (rule.checking(lm,shift)==false){
            LomanUnclosed lom = (LomanUnclosed)lm;
            if (shift>=lom.getLom().size() || shift<0){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            LomamClosed lom = (LomamClosed)lm;
            if (shift>=lom.getLom().size() || shift<0){
                return false;
            }
            else{
                return true;
            }
        }
    }
}
