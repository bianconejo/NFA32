/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author roletar
 */
public class Homme extends Humain{
    
    private boolean sansProstate;
    
    Homme(){
        super();
        this.sansProstate=false;
    }
    
    Homme(String nom, String prenom, String ddn, int numsecu, boolean prostate){
        super(nom,prenom,ddn,numsecu,'H');
        this.sansProstate=prostate;        
    }
    
    
    public boolean getProstate(){
        return this.sansProstate;
    }
    
    public void setProstate(boolean prostate){
        this.sansProstate=prostate;
    }
   
    public String toRope(){
        return super.toRope()+"/ possède prostate : "+this.sansProstate;
    }
    
    
    
}
