/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.moiseenko.animals.*;
import ru.moiseenko.numbs.*;
import ru.moiseenko.guns.*;
import ru.moiseenko.towns.*;
import ru.moiseenko.geometry.Point;
import ru.moiseenko.geometry.Circle;
import ru.moiseenko.geometry.Line;
import ru.moiseenko.geometry.LomClosed;
import ru.moiseenko.geometry.LomUnclosed;
import ru.moiseenko.geometry.Polygonable;
import ru.moiseenko.geometry.Lenable;
import ru.moiseenko.geometry.Rectangle;
import ru.moiseenko.geometry.Sfigurable;
import ru.moiseenko.geometry.Triangle;
import java.math.BigInteger;
import java.awt.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.System.out;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import ru.moiseenko.Trafficlights.*;
import ru.moiseenko.convert.Converter;
import ru.moiseenko.humans.*;
import ru.moiseenko.storages.*;
import ru.moiseenko.geometry.Point3d;
import ru.moiseenko.lists.ChangeableArray;
import ru.moiseenko.Students.*;
import ru.moiseenko.connect.*;
import ru.moiseenko.defaultst.*;
import ru.moiseenko.excel.*;
import ru.moiseenko.geometry.Point23D;
import ru.moiseenko.notconstructor.*;
import ru.moiseenko.temperature.*;
import ru.moiseenko.generationname.*;
import ru.moiseenko.geometry.GroupShift;
import ru.moiseenko.lines.*;
import ru.moiseenko.statements.*;
import ru.moiseenko.stock.*;
import ru.moiseenko.lomans.Lennable;
import ru.moiseenko.lomans.LomamClosed;
import ru.moiseenko.lomans.LomanUnclosed;
import ru.moiseenko.lomans.PointPrinter;
import ru.moiseenko.lomans.Pointt;
import ru.moiseenko.potoks.MySup;
import ru.moiseenko.taskmanager.*;
/**
 *
 * @author Serge
 */
