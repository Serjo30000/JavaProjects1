/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Students;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
/**
 *
 * @author Serge
 */
public class Student <T>{
    private String name;
    private List<T> grades = new ArrayList<>();
    private Predicate<T> rule;
    private Deque<Action> deque = new ArrayDeque<>();
    private Avegerator<T> avegerator;
    private Excellent<T> excellent;
    private Defolt<T> defolt;
    private List<Parent<T>>parents=new ArrayList<>();
    
    public Student(String name, T... grades) {
        this(name, x -> true,grades);
    }

    public Student(String name, Predicate<T> rule, T... grades) {
        this.name = name;
        this.rule = rule;

        for (T i : grades) {
            if (!rule.test(i)) {
                throw new IllegalArgumentException(i + " недопустимое значение");
            }
            this.grades.add(i);
        }
    }

    public void setAvegerator(Avegerator<T> avegerator) {
        this.avegerator = avegerator;
    }
    
    public void setExcellent(Excellent<T> excellent) {
        this.excellent = excellent;
    }
    
    public void setDefolt(Defolt<T> defolt) {
        this.defolt = defolt;
    }

    public void addGrades(T... mark) {
        List<T>marks = new ArrayList<>();
        for (T mrk : mark){
            if (!rule.test(mrk)) {
                throw new IllegalArgumentException(mrk + " недопустимое значение");
            }
            addMessage(new Message(this," получил оценку ",mrk,true,""));
            grades.add(mrk);
            marks.add(mrk);
        }
        deque.push(() -> grades.subList(grades.size()-marks.size(),grades.size()).clear());
    }

    public void removeGrades(T... mark) {
        List<T>marks = new ArrayList<>();
        for (T mrk : mark){
            addMessage(new Message(this," убрал оценку ",mrk,false,""));
            grades.remove(mrk);
            marks.add(mrk);
        }
        deque.push(() -> grades.addAll(marks));
    }

    public List<T> getGrades() {
        return new ArrayList<>(grades);
    }

    public void rename(String name) {
        String newName = this.name;
        addMessage(new Message(this," изменил имя на ",name));
        deque.push(() -> this.name = newName);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void undo() {
        deque.pop().undo();
        addMessage(new Message(this," значение вернулось назад"));
    }

    public DefoltT<T> averageValue() {
        if(grades.isEmpty()) return DefoltT.empty();
        if(avegerator!=null)
            return DefoltT.of(avegerator.avg(new ArrayList<>(grades)));
        List<T> tmp=new ArrayList<>(grades);
        tmp.remove(0);
        return DefoltT.of(((AverageValue<T>)grades.get(0)).avaragevalue(tmp));
    }
    
  public boolean excellentStudent() {
        if(grades.isEmpty()) return false;
        if(excellent!=null)
            return excellent.exc(new ArrayList<>(grades));
        List<T> tmp=new ArrayList<>(grades);
        tmp.remove(0);
        return((ExcellentStudent<T>)grades.get(0)).excellentstudent(tmp);
   }
  
    public void addMessage(Message<T> msg){
        if(msg.getArg()!=null && !rule.test(msg.getArg()))throw new IllegalArgumentException(msg + " недопустимое значение");
        for (int i=0;i<parents.size();i++){
            System.out.println(msg);
            parents.get(i).alert(this, msg);
        }
    }
    
    public void addParent(Parent<T> par){
        parents.add(par);
    }
    
    public Defolt<T> aVg(){
        return defolt;
    }
        
    @Override
    public int hashCode() {
        return Objects.hash(name, grades);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Student<?> other = (Student<?>) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.grades, other.grades);
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", grades=" + grades + '}';
    }
}
