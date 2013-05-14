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
        Humain a = new Humain("Homer", "D'oh", "Donuts");
        
        System.out.println(a.toString());
        
        Cocker c = new Cocker("Buzz");
        System.out.println(c.toString());
        
        Animal b =new Berger("Rex");
        System.out.println(b.toString());
        
        Vautour v= new Vautour("Volti");
        System.out.println(v.toString());
        
        Aigle s=new Aigle("Sam");
        System.out.println(s.toString());

        Vautour w= new Vautour("Walt");
        System.out.println(w.toString());
        
        System.out.println();
        Menagerie m=new Menagerie("Krusty Circus");
        
        m.ajouteAnimal(a);
        m.ajouteAnimal(c);
        m.ajouteAnimal(v);
        m.ajouteAnimal(v);
        m.ajouteAnimal(s);
        
        m.retireAnimal(a);
        m.retireAnimal(v);
        
        System.out.println(m.toString());
    }
}
