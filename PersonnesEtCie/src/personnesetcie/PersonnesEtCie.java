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
        
//        Employe e=new Employe("Jessie", "Pinkman");
//        patron.embauche(new Employe("Jessie", "Pinkman"));
//        patron.embauche(new Employe("Walter", "White"));
//        patron.embauche(new Employe("Dr", "Heisenberg"));
        System.out.println(patron.toString());
    }
}
