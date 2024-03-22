/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Students;

import java.util.Objects;

/**
 *
 * @author Serge
 */
public class Message<T> {
    private Student st;
    private String event;
    private T arg;
    private boolean fl;
    private String nameSt;
    
    public Message(Student st,String event){
        this(st,event,null,false,"");
    }
    
    public Message(Student st,String event,String nameSt){
        this(st,event,null,false,nameSt);
    }
    
    public Message(Student st,String event,T arg,boolean f,String nameSt){
        this.st=st;
        this.event=event;
        this.arg=arg;
        this.fl=fl;
        this.nameSt=nameSt;
    }
    
    public Student getStudent(){
        return st;
    }
    
    public String getEvent(){
        return event;
    }
    
    public T getArg(){
        return arg;
    }
    
    public boolean getFl(){
        return fl;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(st,event);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Message<?> other = (Message<?>) obj;
        if (!Objects.equals(this.st, other.st)) {
            return false;
        }
        return Objects.equals(this.event, other.event);
    }
    
    @Override
    public String toString(){
        if (arg!=null){
            return st.getName() + event + arg; 
        }
        else if (!nameSt.equals("")){
            return st.getName() + event + nameSt;
        }
        else{
            return st.getName() + event;
        }
    }
}
