/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnesetcie;

/**
 *
 * @author roletar
 */
public class Employeur extends Personne {
    
    private Entreprise entreprise;
    
    public Employeur(String nom, String prenom){
        super(nom, prenom);
        this.entreprise=new Entreprise(nom,this);
    }
    
    public void embauche(Employe e)
    {
        this.entreprise.embauche(e);
    }
    
    public void licencie(String nomEmploye)
    {
        this.entreprise.licencie(nomEmploye);
    }
    
    @Override
    public String toString(){
        return "Employeur : "+this.nom+"\n"+"liste employes :\n"+this.entreprise.toString();
    }
}
