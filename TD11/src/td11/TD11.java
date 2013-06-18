/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package td11;

/**
 *
 * @author roletar
 */
public class TD11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long i1,i2,i3;
        TableauListe t1 =new TableauListe();
        TableauListe t2 =new TableauListe();
        TableauListe t3 =new TableauListe();
        
        Generateur g=new Generateur();
        Trieur t= new Trieur();
        
        g.randomize(t1);
        t3=t2=t1;
        
        System.out.println("Liste de départ");
        System.out.println(t1.toString());
        System.out.println("taille :"+t1.size());
        
        start = System.currentTimeMillis();
        t.TriABulles(t1);
        end = System.currentTimeMillis();
        i1=end-start;
        
        start = System.currentTimeMillis();
        t.TriSelection(t2);
        end = System.currentTimeMillis();
        i2=end-start;
         
        start = System.currentTimeMillis();
        t.TriRapide(t3);
        end = System.currentTimeMillis();
        i3=end-start;
        
        System.out.println("Liste triée avec triBulle tmps exec: "+i1+"ms");
        System.out.println(t1.toString());
        
        System.out.println("Liste triée avec triSelection tmps exec: "+i2+"ms");
        System.out.println(t2.toString());
        
        System.out.println("Liste triée avec quickSort tmps exec: "+i3+"ms");
        System.out.println(t3.toString());
        
        //t.echange(tl, 0, tl.size()-1);
      //   System.out.println(t1.toString());
      //  System.out.println("taille :"+t1.size());
        
      
        // System.out.println("choix pivot:(23,100)"+t.choixPivot(23, 100));
    
        
    }
}
