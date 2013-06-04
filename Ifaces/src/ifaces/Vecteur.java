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
    
    public double distanceTo (Vecteur v){
        
        return 0.00;
        
    }
    
    public String toString(){
        return "";
    }
    
    @Override
    public Vecteur locate(){
        
        Vecteur v;
        
        return v;
    }
    
    
    @Override
    public void translate(int x, int y){
        
        
    }
    
    
}
