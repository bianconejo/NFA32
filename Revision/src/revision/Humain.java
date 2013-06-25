/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Vector;

/**
 *
 * @author roletar
 */
public abstract class Humain {
    private String nom;
    private String prenom;
    private String datedenaissance;
    private int numerosecu;
    private char sexe;
    
    private Homme pere;
    private Femme mere;
    
    private Vector<Humain> listeEnfants;
    private Vector<Humain> listeFratrie;
    
    Humain(){
    }
    
    public void setNom( String nom){
        this.nom=nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setPrenom( String prenom){
        this.prenom=prenom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setDDN (String ddn){
        this.datedenaissance=ddn;
    }
    
    public String getDDN(){
        return this.datedenaissance;
    }
    
    public void setNumerosecu (int numsecu){
        this.numerosecu=numsecu;
    }
    
    public int getNumerosecu(){
        return this.numerosecu;
    }
    
    public void setSexe(char sexe){
        this.sexe=sexe;
    }
    
    public char getSexe(){
        return this.sexe;
    }
    
    public void setPere(Homme pere){
        this.pere=pere;
    }
    
    public void setMere(Femme mere){
        this.mere=mere;
    }
     
    public Homme getPere(){
        return this.pere;
    }
    
    public Femme getMere(){
        return this.mere;
    }
    
    public void addEnfant (Humain enf){
        this.listeEnfants.add(enf);
    }
    
    public void removeEnfant (Humain enf){
        this.listeEnfants.remove(enf);
    }
    
    public Humain getEnfant (int i){
        return this.listeEnfants.get(i);
    }
    
    public Humain getFratos (int i){
        return this.listeFratrie.get(i);
    }
    
    
}
