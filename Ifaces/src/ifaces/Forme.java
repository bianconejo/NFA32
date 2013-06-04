/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author roletar
 */
public abstract class Forme implements Englobable, Localisable{
    
    protected Vecteur origine;
    
    Forme (int x, int y){
        this.origine.setX(x);
        this.origine.setY(y);
    }
    
    public abstract double perimetre();

    public abstract double surface();
    
    @Override
    public String toString(){
        return "";
    }
    
    // methode issues des interfaces
//    @Override
//    public Rectangle boundingBox(){
//        
//        Rectangle r;
//        
//        return r;
//    }
    
//    
    @Override
    public Vecteur locate(){
        return this.origine;
    }
    
    
    @Override
    public void translate(int x, int y){
        
       this.origine.setX(this.origine.getX()+x);
       this.origine.setY(this.origine.getY()+y);
    }
    
    
}
