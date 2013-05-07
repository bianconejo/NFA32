/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnesetcie;

/**
 *
 * @author roletar
 */
public class Entreprise  {
    private String nom;
    private Employe listeEmployes[];
    
    public Entreprise (String nom, Employeur lePatron){
        this.nom="SARL "+nom;
    }
    
    @Override
    public String toString(){
        String resultat="";
        
        for (int i=0; i<listeEmployes.length;i++)
        {
            resultat+=listeEmployes[i].toString()+"\n";
        }
        
        return resultat;
    }
    
    public String getNom(){
        
        return this.nom;
    }
    
    public void embauche(Employe e)
    {
        listeEmployes.
    }
    
    public void licencie(String nomEmploye)
    {
        
    }
    
    
}
