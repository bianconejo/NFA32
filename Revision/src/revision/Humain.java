/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Date;
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
    
    protected Homme pere;
    protected Femme mere;
    
    private Vector<Humain> listeEnfants;
    protected Vector<Humain> listeFratrie;
    
    public Humain(){

        this.nom="-";
        this.prenom="-";
        this.datedenaissance="";
        this.numerosecu=0;
        this.sexe='T';
        
        this.pere=null;
        this.mere=null;
        this.listeEnfants=new Vector<Humain>();
        this.listeFratrie=new Vector<Humain>();
    }
    
    public Humain(String prenom, String nom, String ddn, int numsecu, char sexe){
        this.nom=nom;
        this.prenom=prenom;
        this.datedenaissance=ddn;
        this.numerosecu=numsecu;
        this.sexe=sexe;
        
        this.pere=new Homme();
        this.mere=new Femme();
        this.listeEnfants=new Vector<Humain>();
        this.listeFratrie=new Vector<Humain>();
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
    
    public void addFratos (Humain frat){
        this.listeFratrie.add(frat);
    }
    
    public void removeFratos (Humain frat){
        this.listeFratrie.remove(frat);
    }
    
    
    public Humain getEnfant (int i){
        return this.listeEnfants.get(i);
    }
    
    public Humain getFratos (int i){
        return this.listeFratrie.get(i);
    }
    
    public Vector<Humain> getOncles(){
        Vector<Humain> listeOncles= new Vector<Humain>();
        
        for (int i=0; i<this.pere.listeFratrie.size();i++){
            if (pere.listeFratrie.get(i).getSexe()=='H')
              listeOncles.add(pere.listeFratrie.get(i));
        }
        
        for (int i=0; i<this.mere.listeFratrie.size();i++){
            if (mere.listeFratrie.get(i).getSexe()=='H')
              listeOncles.add(mere.listeFratrie.get(i));
        }
        
        
        return listeOncles;
    }
    
    
    @Override
    public String toString(){
        return this.sexe +":" +this.prenom+" "+this.nom;
    }
    
    
    public String toRope(){  
        return this.sexe +":" +this.prenom+" "+this.nom+" \tNS: "+this.numerosecu+ 
        "\tné(e) le : "+this.datedenaissance +"\tPère :"+this.pere.getPrenom()+" "+ 
         this.pere.getNom()+"\tMère : "+this.mere.getPrenom()+" "+ this.mere.getNom();
    }
    
}
