package animaux;


import animaux.Animal;
import animaux.Animaux;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roletar
 */
public class Menagerie {
    private String nom;
    private Vector<Animal> listeAnimaux;
    
    public Menagerie(String nom){
        this.nom=nom;
        this.listeAnimaux=new Vector<Animal>();
    }
    public void ajouteAnimal(Animal a){
        this.listeAnimaux.add(a);
    }
    
    public void retireAnimal(Animal a){
        this.listeAnimaux.remove(a);
    }
    
    @Override
    public String toString(){
        
        String resultat="";
        
        if (this.listeAnimaux.isEmpty()){
               return this.nom+ " est une ménagerie vide.";
        }else{
            resultat+="Bienvenue dans la ménagerie : "+this.nom;
            resultat+="\n"+"Voici la liste de ses membres :";
             for (int i=0; i<listeAnimaux.size();i++)
                {
                    resultat+="\n"+listeAnimaux.get(i).donneNom();
                }
        }

        return resultat;
      
    }
}
