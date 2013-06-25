/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author roletar
 */
public class Femme extends Humain {
    
    private boolean menopause;
    
    Femme(){
        super();
        this.menopause=false;
    }
   
    Femme(String nom, String prenom, String ddn, int numsecu, boolean menopause){
        super(nom,prenom,ddn,numsecu,'F');
        this.menopause=menopause;      
    }
    
    public boolean getMenopause(){
        return this.menopause;
    }
    
    public void setMenopause(boolean menopause){
        this.menopause=menopause;
    }
    

    public String toRope(){
        return super.toRope()+"/ ménopausée: "+this.menopause;
    }
}
