/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author roletar
 */
public class Vecteur implements Localisable{
    private int x;
    private int y;
    
    Vecteur (int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int  getX(){
        return x;
    }
    
    public int  getY(){
        return y;  
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public double distanceTo (Vecteur v){
        return Math.sqrt(Math.pow((double)(v.x-this.x), 2)+Math.pow((double)(v.y-this.y), 2));
    }
    
    public String toString(){
        return "("+this.getX()+","+this.getY()+")";
    }
    
    @Override
    public Vecteur locate(){
        return this;
    }
    
    
    @Override
    public void translate(int x, int y){
        this.x+=x;
        this.y+=y;
       
    }
    
    
}
