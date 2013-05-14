/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listechainee;

/**
 *
 * @author roletar
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        ListeChainee lc=new ListeChainee();
        lc.add("test");
        lc.add(2);
        lc.add(3);
        lc.add("test");
        
        System.out.println(lc);
        
        System.out.println("taille de la chaine : "+lc.size());
        System.out.println("Indice de \"test\" : "+lc.indexOf("test"));
        System.out.println("Indice de \"2\" : "+lc.indexOf(2));
    }
}
