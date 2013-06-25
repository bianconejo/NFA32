/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Vector;

/**
 *
 * @author roletar
 */
public class Registre {
    
    private static int nss;
    private Vector<Humain> listeRegistre;
    
    Registre(){
        this.nss=0;
        listeRegistre= new Vector<Humain>();
    }
    
    public void addHumain(Humain hum){
        boolean exists= false;
        
        for( int i=0; i<this.listeRegistre.size();i++){
            if (this.listeRegistre.get(i).getNumerosecu()==hum.getNumerosecu())
                exists=true;
        }
        
        if (!exists){
            hum.setNumerosecu(nss);
            nss++;
            this.listeRegistre.add(hum);
        }
    }

    @Override
    public String toString (){
        return this.listeRegistre.toString();
        
    }
}
