/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author roletar
 */
public class Carre extends Rectangle{
    
    Carre (int x, int y, int cote){
        super (x,y,cote,cote);
    }
    
    public String toString(){
        return "Je suis un carré de coté "+this.;
    }
    
}
