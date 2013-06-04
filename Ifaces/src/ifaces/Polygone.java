/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

import java.util.Vector;

/**
 *
 * @author roletar
 */
public class Polygone extends Forme {
    
     private Vector <Vecteur> points;
        
     Polygone (int x, int y){
         super(x,y);
         this.points.add(this.origine);
     }
     
     public void ajout (int x, int y){
         Vecteur v= new Vecteur(x,y);
         this.points.add(v);
     }
     
     @Override
     public String toString(){
        return "";
    }
     
     // methodes issues de l'héritage de Forme
     
     @Override
     public double perimetre(){
         return 0.00;
     }
     
     @Override
     public double surface(){
         return -1.00;
     }
     
     
     
    // methode issues des interfaces
    @Override
    public Rectangle boundingBox(){
        
        Rectangle r;
        
        // trouver les deux points extremes
        
        r=new Rectangle(0,0,0,0);
        
        return r;
    }
    
    
   
}
