/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lists;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Serge
 * @param <T>
 */
public class ChangeableArray<T> {
    private T [] arr;
    private int maxA;
    private int lenA;
    public ChangeableArray(){
        maxA=100;
        lenA=0;
        arr=(T[]) new Object [1];
    }
    public ChangeableArray(T ... arr){
        this.arr=Arrays.copyOf(arr, arr.length);
        maxA=arr.length;
        lenA=maxA;
    }
    public ChangeableArray(List <T> arr){
        this.arr=(T[])new Object [arr.size()];
        for (int i=0;i<arr.size();i++){
            this.arr[i]=arr.get(i);
        }
        maxA=arr.size();
        lenA=maxA;
    }
    
    public int size(){
        return lenA;
    }
    
    public void setmaxSize(int n){
        if (n<0){
            throw new IllegalArgumentException("Вы не можете установить отрицательную длину для массива.");
        }
        maxA=n;
        if (maxA<lenA){
            lenA=maxA;
            T [] arrA = (T[])new Object [lenA];
            for (int i=0;i<lenA;i++){
                arrA[i]=arr[i];
            }
            arr=Arrays.copyOf(arrA, arrA.length);
        }
    }
    public int maxSize(){
        return maxA;
    }
    
    public T getElement(int n){
        if (isEmpty()){
            throw new IllegalArgumentException("Вы не можете получить значение из пустого массива");
        }
        if (n<0 || n>=lenA){
            throw new IllegalArgumentException("Вы не можете получить значение из данного индекса у массива");
        }
        else{
            return arr[n];
        }
    }
    public T [] getArr(){
        if (isEmpty()){
            return null;
        }
        else{
            return Arrays.copyOf(arr, arr.length);
        }
    }
    public void add(T x){
        if(!isAdd(0)){
            throw new IllegalArgumentException("Вы вышли за пределы массива");
        } 
        else{
            lenA++;
            T [] arrA=(T[])new Object [lenA];
            for (int i=0;i<lenA-1;i++){
                arrA[i]=arr[i];
            }
            arrA[lenA-1]=x;
            arr=Arrays.copyOf(arrA, arrA.length);
        }
    }
    public void add(T [] arr1){
        if(!isAdd(arr1.length)){
            throw new IllegalArgumentException("Вы вышли за пределы массива");
        } 
        else{
            lenA+=arr1.length;
            T [] arrA=(T[])new Object [lenA];
            for (int i=0;i<lenA;i++){
                if (i<arr.length){
                    arrA[i]=arr[i];
                }
                else if (i>=arr.length){
                    arrA[i]=arr1[i-arr.length];
                }
            }
            arr=Arrays.copyOf(arrA, arrA.length);
        }
    }
    public void add(int n, T [] arr1){
        if(!isAdd(arr1.length)){
            throw new IllegalArgumentException("Вы вышли за пределы массива");
        } 
        else if (n<0 || n>=lenA+1){
            throw new IllegalArgumentException("Вы не можете добавить значение из данного индекса у массива");
        }
        else{
            lenA+=arr1.length;
            T [] arrA=(T[])new Object [lenA];
            int k=0;
            for (int i=0;i<lenA;i++){
                if (i<n){
                    arrA[i]=arr[i];
                }
                else if (k<arr1.length){
                    arrA[i]=arr1[k];
                    k++;
                }
                else if (i>=arr1.length+n){
                    arrA[i]=arr[i-k];
                }
            }
            arr=Arrays.copyOf(arrA, arrA.length);
        }
    }
    public void add(int n, List <T> arr1){
        if(!isAdd(arr1.size())){
            throw new IllegalArgumentException("Вы вышли за пределы массива");
        } 
        else if (n<0 || n>=lenA+1){
            throw new IllegalArgumentException("Вы не можете добавить значение из данного индекса у массива");
        }
        else{
            lenA+=arr1.size();
            T [] arrA=(T[])new Object [lenA];
            int k=0;
            for (int i=0;i<lenA;i++){
                if (i<n){
                    arrA[i]=arr[i];
                }
                else if (k<arr1.size()){
                    arrA[i]=arr1.get(k);
                    k++;
                }
                else if (i>=arr1.size()+n){
                    arrA[i]=arr[i-k];
                }
            }
            arr=Arrays.copyOf(arrA, arrA.length);
        }
    } 
    public void add(List <T> arr1){
        if(!isAdd(arr1.size())){
            throw new IllegalArgumentException("Вы вышли за пределы массива");
        } 
        else{
            lenA+=arr1.size();
            T [] arrA=(T[])new Object [lenA];
            for (int i=0;i<lenA;i++){
                if (i<arr.length){
                    arrA[i]=arr[i];
                }
                else if (i>=arr.length){
                    arrA[i]=arr1.get(i-arr.length);
                }
            }
            arr=Arrays.copyOf(arrA, arrA.length);
        }
    }
    public void add(T x, int n){
        if (n<0 || n>=lenA+1){
            throw new IllegalArgumentException("Вы не можете добавить значение из данного индекса у массива");
        }
        else if(!isAdd(n)){
            throw new IllegalArgumentException("Вы вышли за пределы массива");
        } 
        else{
            lenA++;
            T [] arrA=(T[])new Object [lenA];
            for (int i=0;i<lenA;i++){
                if (i<n){
                    arrA[i]=arr[i];
                }
                else if (i==n){
                    arrA[i]=x;
                }
                else if (i>n){
                    arrA[i]=arr[i-1];
                }
            }
            arr=Arrays.copyOf(arrA, arrA.length);
        }
    }
    public void setArr(T x,int n){
        if (isEmpty()){
            throw new IllegalArgumentException("Вы не можете изменить значение из пустого массива");
        }
        if (n<0 || n>=lenA){
            throw new IllegalArgumentException("Вы не можете изменить значение из данного индекса у массива");
        }
        else{
            arr[n]=x;
        }
    }
    public void remove(int n){
        if (isEmpty()){
            throw new IllegalArgumentException("Вы не можете удалить значение из пустого массива");
        }
        else if (n<0 || n>=lenA){
            throw new IllegalArgumentException("Вы не можете удалить значение из данного индекса у массива");
        }
        else{
            lenA--;
            T [] arrA=(T[])new Object[lenA];
            for (int i=0;i<lenA+1;i++){
                if (i<n){
                    arrA[i]=arr[i];
                }
                else if(i>n){
                    arrA[i-1]=arr[i];
                }
            }
            arr=Arrays.copyOf(arrA,arrA.length);
        }
    }
    public boolean isEmpty(){
        if (lenA>0){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean isAdd(int ln){
        if (lenA+ln>=maxA){
            return false;
        }
        else{
            return true;
        }
    }
    
    public ChangeableArray printList(ChangeableArray<? super Number> lst1){
        for (int i=0;i<lst1.lenA;i++){
            lst1.setArr((Integer)i+1, i);
        }
        return lst1;
    }
    
    @Override
    public String toString(){
        String str="";
        for (int i=0;i<lenA;i++){
            str+=arr[i];
            if (i!=lenA-1){
                str+=", ";
            }
        }
        return "[ " + str + " ]";
    }
}
