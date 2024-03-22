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
public class Worker {
    protected String name;
    protected Department dep;
    
    public Worker(String name, Department dep){
        if (name==null || dep==null){
            throw new IllegalArgumentException("Вы ввели пустое значение");
        }
        this.name=name;
        this.dep=dep;
    }
    
    @Override
    public String toString(){
        if (dep.isBoss(name,dep)){
            return name + " начальник отдела " + dep.otdels;
        }
        else if (dep.otdels.equals(dep.bossS.dep.otdels)){
            return name + " работает в отделе " + dep.otdels + ", " + "начальник которого " + dep.bossS.name;
        }
        else{
            return "Сотрудник не работает в данном отделе.";
        }
    }
}
