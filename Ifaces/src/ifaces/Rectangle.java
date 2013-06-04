/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author roletar
 */
public class Rectangle extends Forme {
    
    protected int largeur;
    protected int hauteur;
    
    Rectangle (int x, int y, int largeur, int hauteur){
        super(x,y);
        this.hauteur=hauteur;
        this.largeur=largeur;
        
    }
    
    public String toString(){
        return "";
    }
    
    // methodes issues de l'héritage de Forme
     
     @Override
     public double perimetre(){
         return (double)(2*this.largeur+2*this.hauteur);
     }
     
     @Override
     public double surface(){
         return (double)(this.largeur*this.hauteur);
     }
    
        // methode issues des interfaces
    @Override
    public Rectangle boundingBox(){
        return this;
    }
    
    
   
}
