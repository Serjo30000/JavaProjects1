/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.moiseenko.lines;

import java.util.Objects;

/**
 *
 * @author Serge
 * @param <T>
 */
public class Line<T extends Pointable> implements Lenable<T>, Cloneable{
    private T startP, endP;
    public Line(T startP, T endP){
        if (startP==null || endP==null){
            throw new IllegalArgumentException("Нет точек");
        }
        this.startP=startP;
        this.endP=endP;
    }
    public Point getStart(){
        if (startP.getClass()==Point.class){
            return (Point) startP;
        }
        else{
            return (Point3d) startP;
        }
    }
    public Point getEnd(){
        if (endP.getClass()==Point.class){
            return (Point) endP;
        }
        else{
            return (Point3d) endP;
        }
    }
    public void setStart(Point sp){
        if (sp==null){
            throw new IllegalArgumentException("Нет точки");
        }
        startP=(T)sp;
    }
    public void setEnd(Point ep){
        if (ep==null){
            throw new IllegalArgumentException("Нет точки");
        }
        endP=(T)ep;
    }
    public void setStart3d(Point3d sp){
        if (sp==null){
            throw new IllegalArgumentException("Нет точки");
        }
        startP=(T)sp;
    }
    public void setEnd3d(Point3d ep){
        if (ep==null){
            throw new IllegalArgumentException("Нет точки");
        }
        endP=(T)ep;
    }
    public String lineHelper(Line l2){
        if (((getStart().x==l2.getStart().x && getStart().y==l2.getStart().y) || (getEnd().x==l2.getEnd().x && getEnd().y==l2.getEnd().y))||((getStart().x==l2.getEnd().x && getStart().y==l2.getEnd().y) || (getEnd().x==l2.getStart().x && getEnd().y==l2.getStart().y))){
            throw new IllegalArgumentException("Отрезки имеют общую точку");
        }
        if (((((Point3d)(getStart())).x==((Point3d)l2.getStart()).x && ((Point3d)(getStart())).y==((Point3d)l2.getStart()).y && ((Point3d)(getStart())).z==((Point3d)l2.getStart()).z) || (((Point3d)(getEnd())).x==((Point3d)l2.getEnd()).x && ((Point3d)(getEnd())).y==((Point3d)l2.getEnd()).y && ((Point3d)(getEnd())).z==((Point3d)l2.getEnd()).z))||((((Point3d)(getStart())).x==((Point3d)l2.getEnd()).x && ((Point3d)(getStart())).y==((Point3d)l2.getEnd()).y && ((Point3d)(getStart())).z==((Point3d)l2.getEnd()).z) || (((Point3d)(getEnd())).x==((Point3d)l2.getStart()).x && ((Point3d)(getEnd())).y==((Point3d)l2.getStart()).y && ((Point3d)(getEnd())).z==((Point3d)l2.getStart()).z))){
            throw new IllegalArgumentException("Отрезки имеют общую точку");
        }
        return "Линия " + l2.startP + " " + l2.endP;
    }
    @Override
    public double lenLom(T...points){
        if (points.length!=2){
            return 0;
        }
        T stP=points[0];
        T enP=points[1];
        double ln=0;
        if (stP.getClass()==Point.class && enP.getClass()==Point.class){
            ln = Math.sqrt((((Point)stP).x - ((Point)enP).x)*(((Point)stP).x - ((Point)enP).x)+(((Point)stP).y - ((Point)enP).y)*(((Point)stP).y - ((Point)enP).y));
        }
        if (stP.getClass()==Point3d.class && enP.getClass()==Point3d.class){
            ln = Math.sqrt((((Point3d)(stP)).x - ((Point3d)(enP)).x)*(((Point3d)(stP)).x - ((Point3d)(enP)).x)+(((Point3d)(enP)).y - ((Point3d)(enP)).y)*(((Point3d)(stP)).y - ((Point3d)(enP)).y)+(((Point3d)(stP)).z - ((Point3d)(enP)).z)*(((Point3d)(stP)).z - ((Point3d)(enP)).z));
        }
        return ln;
    }
    @Override
    public Lenable getPolygonalChain(){
        return new Line(startP,endP);
    }
    @Override
    public int hashCode(){
        int hash = 3;
        hash = 3 * hash + Objects.hashCode(this.startP);
        hash = 5 * hash + Objects.hashCode(this.startP);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass()) return false;
        Line ln = (Line) obj;
        if (ln.startP.getClass()==Point.class && ln.endP.getClass()==Point.class){
            if (!(this.getStart()==ln.getStart() || ln.getStart()!=null && (this.getStart().x==ln.getStart().x && this.getStart().y==ln.getStart().y))) return false;
            if (!(this.getEnd()==ln.getEnd() || ln.getEnd()!=null && (this.getEnd().x==ln.getEnd().x && this.getEnd().y==ln.getEnd().y))) return false;
        }
        if (ln.startP.getClass()==Point3d.class && ln.endP.getClass()==Point3d.class){
            if (!(((Point3d)this.getStart())==((Point3d)ln.getStart()) || ((Point3d)ln.getStart())!=null && (((Point3d)this.getStart()).x==((Point3d)ln.getStart()).x && ((Point3d)this.getStart()).y==((Point3d)ln.getStart()).y && ((Point3d)this.getStart()).z==((Point3d)ln.getStart()).z))) return false;
            if (!(((Point3d)this.getEnd())==((Point3d)ln.getEnd()) || ((Point3d)ln.getEnd())!=null && (((Point3d)this.getEnd()).x==((Point3d)ln.getEnd()).x && ((Point3d)this.getEnd()).y==((Point3d)ln.getEnd()).y && ((Point3d)this.getEnd()).z==((Point3d)ln.getEnd()).z))) return false;
        }
        return true;
    }
    @Override
    public Line clone() throws CloneNotSupportedException{
        try{
            Line lin = (Line)super.clone();
            lin.startP = startP;
            lin.endP = endP;
            return lin;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public String toString(){
        return "Линия " + startP + " " + endP;
    }
}
