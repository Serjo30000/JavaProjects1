/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.generationname;

import java.util.Objects;

/**
 *
 * @author Serge
 */
public final class GeneratorName {
    private NameGener fio;
    
    private GeneratorName(NameGener fio){
        this.fio=fio;
    }
    
    public static GeneratorName generator(String name1,String name2,String name3){
        return new GeneratorName(new NameGener(name1,name2,name3));
    }
    
    public NameGener getName(){
        return fio;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(fio.getFirstName(), fio.getSecondName(), fio.getFamily());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GeneratorName other = (GeneratorName) obj;
        if (!(Objects.equals(this.fio.getFirstName(), other.fio.getFirstName())||Objects.equals(this.fio.getFirstName(), other.fio.getSecondName())||Objects.equals(this.fio.getFirstName(), other.fio.getFamily()))) {
            return false;
        }
        if (!(Objects.equals(this.fio.getSecondName(), other.fio.getFirstName())||Objects.equals(this.fio.getSecondName(), other.fio.getSecondName())||Objects.equals(this.fio.getSecondName(), other.fio.getFamily()))) {
            return false;
        }
        if (!(Objects.equals(this.fio.getFamily(), other.fio.getFirstName())||Objects.equals(this.fio.getFamily(), other.fio.getSecondName())||Objects.equals(this.fio.getFamily(), other.fio.getFamily()))) {
            return false;
        }
        return true;
    }
}
