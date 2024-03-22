/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.humans;

import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student<T> implements Copyable{
    private AvgRule<T> avgRator;
    private ExcellentStud<T> excellent;
    private String name;
    private List<T> marks = new ArrayList<>();
    private final Predicate<T> rule;
    private Deque<Command> commands = new ArrayDeque<>();

    public Student(String name, T...marks) {
        this(name,x->true,marks);
    }

    public Student(String name,Predicate<T> rule, T...marks) {
        this.name = name;
        this.rule=rule;
        for(T t:marks){
            if(!rule.test(t)) throw new IllegalArgumentException(t+" is wrong mark");
            this.marks.add(t);
        }
    }
    
    public void setAvgRule(AvgRule<T> avgRator){
        this.avgRator = avgRator;
    }
    
    public void setexcellentStud(ExcellentStud<T> excellent){
        this.excellent = excellent;
    }
    
    public T avg(){
        return (T)avgRator.avg(clone().marks);
    }
    
    public Boolean exc(){
        return excellent.exc(clone().marks);
    }
    
    public void addGrade(T grade) {
        if(!rule.test(grade)) 
            throw new IllegalArgumentException(grade+" is wrong mark");
        marks.add(grade);
        
        int indx=marks.size()-1;        
        commands.push(()->this.marks.remove(indx));
    }

    public void removeGrade(T grade) {
        int indx = marks.indexOf(grade);
        commands.push(()->this.marks.add(indx,grade));
        marks.remove(grade);
    }

    public List<T> getMarks() {
        return new ArrayList<>(marks);
    }
    
    public void setName(String name) {
        String nameBuf = this.name;
        commands.push(()-> this.name = nameBuf);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void undo() {
        commands.pop().comand();
    }
    
    @Override
    public Student<T> clone(){        
        try {
             Student<T> stud=(Student<T>)super.clone();
             stud.marks=new ArrayList<>(marks);
             commands.clear();
             return stud;
        } catch (CloneNotSupportedException ex) {
            throw  new RuntimeException(ex);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,marks);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null||getClass() != obj.getClass()) {
            return false;
        }
        final Student<?> other = (Student<?>) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + marks + '}';
    }
}
