/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Serge
 */
public class GroupShift implements Shiftable{
    List<Shiftable>lstGroup=new ArrayList<>();
    public GroupShift(Shiftable...lstGroup){
        for (Shiftable i : lstGroup) {
            this.lstGroup.add(i);
        }
    }
    @Override
    public void shiftCoordinate(String nameC, int c) {
        for(Shiftable i : lstGroup){
            i.shiftCoordinate(nameC, c);
        }
    }
    
    public List<Shiftable> getList(){
        return List.copyOf(lstGroup);
    }
    
    public Optional<GroupShift> getGroupShift(int x){
        if (lstGroup.get(x).getClass()==GroupShift.class){
            return Optional.of((GroupShift)lstGroup.get(x));
        }
        else{
            return Optional.empty();
        }
    }
}
