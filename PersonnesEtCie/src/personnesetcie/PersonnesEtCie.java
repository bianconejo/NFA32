/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnesetcie;

/**
 *
 * @author roletar
 */
public class PersonnesEtCie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employeur patron=new Employeur("Gus","Frings");
        System.out.println(patron.toString());
  
        patron.embauche(new Employe( "Pinkman","Jessie"));
        patron.embauche(new Employe("White","Walter"));
        patron.embauche(new Employe("Heisenberg","Dr"));        
        
        patron.licencie("Heisenberg");
        System.out.println(patron.toString());
    }
}
