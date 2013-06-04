/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author roletar
 */
public class Forme implements Englobable, Localisable{
    
    private Vecteur origine;
    
    Forme (int x, int y){
        
    }
    
    public double perimetre(){
        return 0.00;
    }
    
    
    public double surface(){
        return 0.00;
    } 
    
    
    @Override
    public String toString(){
        return "";
    }
    
    // methode issues des interfaces
    @Override
    public Rectangle boundingBox(){
        
        Rectangle r;
        
        return r;
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
