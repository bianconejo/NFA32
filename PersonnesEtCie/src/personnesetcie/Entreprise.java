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
        this.listeEmployes =new Vector<Employe>();
    }
    
    @Override
    public String toString(){
        String resultat="";
        
        if (this.listeEmployes.isEmpty()){
               return this.nom+ " est une auto-entreprise";
        }else{
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
        System.out.println(this.nom+" vient d'embaucher "+e.toString());
    }
    
    public void licencie(String nomEmploye)
    {
        for (int i=0; i<listeEmployes.size();i++)
        {
            if (listeEmployes.get(i).hasName(nomEmploye)){
                listeEmployes.remove(i);
            }          
        }
        
        System.out.println(this.nom+" vient de licencier"+nomEmploye);
        
    }
    
    
}
