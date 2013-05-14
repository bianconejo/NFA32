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
        
        
        String chaine1="test";
        String chaine2="test";
        int prems=2;
        int deuz=3;
        
        lc.add(chaine1);
//        lc.add(prems);
//        lc.add(deuz);
//        lc.add(chaine2);
        
        System.out.println(lc);
        
        System.out.println("taille de la chaine : "+lc.size());
        System.out.println("Indice de \"test\" : "+lc.indexOf(chaine1));
        System.out.println("Indice de \"2\" : "+lc.indexOf(prems));
    }
}
