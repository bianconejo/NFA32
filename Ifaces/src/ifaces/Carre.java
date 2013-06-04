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
        return "Je suis un carré d'origine "+this.origine.toString()+" de coté "+this.hauteur+" mon perimetre est "+
                this.perimetre()+" m ma surface est "+this.surface()+" m². Ma bounding box est moi meme."
                ;
    }
    
}
