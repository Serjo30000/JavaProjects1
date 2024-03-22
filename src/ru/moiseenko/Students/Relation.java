/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.Students;

/**
 *
 * @author Serge
 */
public class Relation<T> {
    private Student<T> student;
    private Reactable<T> reaction;
    private Favoriteable<T> favorite;
    public Relation(Student<T> student,Reactable<T> reaction,Favoriteable<T> favorite){
        this.student=student;
        this.reaction=reaction;
        this.favorite=favorite;
    }
    public Student<T> getStudent(){
        return student;
    }
    public Reactable<T> getReaction(){
        return reaction;
    }
    public Favoriteable<T> getFavorite(){
        return favorite;
    }
}
