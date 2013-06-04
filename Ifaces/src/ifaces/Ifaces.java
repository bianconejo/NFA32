/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author roletar
 */
public class Ifaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carre c=new Carre(5,1,2);
        Polygone p=new Polygone (2,3);
        
        p.ajout(3,2);
        
        System.out.println("perimetre de p :"+p.perimetre() );
        
        
        System.out.println(c.toString());
        System.out.println(p.toString());
        System.out.println();
        System.out.println("Distance entre l'origine de c et celle de p :");
        System.out.println(c.origine.distanceTo(p.origine));
        
        
        
        
        Vecteur v= new Vecteur(6,9);
        
        Localisable l=v;
        
        System.out.println("origine du carré:"+l.locate().toString());
        
        
        
    }
}
