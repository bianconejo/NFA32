/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnesetcie;

/**
 *
 * @author roletar
 */
public class Employe extends Personne {
    
    private Entreprise e;
    
    public Employe(String nom, String prenom)
    {
        super(nom, prenom);
    }
    
    public void changeEntreprise(Entreprise nouveauBoulot)
    {
        
    }
    
}
