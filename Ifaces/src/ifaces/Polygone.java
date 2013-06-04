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
     
         Vector <Vecteur> p= new Vector <Vecteur>();
         this.points=p;
         
         this.points.add(this.origine);
     }
     
     public void ajout (int x, int y){
         Vecteur v= new Vecteur(x,y);
         this.points.add(v);
     }
     
     @Override
     public String toString(){
         String sPoints="";
         
         for(int i=0; i<this.points.size();i++){
             sPoints+="\n"+this.points.get(i);
         }
         
         
        return "Je suis un Polygone d'origine :" +this.origine.toString()+". Je contient les points suivants :"+sPoints;
    }
     
     // methodes issues de l'héritage de Forme
     
     @Override
     public double perimetre(){
         
         if (this.points.size()==1)
             return 0.00;
         else{
             double perimetre=0.00;
             
             for(int i=0; i<this.points.size()-1;i++){
                perimetre+=this.points.get(i).distanceTo(this.points.get(i+1));
             }

             return perimetre;
         }
          
         
        
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
