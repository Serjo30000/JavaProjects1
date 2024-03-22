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
public class Departs {
    private Statement stat;
    private List<Statementable>lstDepart=new ArrayList<>();
    
    public Departs(Statement stat){
        this.stat=new Statement(stat);
    }
    
    public void addDepart(Statementable dep){
        lstDepart.add(dep);
    }
    
    public Statement isReception(){
        for (Statementable i : lstDepart){
            Statement st=new Statement(i.isExamination(stat));
            if (st.getIsAccepted()==false){
                stat=new Statement(st);
                break;
            }
            else{
                stat=new Statement(i.isExamination(stat));
            }
        }
        System.out.println(stat.getIsAccepted());
        return stat;
    }
    
    public Statement getStat(){
        return new Statement(stat);
    }
    
    public List<Statementable> getLstDepart(){
        return List.copyOf(lstDepart);
    }
}
