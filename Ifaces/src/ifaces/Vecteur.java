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
        
    }
    
    public int  getX(){
        return 0;
        
    }
    
    public int  getY(){
        return 0;
        
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
         
    }
    
    public double distanceTo (Vecteur v){
        
        return 0.00;
        
    }
    
    public String toString(){
        return "";
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