public class CodesJava{

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args)  throws CloneNotSupportedException{
        Singable v1 = new Sparrow();
        Singable c1 = new Cuckoo();
        Singable p1 = new Parrot("Я зелёный Попугай");
        List<Singable> birds = Arrays.asList(v1, c1, p1);
        sing(birds);
        System.out.println();
        
        Meowable ct1 = new Cat("Барсик");
        Meowable ct2 = new Cat("Снежок");
        Meowable ct3 = new Dog("Рекс");
        List<Meowable> cats = Arrays.asList(ct1, ct2, ct3);
        meows(cats);
        System.out.println();
        
        List<Doublesumable> numb1 = Arrays.asList(new Fraction(7));
        List<Number> num1 = Arrays.asList(2, new Fraction(3,5), 2.3);
        List<Number> num2 = Arrays.asList(3.6, new Fraction(49,12), 3,new Fraction(3,2));
        List<Number> num3 = Arrays.asList(new Fraction(1,3), 1);
        numbsum(numb1,num1);
        numbsum(numb1,num2);
        numbsum(numb1,num3);
        System.out.println();
        
        Shooter s1 = new Shooter("Вася");
        Shooter s2 = new Shooter("Петя", new PistolGun(30,30));
        Shooter s3 = new Shooter("Иван", new ShootGun(15,30,30,2));
        List<Shooter>sh=Arrays.asList(s1,s2,s3);
        fire(sh);
        System.out.println();
        
        List <Road> listTown1 = new ArrayList<>();
        List <Road> listTown2 = new ArrayList<>();
        List <Road> listTown3 = new ArrayList<>();
        List <Road> listTown4 = new ArrayList<>();
        List <Road> listTown5 = new ArrayList<>();
        SmartTown t1 = new SmartTown("A", listTown1);
        SmartTown t2 = new SmartTown("B", listTown2);
        SmartTown t3 = new SmartTown("C", listTown3);
        SmartTown t4 = new SmartTown("D", listTown4);
        Town t5 = new Town("E", listTown5);
        Town t6 = new Town("E", listTown5);
        SmartTown t7 = new SmartTown("D", listTown4);
        SmartTown t8 = new SmartTown("D", listTown4);
        Town t9 = new Town("E", listTown5);
        Town t10 = new Town("G", listTown5);
        SmartTown t11 = new SmartTown("E", listTown5);
        List<Townable> tw = Arrays.asList(t1,t2,t3,t4,t5);
        tw.get(0).addRoad(new Road(t2,2),t1);
        tw.get(0).addRoad(new Road(t3,3),t1);
        tw.get(1).addRoad(new Road(t3,4),t2);
        tw.get(1).addRoad(new Road(t4,5),t2);
        tw.get(3).addRoad(new Road(t5,6),t4);
        tw.get(4).addRoad(new Road(t3,7));
        twns(tw);
        t7.addRoad(new Road(t2,5));
        t8.addRoad(new Road(t2,5));
        t7.addRoad(new Road(t5,6));
        t8.addRoad(new Road(t5,6));
        t6.addRoad(new Road(t4,6));
        t6.addRoad(new Road(t3,7));
        t9.addRoad(new Road(t4,6));
        t11.addRoad(new Road(t4,6));
        t9.addRoad(new Road(t3,7));
        t10.addRoad(new Road(t3,7));
        t11.addRoad(new Road(t3,7));
        System.out.println();
        
        Sfigurable ss1 = new Rectangle(new Point(5,3),23,23,new LomClosed());
        Sfigurable ss2 = new Circle(new Point(1,2),3);
        Sfigurable ss3 = new Rectangle(new Point(3,4),5,4,new LomClosed());
        Sfigurable ss4 = new Triangle(new Point(2,2),new Point(4,5),new Point(5,2),new LomClosed());
        List <Point> pp1 = new ArrayList<>();
        pp1.add(new Point(1,3));
        pp1.add(new Point(3,4));
        pp1.add(new Point(4,7));
        List <Point> pp2 = new ArrayList<>();
        pp2.add(new Point(1,3));
        pp2.add(new Point(3,4));
        pp2.add(new Point(4,7));
        Lenable ll1 = new LomUnclosed(pp1);
        Lenable ll2 = new LomClosed(pp2);
        Lenable ll3 =new Line(new Point(1,2),new Point(2,3));
        List<Sfigurable> figures1 = Arrays.asList(ss1, ss2, ss3, ss4);
        Sfigur(figures1);
        List<Polygonable> figures2 = Arrays.asList(ss1, ss3, ss4,ll1,ll2,ll3);
        lFigur(figures2);
        System.out.println();
        
        List<Number> num4 = Arrays.asList(7,new Fraction(11,3),3.21,new BigInteger("12345678912345678912"));
        numbsum(numb1,num4);
        System.out.println();
        
        System.out.println(powNumbs(args[0],args[1]));
        out.println();
        
        Point point1 = new Point(1,2);
        java.awt.Point point2 = new java.awt.Point(1,2);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println();
        Class clz = point1.getClass();
        System.out.println(clz);
        System.out.println();
        Method[]ms=clz.getMethods();
        for (Method m: ms){
            System.out.println(m);
        }
        System.out.println();
        Point point3=point1.clone();
        System.out.println(point3);
        
        Fraction fr1 = new Fraction(1,3);
        Fraction fr2 = fr1.clone();
        Fraction fr3 = new Fraction(1,3);
        Fraction fr4 = new Fraction(4,5);
        System.out.println(fr1.hashCode()==fr1.hashCode() && fr1.equals(fr1));
        System.out.println(fr1.hashCode()==fr2.hashCode() && fr1.equals(fr2));
        System.out.println(fr2.hashCode()==fr1.hashCode() && fr2.equals(fr1));
        System.out.println(fr1.hashCode()==fr3.hashCode() && fr1.equals(fr3));
        System.out.println(fr2.hashCode()==fr3.hashCode() && fr2.equals(fr3));
        System.out.println(fr1.hashCode()==fr4.hashCode() && fr1.equals(fr4));
        System.out.println(fr4.hashCode()==fr1.hashCode() && fr4.equals(fr1));
        System.out.println();
        
        Point pointt1 = new Point(1,3);
        Point pointt2 = pointt1.clone();
        Point pointt3 = new Point(1,3);
        Point pointt4 = new Point(4,5);
        System.out.println(pointt1.hashCode()==pointt1.hashCode() && pointt1.equals(pointt1));
        System.out.println(pointt1.hashCode()==pointt2.hashCode() && pointt1.equals(pointt2));
        System.out.println(pointt2.hashCode()==pointt1.hashCode() && pointt2.equals(pointt1));
        System.out.println(pointt1.hashCode()==pointt3.hashCode() && pointt1.equals(pointt3));
        System.out.println(pointt2.hashCode()==pointt3.hashCode() && pointt2.equals(pointt3));
        System.out.println(pointt1.hashCode()==pointt4.hashCode() && pointt1.equals(pointt4));
        System.out.println(pointt4.hashCode()==pointt1.hashCode() && pointt4.equals(pointt1));
        System.out.println();
        Line line1 = new Line(new Point(1,3),new Point(2,4));
        Line line2 = line1.clone();
        Line line3 = new Line(new Point(1,3),new Point(2,4));
        Line line4 = new Line(new Point(1,3),new Point(3,5));
        System.out.println(line1.hashCode()==line1.hashCode() && line1.equals(line1));
        System.out.println(line1.hashCode()==line2.hashCode() && line1.equals(line2));
        System.out.println(line2.hashCode()==line1.hashCode() && line2.equals(line1));
        System.out.println(line1.hashCode()==line3.hashCode() && line1.equals(line3));
        System.out.println(line2.hashCode()==line3.hashCode() && line2.equals(line3));
        System.out.println(line1.hashCode()==line4.hashCode() && line1.equals(line4));
        System.out.println(line4.hashCode()==line1.hashCode() && line4.equals(line1));
        System.out.println();
        
        List<Point>ppp1=new ArrayList<>();
        ppp1.add(new Point(1,2));
        ppp1.add(new Point(3,4));
        ppp1.add(new Point(3,7));
        List<Point>ppp2=new ArrayList<>();
        ppp2.add(new Point(2,2));
        ppp2.add(new Point(5,4));
        ppp2.add(new Point(3,7));
        LomClosed lm1 = new LomClosed(ppp1);
        LomClosed lm2 = lm1.clone();
        LomClosed lm3 = new LomClosed(ppp1);
        LomClosed lm4 = new LomClosed(ppp2);
        System.out.println(lm1.hashCode()==lm1.hashCode() && lm1.equals(lm1));
        System.out.println(lm1.hashCode()==lm2.hashCode() && lm1.equals(lm2));
        System.out.println(lm2.hashCode()==lm1.hashCode() && lm2.equals(lm1));
        System.out.println(lm1.hashCode()==lm3.hashCode() && lm1.equals(lm3));
        System.out.println(lm2.hashCode()==lm3.hashCode() && lm2.equals(lm3));
        System.out.println(lm1.hashCode()==lm4.hashCode() && lm1.equals(lm4));
        System.out.println(lm4.hashCode()==lm1.hashCode() && lm4.equals(lm1));
        
        LomUnclosed lm5 = new LomUnclosed(ppp1);
        LomUnclosed lm6 = lm5.clone();
        LomUnclosed lm7 = new LomUnclosed(ppp1);
        LomUnclosed lm8 = new LomUnclosed(ppp2);
        System.out.println(lm5.hashCode()==lm5.hashCode() && lm5.equals(lm5));
        System.out.println(lm5.hashCode()==lm6.hashCode() && lm5.equals(lm6));
        System.out.println(lm6.hashCode()==lm5.hashCode() && lm6.equals(lm5));
        System.out.println(lm5.hashCode()==lm7.hashCode() && lm5.equals(lm7));
        System.out.println(lm6.hashCode()==lm7.hashCode() && lm6.equals(lm7));
        System.out.println(lm5.hashCode()==lm8.hashCode() && lm5.equals(lm8));
        System.out.println(lm8.hashCode()==lm5.hashCode() && lm8.equals(lm5));
        System.out.println();
        
        System.out.println(lm1.hashCode()==lm5.hashCode() && lm1.equals(lm5));
        System.out.println(lm5.hashCode()==lm1.hashCode() && lm5.equals(lm1));
        System.out.println(lm6.hashCode()==lm1.hashCode() && lm6.equals(lm1));
        System.out.println(lm1.hashCode()==lm8.hashCode() && lm1.equals(lm8));
        System.out.println(lm8.hashCode()==lm1.hashCode() && lm8.equals(lm1));
        System.out.println();
        
        System.out.println(t4.hashCode()==t4.hashCode() && t4.equals(t4));
        System.out.println(t4.hashCode()==t7.hashCode() && t4.equals(t7));
        System.out.println(t7.hashCode()==t4.hashCode() && t7.equals(t4));
        System.out.println(t4.hashCode()==t8.hashCode() && t4.equals(t8));
        System.out.println(t7.hashCode()==t8.hashCode() && t7.equals(t8));
        System.out.println(t4.hashCode()==t2.hashCode() && t4.equals(t2));
        System.out.println(t2.hashCode()==t4.hashCode() && t2.equals(t4));
        System.out.println();
        
        System.out.println(t5.hashCode()==t5.hashCode() && t5.equals(t5));
        System.out.println(t5.hashCode()==t6.hashCode() && t5.equals(t6));
        System.out.println(t6.hashCode()==t5.hashCode() && t6.equals(t5));
        System.out.println(t5.hashCode()==t9.hashCode() && t5.equals(t9));
        System.out.println(t6.hashCode()==t9.hashCode() && t6.equals(t9));
        System.out.println(t5.hashCode()==t10.hashCode() && t5.equals(t10));
        System.out.println(t10.hashCode()==t5.hashCode() && t10.equals(t5));
        System.out.println();
        
        System.out.println(t9.hashCode()==t11.hashCode() && t9.equals(t11));
        System.out.println(t11.hashCode()==t9.hashCode() && t11.equals(t9));
        System.out.println(t9.hashCode()==t8.hashCode() && t9.equals(t8));
        System.out.println(t8.hashCode()==t9.hashCode() && t8.equals(t9));
        
        Weapon wp1 = new Gun(30);
        System.out.println();
        System.out.println(wp1.fired());
        
        DepW d1 = new DepW("IT");
        Worker w1 = new Worker("Вася",d1);
        Worker w2 = new Worker("Иван",d1);
        Worker w3 = new Worker("Петя",d1);
        d1.setBossS(w2);
        System.out.println();
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        
        System.out.println();
        Box<Integer> b1 = new Box<>();
        b1.setBox(3);
        System.out.println(b1.getBox());
        
        System.out.println();
        Storage<Number> g1 = new Storage<>(null);
        Storage<Number> g2 = new Storage<>(99);
        Storage<Number> g3 = new Storage<>(7);
        Storage<String> g4 = new Storage<>(null);
        Storage<String> g5 = new Storage<>("hello");
        Storage<String> g6 = new Storage<>("hi");
        System.out.println(g1.getStorage());
        System.out.println(g2.getStorage());
        System.out.println(g3.getStorage());
        System.out.println(g4.getStorage());
        System.out.println(g5.getStorage());
        System.out.println(g6.getStorage());
        
        System.out.println();
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(3);
        lst2.add(4);
        lst2.add(5);
        
        System.out.println();
        ChangeableArray<Integer> a1 = new ChangeableArray<>(1,2,3);
        List <Integer> l1 = new ArrayList<>();
        Integer [] ar1 = new Integer [2];
        ar1[0]=1;
        ar1[1]=2;
        l1.add(2);
        l1.add(5);
        ChangeableArray<Integer> a2 = new ChangeableArray<>(l1);
        System.out.println(a1);
        System.out.println(a2);
        a2.setArr(1,1);
        System.out.println(a2.getElement(1));
        System.out.println(a2);
        System.out.println(a2.size());
        System.out.println(a2.getArr());
        ChangeableArray<Integer> a3 = new ChangeableArray<>();
        System.out.println(a3.isEmpty());
        a3.add(2);
        a3.add(4);
        a3.add(5);
        a3.add(3,2);
        System.out.println(a3);
        System.out.println(a3.isAdd(0));
        a3.remove(2);
        System.out.println(a3);
        a3.add(ar1);
        System.out.println(a3);
        a3.add(l1);
        System.out.println(a3);
        System.out.println(a3);
        a3.add(3,l1);
        System.out.println(a3);
        a3.setmaxSize(5);
        System.out.println(a3);
        a3.setmaxSize(8);
        a3.add(l1);
        System.out.println(a3);
        ChangeableArray<String> a4 = new ChangeableArray<>("s","ddw","feef");
        a4.setmaxSize(10);
        System.out.println(a4);
        a4.add("efefe");
        String [] ar2 = new String [2];
        ar2[0]="rgfrgrg";
        ar2[1]="grghrhrh";
        a4.add(ar2);
        List <String> l2 = new ArrayList<>();
        l2.add("fefff");
        l2.add("feegegg");
        a4.add(l2);
        System.out.println(a4);
        
        ChangeableArray<? super Number> a5 = new ChangeableArray<>();
        a5.setmaxSize(100);
        for (int i=0;i<100;i++){
            if (i%2==0){
                a5.add((Integer)(0));
            }
            else{
                a5.add((Double)(double)(0));
            }
        }
        System.out.println(a5);
        System.out.println(a5.printList(a5));
        
        System.out.println();
        Line line5 = new Line(new Point3d(1,3,5),new Point3d(2,4,5));
        System.out.println(line5);
        System.out.println();
        
        Meowable cat1 = new Cat("Барсик");
        MeowCount countCat1 = new MeowCount(cat1);
        Warning countCat2 = new Warning(countCat1);
        foo(countCat2);
        System.out.println(countCat1.count);
        
        System.out.println();
        System.out.println();
        System.out.println();
        KarateBoy karate1 = new KarateBoy("Даниэл");
        Combo combo = new Combo();
        combo.punchs.add(new Kick());
        combo.punchs.add(new Punch());
        combo.punchs.add(new Jump());
        combo.punchs.add(x->x.punch());
        combo.perfome(karate1);
        
        System.out.println();
        TrafficLight tr = new TrafficLight();
        foo(tr);
        
        System.out.println();
        TrafficLights tr1 = new TrafficLights();
        foo(tr1);
        
        System.out.println();
        Converter cn1 = new Converter();
        cn1.doConverter(new Point(1,2));
        System.out.println(cn1.getObj());
        cn1.doConverter(new Cat("Барсик"));
        System.out.println(cn1.getObj());
        
        System.out.println();
        ru.moiseenko.Students.Student <Integer>st= new ru.moiseenko.Students.Student("Vasya",x->{return ((Integer)x>(Integer)0 && (Integer)x<(Integer)7);},6,6,6,6);
        st.setAvegerator((List<Integer> x)->
        {
            Integer sr=0;
            for (Integer i : x){
                sr+=i;
            }
            sr=sr/x.size();
            return sr;
        });
        
        st.setExcellent((List<Integer> x)->
        {
            return st.averageValue().get()>=5;
        });
        Ignor<Integer> ign1 = new Ignor();
        ign1.addMsg(new Message<Integer>(st," убрал оценку "),new Message<Integer>(st," получил оценку "),new Message<Integer>(st," значение вернулось назад"));
        Parent<Integer> par1 = new Parent(ign1);
        par1.addRelation(st, x->{
            if (par1.getRelat(st).getFavorite().favorite(st)==true){
                System.out.println("Молодец");
            }
            else if (x.getArg()!=null && x.getArg()<=3){
                if (x.getFl()==true){
                    System.out.println("Атата");
                }
                else if(x.getFl()==false){
                    System.out.println("Молодец");
                }
            }
            else if(x.getArg()!=null && x.getArg()>=6){
                if (x.getFl()==true){
                    System.out.println("Молодец");
                }
                else if(x.getFl()==false){
                    System.out.println("Атата");
                }
            }
            else if(x.getArg()!=null && x.getArg()>3 && x.getArg()<6){
                System.out.println("Приемлемо");
            }
            else{
                System.out.println("Уведомление принято");
            }
        },x->false);
        Ignor<Integer> ign2 = new Ignor();
        ign2.addMsg(new Message<Integer>(st," убрал оценку "),new Message<Integer>(st," получил оценку "),new Message<Integer>(st," значение вернулось назад"),new Message(st," изменил имя на "));
        Parent<Integer> par2 = new Parent(ign2);
        par2.addRelation(st, x->{
            if (par2.getRelat(st).getFavorite().favorite(st)==true){
                System.out.println("Молодец");
            }
            else if (x.getArg()!=null && x.getArg()<=4){
                if (x.getFl()==true){
                    System.out.println("Атата");
                }
                else if(x.getFl()==false){
                    System.out.println("Молодец");
                }
            }
            else if(x.getArg()!=null && x.getArg()>=6){
                if (x.getFl()==true){
                    System.out.println("Молодец");
                }
                else if(x.getFl()==false){
                    System.out.println("Атата");
                }
            }
            else if(x.getArg()!=null && x.getArg()>4 && x.getArg()<6){
                System.out.println("Приемлемо");
            }
            else{
                System.out.println("Уведомление принято");
            }
        },x->{
            if (x.getName().equals("Vasya")){
                return true;
            }
            else{
                return false;
            }
        });
        st.addParent(par1);
        st.addParent(par2);
        st.setDefolt(new Defolt<Integer>(null));
        System.out.println(st.aVg().getOr(8));
        st.setDefolt(new Defolt<Integer>(4));
        System.out.println(st.aVg().getOr(8));
        st.setDefolt(new Defolt<Integer>());
        System.out.println(st.aVg().getOr(8));
        st.setDefolt(new Defolt<Integer>(null,x->{
            if (x==null){
                return true;
            }
            else{
                return false;
            }
        }));
        System.out.println(st.aVg().getOr(8));
        st.setDefolt(new Defolt<Integer>(5,x->{
            if (x==null){
                return true;
            }
            else{
                return false;
            }
        }));
        System.out.println(st.aVg().getOr(8));
        st.addGrades(6,3);
        st.removeGrades(6,3);
        st.addGrades(4);
        st.rename("Petya");
        System.out.println(st);
        st.undo();
        st.undo();
        st.undo();
        st.undo();
        System.out.println(st);
        System.out.println(st.excellentStudent());
        System.out.println(st.averageValue()); 
        
        ru.moiseenko.Students.Student <Sfigurable>st1= new ru.moiseenko.Students.Student("Ivan",x->true,new Circle(1,2,3));
        Ignor<Sfigurable> ign3 = new Ignor();
        ign3.addMsg(new Message<Sfigurable>(st1," убрал оценку "),new Message<Sfigurable>(st1," получил оценку "),new Message<Sfigurable>(st1," значение вернулось назад"));
        Parent<Sfigurable> par3 = new Parent(ign3);
        par3.addRelation(st1, x->{
            if (par3.getRelat(st1).getFavorite().favorite(st1)==true){
                System.out.println("Молодец");
            }
            else if (x.getArg()!=null && x.getArg().getClass()==Circle.class){
                if (x.getFl()==true){
                    System.out.println("Атата");
                }
                else if(x.getFl()==false){
                    System.out.println("Молодец");
                }
            }
            else if(x.getArg()!=null && x.getArg().getClass()==Rectangle.class){
                if (x.getFl()==true){
                    System.out.println("Молодец");
                }
                else if(x.getFl()==false){
                    System.out.println("Атата");
                }
            }
            else if(x.getArg()!=null && x.getArg().getClass()==Triangle.class){
                System.out.println("Приемлемо");
            }
            else{
                System.out.println("Уведомление принято");
            }
        },x->false);
        st1.addParent(par3);
        st1.setAvegerator((List<Sfigurable> x)->
        {
            List<Integer>lst=Arrays.asList(0, 0, 0);
            for (Sfigurable i : x){
                if (i.getClass()==Circle.class){
                    lst.set(0, lst.get(0)+1);
                }
                else if (i.getClass()==Triangle.class){
                    lst.set(1, lst.get(1)+1);
                }
                else if (i.getClass()==Rectangle.class){
                    lst.set(2, lst.get(2)+1);
                }
            }
            if (lst.get(0)>=lst.get(1) && lst.get(0)>=lst.get(2)){
                return new Circle();
            }
            else if (lst.get(1)>=lst.get(0) && lst.get(1)>=lst.get(2)){
                return new Triangle();
            }
            else if (lst.get(2)>=lst.get(1) && lst.get(2)>=lst.get(1)){
                return new Rectangle();
            }
            return null;
        }
        );
        st1.setExcellent((List<Sfigurable> x)->
        {
            return st1.averageValue().get().getClass()==Rectangle.class;
        });
        st1.setDefolt(new Defolt<Sfigurable>(null));
        System.out.println(st1.aVg().getOr(new Triangle(1,1,2,2,3,3,new LomUnclosed())));
        st1.setDefolt(new Defolt<Sfigurable>(new Triangle(4,4,2,2,3,3,new LomUnclosed())));
        System.out.println(st1.aVg().getOr(new Triangle(1,1,2,2,3,3,new LomUnclosed())));
        st1.setDefolt(new Defolt<Sfigurable>());
        System.out.println(st1.aVg().getOr(new Triangle(1,1,2,2,3,3,new LomUnclosed())));
        st1.setDefolt(new Defolt<Sfigurable>(null,x->{
            if (x==null){
                return true;
            }
            else{
                return false;
            }
        }));
        System.out.println(st1.aVg().getOr(new Triangle(1,1,2,2,3,3,new LomUnclosed())));
        st1.setDefolt(new Defolt<Sfigurable>(new Triangle(4,4,2,2,3,3,new LomUnclosed()),x->{
            if (x==null){
                return true;
            }
            else{
                return false;
            }
        }));
        System.out.println(st1.aVg().getOr(new Triangle(1,1,2,2,3,3,new LomUnclosed())));
        st1.addGrades(new Triangle(1,1,2,2,3,3,new LomUnclosed()),new Triangle(1,1,2,2,3,3,new LomUnclosed()));
        st1.removeGrades(st1.getGrades().get(1),st1.getGrades().get(2));
        st1.rename("Andrey");
        st1.undo();
        st1.undo();
        st1.undo();
        st1.addGrades(new Triangle(1,1,2,2,3,3,new LomUnclosed()));
        st1.addGrades(new Triangle(1,4,2,6,7,3,new LomUnclosed()));
        System.out.println(st1);
        
        System.out.println(st1.averageValue());
        
        System.out.println(st1.excellentStudent());
        
        ru.moiseenko.humans.Student <String> st3= new ru.moiseenko.humans.Student("Nastya",x->{return x.toString().length()<10;},"молодец");
        st3.setAvgRule((List<String> x)->
        {
            List<Integer>lstt1=new ArrayList<>();
            List<String>lstt2=new ArrayList<>();
            String srzn=null;
            int maxx=-9999;
            for (int i=0;i<x.size();i++){
                int countk=0;
                for (int j=i;j<x.size();j++){
                    if (x.get(i).equals(x.get(j)) && i!=j){
                        countk++;
                    }
                }
                if (countk==0){
                    lstt1.add(0);
                    lstt2.add(x.get(i));
                }
            }
            for (int i=0;i<x.size();i++){
                for (int j=0;j<lstt2.size();j++){
                    if (x.get(i).equals(lstt2.get(j))){
                        lstt1.set(j, lstt1.get(j)+1);
                    }
                }
            }
            for (int i=0;i<lstt1.size();i++){
                if (maxx<lstt1.get(i)){
                    maxx=lstt1.get(i);
                    srzn=lstt2.get(i);
                }
            }
            return srzn;
        }
        );
        st3.setexcellentStud((List<String> x)->
        {
            return st3.avg().equals("отлично");
        });
        st3.addGrade("умница");
        st3.removeGrade(st3.getMarks().get(1));
        st3.setName("Petya");
        st3.undo();
        st3.undo();
        st3.undo();
        st3.addGrade("молодец");
        st3.addGrade("отлично");
        System.out.println(st3);
        
        System.out.println(st3.avg());
        
        System.out.println(st3.exc());
        
        System.out.println();
        System.out.println(Connection.create().get().read());
        System.out.println(Connection.create().get().read());
        System.out.println(Connection.create().get().read());
        System.out.println(Connection.create().get().read());
        System.out.println(Connection.create().get().read());
        System.out.println(Connection.create());
        
        System.out.println();
        Stud st8 = new Stud("Олег",5,7,9,23,765,124);
        Defol d8 = st8.avg();
        System.out.println(d8.ar(5));
        
        System.out.println();
        Storagen<Integer> stg1 = new Storagen();
        stg1.setRule((x)->{
            if (x==null){
                throw new IllegalArgumentException("Введён null");
            }
            return true;
        });
        stg1.addOb(99);
        System.out.println(stg1.getStoragen(0));
        Storagen<String> stg2 = new Storagen();
        stg2.setRule((x)->true);
        stg2.addOb("hello");
        System.out.println(stg2.getStoragen("hello world"));
        
        System.out.println();
        ETemperature temp1 = ETemperature.temper(-10);
        System.out.println(temp1.getTemp());
        
        System.out.println();
        Point23D point23d1 = Point23D.create(1,2);
        System.out.println(point23d1);
        Point23D point23d2 = Point23D.create(1,2,3);
        System.out.println(point23d2);
        
        System.out.println();
        GeneratorName genname1 = GeneratorName.generator("Ivan","Ivanov","Ivanovich");
        NameGener nameg1=genname1.getName();
        System.out.println(genname1.getName());
        GeneratorName genname2 = GeneratorName.generator("Andrey","Ivanov","Ivanovich");
        System.out.println(genname2.getName());
        NameGener nameg2=genname2.getName();
        GeneratorName genname3 = GeneratorName.generator("Ivan","Ivanov","Ivanovich");
        System.out.println(genname3.getName());
        NameGener nameg3=genname3.getName();
        GeneratorName genname4 = GeneratorName.generator("Ivanov","Ivan","Ivanovich");
        System.out.println(genname4.getName());
        NameGener nameg4=genname4.getName();
        
        System.out.println(nameg1.equals(nameg1));
        System.out.println(nameg1.equals(nameg2));
        System.out.println(nameg1.equals(nameg3));
        System.out.println(nameg1.equals(nameg4));
        System.out.println(nameg1.hashCode()==nameg3.hashCode());
        
        System.out.println(genname1.equals(genname1));
        System.out.println(genname1.equals(genname2));
        System.out.println(genname1.equals(genname3));
        System.out.println(genname1.equals(genname4));
        System.out.println(genname1.hashCode()==genname3.hashCode());
        
        System.out.println();
        Fraction<Number> fract1 = new Fraction(1,2);
        SumString<String> fract2 = new SumString(fract1);
        List<String> numstr = new ArrayList<>();
        numstr.add("1");
        numstr.add("44");
        numstr.add("7");
        System.out.println(fract2.doubleSum(numstr));
        
        System.out.println();
        ru.moiseenko.lines.Line<Pointable> lnl1 = new ru.moiseenko.lines.Line(new ru.moiseenko.lines.Point(1,2),new ru.moiseenko.lines.Point(7,4));
        System.out.println(lnl1.lenLom(lnl1.getEnd(),lnl1.getStart()));
        ru.moiseenko.lines.LenString<String> lnl2 = new ru.moiseenko.lines.LenString(lnl1);
        System.out.println(lnl2.lenLom("wdwdwdw","fefefef","gthth5h"));
        
        System.out.println();
        Cat cct1 = new Cat("Барсик");
        Dog ddg1 = new Dog("Рекс");
        Catodog cd1 = new Catodog(cct1,ddg1);
        cd1.meow();
        MeowCount mcd1 = new MeowCount(cd1);
        mcd1.meow();
        System.out.println(mcd1.count);
        Warning wcd1 = new Warning(cd1);
        wcd1.meow();
        System.out.println(cd1);
        
        System.out.println();
        GroupShift gr1 = new GroupShift(new Point(1,2),new Point(3,4));
        GroupShift gr2 = new GroupShift(new Line(new Point(1,2),new Point(3,4)),new Line(new Point(5,6),new Point(7,8)));
        GroupShift gr3 = new GroupShift(gr1,gr2);
        GroupShift gr4 = new GroupShift(new Rectangle(new Point(1,2),2,3,new LomClosed()),gr3);
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(0).get().getList().get(0));
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(0).get().getList().get(1));
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(1).get().getList().get(0));
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(1).get().getList().get(1));
        System.out.println(gr4.getList().get(0));
        gr4.shiftCoordinate("x", 10);
        System.out.println();
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(0).get().getList().get(0));
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(0).get().getList().get(1));
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(1).get().getList().get(0));
        System.out.println(gr4.getGroupShift(1).get().getGroupShift(1).get().getList().get(1));
        System.out.println(gr4.getList().get(0));
        
        System.out.println();
        KarateBoy karate2 = new KarateBoy("Тайлер");
        KarateBoy karate3 = new KarateBoy("Эдвард");
        ComboKarateBoy combokarate = new ComboKarateBoy();
        combokarate.karates.add(new KarateFight(karate2,new Punch()));
        combokarate.karates.add(new KarateFight(karate3,new Kick()));
        combokarate.karates.add(new KarateFight(karate2,new Jump()));
        combokarate.karateka();
        
        System.out.println();
        Departs depps1 = new Departs(new Statement("Василий","Заявление на работу"));
        depps1.addDepart(x->{
            if (x.getName().equals("Вася")){
                x.setIsAccepted(false);
                return x;
            }
            else{
                x.setIsAccepted(true);
                x.addSignature("Безопасность");
                return x;
            }
        });
        depps1.addDepart(x->{
            List<String>lstJobs=Arrays.asList("Программист", "Дизайнер", "Менеджер");
            if (lstJobs.isEmpty()){
                x.setIsAccepted(false);
                return x;
            }
            else{
                x.setIsAccepted(true);
                x.addSignature("Отдел кадров");
                return x;
            }
        });
        depps1.addDepart(x->{
            if (!((x.getTextStatement().charAt(0)>='А' && x.getTextStatement().charAt(0)<='Я')||(x.getTextStatement().charAt(0)>='A' && x.getTextStatement().charAt(0)<='Z'))){
                x.setIsAccepted(false);
                return x;
            }
            for (String i:x.getLstSignature()){
                if (i.equals("Отдел кадров")){
                    x.setIsAccepted(true);
                    x.addSignature("Бухгалтерия");
                    return x;
                }
            }
            x.setIsAccepted(false);
            return x;
        });
        System.out.println(depps1.isReception());
        
        System.out.println();
        Stock stock1 = new Stock("ORCL",75);
        Stock stock2 = new Stock("TSLA",696);
        Printer prin1 = new Printer((x,y)->{
            if (!x.equals(y)){
                return false;
            }
            if (x.getWell()!=y.getWell()){
                return true;
            }
            return false;
        });
        Bot bt1 = new Bot((x,y)->{
            if (!x.equals(y)){
                return false;
            }
            if (y.getWell()<70){
                return true;
            }
            return false;
        });
        prin1.addLstStock(stock1);
        prin1.addLstStock(stock2);
        stock1.setWell(69);
        stock2.setWell(700);
        bt1.addLstStock(stock1);
        prin1.alert(stock1);
        prin1.alert(stock2);
        bt1.alert(stock1);
        
        System.out.println();
        List<Pointt> points11 = Arrays.asList(new ru.moiseenko.lomans.Pointt(1,2),new ru.moiseenko.lomans.Pointt(2,3),new ru.moiseenko.lomans.Pointt(3,4));
        ru.moiseenko.lomans.PointPrinter ppr1 = new ru.moiseenko.lomans.PointPrinter(new ru.moiseenko.lomans.LomamClosed(points11),1,(x,y)->{
            if (x.getClass()==ru.moiseenko.lomans.LomanUnclosed.class){
                return false;
            }
            else if(x.getClass()==ru.moiseenko.lomans.LomamClosed.class){
                return true;
            }
            else{
                throw new IllegalArgumentException("Не ломанная");
            }
        });
        System.out.println(ppr1.printPoint());
        System.out.println(ppr1.printPoint());
        System.out.println(ppr1.printPoint());
        System.out.println(ppr1.printPoint());
        List<Pointt> points12 = Arrays.asList(new ru.moiseenko.lomans.Pointt(2,3),new ru.moiseenko.lomans.Pointt(3,4),new ru.moiseenko.lomans.Pointt(4,5));
        ru.moiseenko.lomans.PointPrinter ppr2 = new ru.moiseenko.lomans.PointPrinter(new ru.moiseenko.lomans.LomanUnclosed(points12),1,(x,y)->{
            if (x.getClass()==ru.moiseenko.lomans.LomanUnclosed.class){
                return false;
            }
            else if(x.getClass()==ru.moiseenko.lomans.LomamClosed.class){
                return true;
            }
            else{
                throw new IllegalArgumentException("Не ломанная");
            }
        });
        System.out.println(ppr2.isShift());
        System.out.println(ppr2.printPoint());
        System.out.println(ppr2.isShift());
        System.out.println(ppr2.printPoint());
        System.out.println(ppr2.isShift());
        
        System.out.println();
        Watchman wtc1 = new Watchman(new Man("Вася",0));
        System.out.println(wtc1.checkUser());
        Watchman wtc2 = new Watchman(new Studd("Андрей",234124,x->{
            if (!x.getName().isEmpty() && x.getId()!=0){
                return true;
            }
            else{
                return false;
            }
        }));
        System.out.println(wtc2.checkUser());
        Watchman wtc3 = new Watchman(new Teacher("Петя",254643,x->{
            if (!x.getName().isEmpty() && (x.getId()!=0 || !x.getJob().isEmpty())){
                return true;
            }
            else{
                return false;
            }
        },"Программист"));
        System.out.println(wtc3.checkUser());
        
        System.out.println();
        List<Integer>arri1 = Data.of(1,2,3).action(x->x*2).filter(x->x>5).get();
        System.out.println(arri1);
        
        System.out.println();
        Tasks<String>tsk1=new Tasks("Вася","Петя","Проверить все имена на первую большую букву",(x,y)->{
            if (x.getLstTs().isEmpty()){
                return "Принято";
            }
            if (y==false){
               return "Отклонено"; 
            }
            else if (y==true){
                return "Выполнено"; 
            }
            else{
                return "Принято";
            }
        });
        tsk1.addTs((x,y)->{
            boolean b=true;
            for (String s : y){
                if ((s.charAt(0)>='А' && s.charAt(0)<='Я') || (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                    b = true;
                }
                else{
                    b = false;
                }
            }
            return b;
        });
        tsk1.addTs((x,y)->{
            if ((x.getPersonAccepted().charAt(0)>='А' && x.getPersonAccepted().charAt(0)<='Я') || (x.getPersonAccepted().charAt(0)>='A' && x.getPersonAccepted().charAt(0)<='Z')){
                return true;
            }
            else{
                return false;
            }
        });
        System.out.println(tsk1.printTask("Иван"));
        
        System.out.println();
        ExcelFile<Integer>excel1=new ExcelFile(3,3);
        excel1.add(0, 0, new ExcelValue(0,0,1));
        excel1.add(0, 1, new ExcelValue(0,1,2));
        excel1.add(0, 2, new ExcelValue(0,2,3));
        excel1.add(1, 0, new ExcelValue(1,0,4));
        excel1.add(1, 1, new ExcelValue(1,1,5));
        excel1.add(1, 2, new ExcelValue(1,2,6));
        excel1.add(2, 0, new ExcelValue(2,0,7));
        ExcelFormula<Integer> ef1 = new ExcelFormula<Integer>(2,1,x->{
            int sum=0;
            for (ExcelCellable<Integer> i: x){
                if (i!=null){
                    sum+=i.getValue();
                }
            }
            return sum;
        });
        ef1.addAddition(excel1.getLstE().get(0).get(0));
        ef1.addAddition(excel1.getLstE().get(1).get(0));
        ef1.addAddition(excel1.getLstE().get(2).get(0));
        ef1.valueForm();
        ExcelFormula<Integer> ef2 = new ExcelFormula<Integer>(2,2,x->{
            int sum=0;
            for (ExcelCellable<Integer> i: x){
                if (i!=null){
                    sum+=i.getValue();
                }
            }
            return sum;
        });
        ef2.addAddition(excel1.getLstE().get(0).get(0));
        ef2.addAddition(excel1.getLstE().get(0).get(1));
        ef2.addAddition(excel1.getLstE().get(0).get(2));
        ef2.valueForm();
        excel1.add(ef1.getX(),ef1.getY(),ef1);
        excel1.add(ef2.getX(),ef2.getY(),ef2);
        for (int i=0;i<excel1.getX();i++){
            for (int j=0;j<excel1.getY();j++){
                System.out.print(excel1.getLstE().get(i).get(j).getValue()+" ");
            }
            System.out.println("\n");
        }
        System.out.println();
        TrafficLights tr2 = new TrafficLights();
        tr2.on();
        int x1=0;
        while (tr2.iterator().hasNext()) {
            x1++;
            tr2.next();
            System.out.println(tr2.iterator().next());
            if (x1==10){
                tr2.off();
            }
        }
        System.out.println();
        tr2.on();
        x1=0;
        for (Iterator<Colorable> it = tr2.iterator(); it.hasNext();) {
            Colorable item = it.next();
            System.out.println(item);
            x1++;
            if (x1==10){
                tr2.off();
                it=tr2.iterator();
            }
        }
        System.out.println();
        System.out.println(Stream.of("qq","ww","qqqqqqqq","eee")
                .filter(x->x.length()>5)
                .map(x->x.length())
                .reduce(0, (x,y)->x+y)
        );
        System.out.println(Stream.of("qq","ww","qqqqqqqq","eee")
                .peek(x->System.out.println(x))
                .map(x->x.chars().boxed())
                .flatMap(x->x)
                .filter(x->x=='q')
                .count()
        );
        System.out.println(Stream.of("qq","ww","qqqqqqqq","eee")
                .peek(x->System.out.println(x))
                .filter(x->x.length()>1)
                .map(x->x.length())
                .collect(Collectors.toSet())
        );
        Stream.of("qq","ww","qqqqqqqq","eee")
                .map(x->x.chars().boxed())
                .flatMap(x->x)
                .filter(x->x=='w')
                .forEach(x->System.out.println((char)(int)x));
        List<String>lst10=new ArrayList<>(List.of("qq","ww","qqqqqqqq","eee"));
        List<String>lst11=new ArrayList<>(List.of("qq","ww","qqqqqqqq","eee"));
        System.out.println(Stream.of(lst10,lst11)
                .count()
        );
        System.out.println(Stream.of(lst10,lst11)
                .flatMap(x->x.stream())
                .count()
        );
        System.out.println(Stream.ofNullable(null)
        );
        System.out.println(Stream.empty()
        );
        System.out.println(Stream.concat(Stream.of(lst10),Stream.of(lst10))
        );
        Stream.iterate(0,x->x<15,x->x+1)
                .skip(10)
                .limit(10)
                .forEach(x->System.out.println(x));
        Stream.Builder builder=Stream.builder();
        builder.build();
        System.out.println(Stream.generate(new MySup())
                .limit(10)
                .collect(Collectors.toList())
        );
        System.out.println(IntStream.range(0,10)
                .sum()
        );
        System.out.println(IntStream.rangeClosed(0,10)
                .sum()
        );
        System.out.println(IntStream.rangeClosed(0,10)
                .summaryStatistics()
        );
        System.out.println(Stream.of("qq","ww","qqqqqqqq","eee")
                .parallel()
                .peek(x->System.out.println(x))
                .filter(x->x.length()>1)
                .map(x->x.length())
                .reduce(0, (x,y)->x+y)
        );
        System.out.println(ru.moiseenko.potoks.Potok.of("qq","ww","qqqqqqqq","eee")
                .filtres(x->x.length()>5)
                .map(x->x.length())
                .map(x->x)
                .reduce(0, (x,y)->x+y)
        );
    }
    public static void foo(TrafficLights t){
        System.out.println(t.next());
        t.on();
        System.out.println(t.next());
        System.out.println(t.next());
        System.out.println(t.next());
        t.off();
        System.out.println(t.next());
    }
    public static void foo(TrafficLight t){
        t.on();
        System.out.println(t.next());
        System.out.println(t.next());
        System.out.println(t.next());
        t.off();
        System.out.println(t.next());
    }
    public static void foo(Meowable c){
        c.meow();
        c.meow();
    }
    public static double powNumbs(String x1, String y1){
        int x=parseInt(x1);
        int y=parseInt(y1);
        return pow(x,y);
    }
    public static void sing(List<Singable> birds){
        for (Singable s : birds) {
            System.out.println(s.singing());
        }
    }
    public static void meows(List<Meowable>cats){
        for (Meowable s : cats) {
            System.out.println(s);
            s.meow();
            s.meow(3);
        }
    }
    public static void numbsum(List<Doublesumable>numb1,List<Number> numb2){
        for (Doublesumable s : numb1) {
            System.out.println(s.doubleSum(numb2));
        }
    }
    public static void fire(List<Shooter>sh){
        for (Shooter s: sh){
            System.out.println(s.shotbul());
        }
    }
    public static void rechB(List<Shooter>sh){
        for (Shooter s: sh){
            System.out.println(s.rechargeBul());
        }
    }
    public static void rechS(List<Shooter>sh,int bul){
        for (Shooter s: sh){
            s.rechargS(bul);
        }
    }
    public static void disch(List<Shooter>sh){
        for (Shooter s: sh){
            s.dischargeS();
        }
    }
    public static void twns(List<Townable>tw){
        for (Townable s : tw) {
            System.out.println(s);
        }
    }
     public static void Sfigur(List<Sfigurable> figures){
        for(Sfigurable f: figures){
            System.out.println(f);
            System.out.println(f.sFigure());
        }
    }
    public static void lFigur(List<Polygonable>figures){
        double ln=0;
        for(Polygonable s: figures){
            System.out.println(s);
            s.polygonalChain();
            System.out.println(s.getPolygonalChain().lenLom());
            ln+=s.getPolygonalChain().lenLom();
        }
        System.out.println(ln);
    }
    
}

class DepW extends Department{
    public DepW(String otdels){
        this(otdels, null);
    }
    public DepW(Worker bossS){
        this(null, bossS);
    }
    public DepW(String otdels, Worker bossS){
        super(otdels, bossS);
    }
    
    public String getOtdels() {
        return otdels;
    }

    public Worker getBossS() {
        return bossS;
    }

    public void setBossS(Worker bossS) {
        this.bossS = bossS;
    }

    public void setOtdels(String otdels) {
        this.otdels = otdels;
    }
    
}