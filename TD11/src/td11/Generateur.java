/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package td11;

/**
 *
 * @author roletar
 */
public class Generateur {
    
    public void randomize(Liste l){
        randomize(l, (int)(2000*Math.random()));
    }
    
    public void randomize(Liste l, int nbElt){
        
        for(int i=0; i<nbElt;i++)
        {
            l.add(new Element((int)(100*Math.random())));
        }
    }
}
