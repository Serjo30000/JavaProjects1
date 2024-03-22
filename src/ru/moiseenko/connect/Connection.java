/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.connect;
import java.util.Optional;
/**
 *
 * @author Serge
 */
public class Connection {
    private static int countConnect=0;
    private boolean isConnect=true;
    private Connection(){

    }
    public String read(){
        if (isConnect){
            return "чтение";
        }
        throw new RuntimeException();
    }
    
    public void closed(){
        if (isConnect==true){
            countConnect--;
            isConnect=false;
        }
    }
    
    public void open(){
        if (isConnect==false && countConnect<5){
            countConnect++;
            isConnect=true;
        }
    }
    
    public static DefoultNull<Connection> create(){
        if (countConnect<5){
            countConnect++;
            return DefoultNull.of(new Connection());
        }
        return DefoultNull.empty();
    }
    
//    public static Optional<Connection> create(){
//        if (countConnect<5){
//            countConnect++;
//            return Optional.of(new Connection());
//        }
//        return Optional.empty();
//    }
}