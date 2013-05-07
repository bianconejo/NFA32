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
    
    private Entreprise e;
    
    public Employeur(String nom, String prenom){
        super(nom, prenom);
        this.e=new Entreprise(this.nom,this);
    }
    
    public void embauche(Employe e)
    {
        
    }
    
    public void licencie(String nomEmploye)
    {
        
    }
    
    @Override
    public String toString(){
        return "Employeur : "+this.nom+"\n"+"liste employes :\n"+this.e.toString();
    }
}
