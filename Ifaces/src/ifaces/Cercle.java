/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author roletar
 */
public class Cercle extends Forme {
  
    private int rayon;
    
    Cercle (int x , int y, int rayon){
        super(x,y);
        this.rayon=rayon;
    }
    
    public String toString(){
        return "";
    }
    
    // methodes issues de l'héritage de Forme
     
     @Override
     public double perimetre(){
         return 2*Math.PI*this.rayon;
         
    //     volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
     }
     
     @Override
     public double surface(){
         return Math.PI*Math.pow(rayon, 2.00);
     }
     
    // methode issues des interfaces
    @Override
    public Rectangle boundingBox(){
        
        Carre c=new Carre(this.origine.getX()-rayon,this.origine.getY()-rayon,2*this.rayon);
        
        return c;
    }
    
}
