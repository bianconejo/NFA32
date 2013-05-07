/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnesetcie;

import java.util.Vector;

/**
 *
 * @author roletar
 */
public class Entreprise  {
    private String nom;
    private Vector<Employe> listeEmployes;
    private Employeur patron;
    
    public Entreprise (String nom, Employeur lePatron){
        this.nom="SARL "+nom;
        this.patron=lePatron;
    }
    
    @Override
    public String toString(){
        String resultat="";
        
        if (!this.listeEmployes.isEmpty()){
                for (int i=0; i<listeEmployes.size();i++)
                {
                    resultat+=listeEmployes.get(i).toString()+"\n";
                }
        }

        return resultat;
    }
    
    public String getNom(){
        
        return this.nom;
    }
    
    public void embauche(Employe e)
    {
        this.listeEmployes.add(e);
    }
    
    public void licencie(String nomEmploye)
    {
        for (int i=0; i<listeEmployes.size();i++)
        {
            if (listeEmployes.get(i).hasName(nomEmploye)){
                listeEmployes.remove(i);
            }          
        }
        
    }
    
    
}
