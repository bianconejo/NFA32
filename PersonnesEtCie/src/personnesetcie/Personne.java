/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnesetcie;

/**
 *
 * @author roletar
 */
public class Personne {
    protected String nom;
    private String prenom;
    
    public Personne(String nom, String prenom)
    {
        this.nom=nom;
        this.prenom=prenom;
    }
    
    @Override
    public String toString(){
        return "Prenom: "+this.prenom+" Nom: "+this.nom;
    }
    
    public  boolean hasName(String nom){
        if (this.nom.matches(nom)){
            return true;
        }
        else return false;
    }
}
