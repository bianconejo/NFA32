/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author roletar
 */
public abstract class Animal {
    private String nom;
    private String cri;
    private String nourriture;
    private String espece;
    
    public Animal(String name){
        this.nom=name;
    }
    
    public Animal(String name, String cri,String espece,String nourriture){
        this.nom=name;
        this.cri=cri;
        this.espece=espece;
        this.nourriture=nourriture;
    }
    
    public String donneCri(){
        return this.cri;
    }
    
    public String donneEspece(){
        return this.espece;
    }
    
    public String donneNourriture(){
        return this.nourriture;
    }
    
    public String donneNom(){
        return this.nom;
    }
    
    @Override
    public String toString(){
        return this.cri+" Je m'appelle "+this.nom+", je suis : "+ this.espece+"\n "
                + "Je mange principalement :"+this.nourriture;
    }
    
}
