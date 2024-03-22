/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.defaultst;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Serge
 */
public class Stud {
    private String name;
    List<Integer> grades = new ArrayList();
    public Stud(String name,Integer... marks) {
        this.name = name;
        for (Integer t : marks) {
            grades.add(t);
        }
    }

    public class Ac implements Act<Integer>{
        List<Integer> grades = new ArrayList();
        Ac(Stud s){
            grades=s.grades;
        }

        @Override
        public Integer act() {
            int res=0;
            int counter =0;
            for(Integer t: grades){
                res+=t;
                counter+=1;

            }
            return res/counter;
        }
    }

    public Defol<Integer> avg(){

        return new Defol<>(new Ac(this));
    }
}
