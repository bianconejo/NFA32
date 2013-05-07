/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author roletar
 */
public abstract class AnimalRace extends Animal {
    
    private String race;
    
    public AnimalRace(String nom){
        super(nom);
        this.race="bâtard";
    }
    
    public AnimalRace(String nom, String race){
        super(nom);
        this.race=race;
        
    }
    
    public AnimalRace(String nom, String cri,String espece,String nourriture, String race){
        super(nom,cri,espece,nourriture);
        this.race=race;
    }
    
    
    @Override
    public String toString(){
        return this.donneCri()+" Je m'appelle "+this.donneNom()+", je suis : "+ this.donneEspece()+" "+this.race+"\n "
                + "Je mange principalement des :"+this.donneNourriture();
    }
}
