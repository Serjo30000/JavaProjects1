/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.statements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Statement {
    private String name;
    private String textStatement;
    private List<String>lstSignature=new ArrayList<>();
    private boolean isAccepted = false;
    
    
    public Statement(String name,String textStatement){
        this.name=name;
        this.textStatement=textStatement;
    }
    
    public Statement(Statement st){
        name=st.getName();
        textStatement=st.getTextStatement();
        lstSignature=new ArrayList<>();
        for (String i:st.getLstSignature()){
            lstSignature.add(i);
        }
        isAccepted=st.getIsAccepted();
    }
    
    public void addSignature(String sign){
        lstSignature.add(sign);
    }
    
    public String getName(){
        return name;
    }
    
    public String getTextStatement(){
        return textStatement;
    }
    
    public List<String> getLstSignature(){
        return List.copyOf(lstSignature);
    }
    
    public boolean getIsAccepted(){
        return isAccepted;
    }
    
    public void setIsAccepted(boolean isAccepted){
        this.isAccepted=isAccepted;
    }
    
    @Override
    public String toString(){
        if (isAccepted==false){
            return "Заявление не принято";
        }
        else{
            return "Заявление принято";
        }
    }
}
