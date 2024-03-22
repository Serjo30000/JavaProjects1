/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.taskmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serge
 */
public class Tasks<T> {
    private String personGave;
    private String personAccepted;
    private String task;
    private TaskRuleable status;
    private List<Taskable<T>>lstTs=new ArrayList<>();
    
    public Tasks(String personGave,String personAccepted,String task,TaskRuleable status){
        this.personGave=personGave;
        this.personAccepted=personAccepted;
        this.task=task;
        this.status=status;
    }
    
    public String printTask(T...lstT){
        boolean b=true;
        for (Taskable<T> t:lstTs){
            if (t.make(this,lstT)==false){
                b=false;
                break;
            }
        }
        return status.examination(this,b);
    }
    
    public void addTs(Taskable<T> ts){
        lstTs.add(ts);
    }
    
    public TaskRuleable getStatus(){
        return status;
    }
    
    public String getPersonGave(){
        return personGave;
    }
    
    public String getPersonAccepted(){
        return personAccepted;
    }
    
    public String getTask(){
        return task;
    }
    
    public List<Taskable<T>> getLstTs(){
        return new ArrayList<>(lstTs);
    }
}
