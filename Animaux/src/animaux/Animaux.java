/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author roletar
 */
public class Animaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Humain a = new Humain("Homer","d'oh","Donuts");
        
        System.out.println(a.toString());
        
        Cocker c = new Cocker("Buzz", "warf","os");
        System.out.println(c.toString());
        
        Vautour v= new Vautour("Volti", "crrrr","restes");
        System.out.println(v.toString());
    }
}
