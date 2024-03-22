/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lines;



/**
 *
 * @author Serge
 */
public class Point3d extends Point {
    int z;
    public Point3d(int x){
        this(x,0,0);
    }
    public Point3d(int x, int y){
        this(x,y,0);
    }
    public Point3d(int x, int y, int z){
        super(x,y);
        this.z=z;
    }
    @Override
    public String toString(){
        return "{" + x +";" + y + ";" + z + "}";
    }
}
