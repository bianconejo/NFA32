/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author roletar
 */
public class Revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registre reg= new Registre();
        Homme h1= new Homme("Tywin","Lannister","",-1,true);
        Homme h2= new Homme("Tyrion","Lannister","",-1,true);
        Homme h3= new Homme("Jaime","Lannister","",-1,true);
        Homme h4= new Homme("Geoffrey","Baratheon","",-1,true);
        Homme h5= new Homme("Robert","Baratheon","",-1,true);
        Homme h6= new Homme("Stannis","Baratheon","",-1,true);
        Homme h7= new Homme("Lord","Varys","",-1,false);
        
        Femme f1= new Femme("Cersei","Lannister","",-1,true);
          
        System.out.println(h1.toRope());
        System.out.println(h2.toRope());
        System.out.println(h3.toRope());
        System.out.println(h4.toRope());
        System.out.println(h5.toRope());
        System.out.println(h6.toRope());
        System.out.println(h7.toRope());
        System.out.println(f1.toRope());
        
        h4.setPere(h5);
        h4.setMere(f1);
        
        h2.setPere(h1);
        h3.setPere(h1);
        f1.setPere(h1);
        
        f1.addFratos(h2);
        f1.addFratos(h3);
        
        h5.addFratos(h6);
      
        System.out.println();
        System.out.println(h4.toString()+" a "+h4.getOncles().size()+" oncle(s) :");
        System.out.println(h4.getOncles().toString());
        
        
        reg.addHumain(h1);
        reg.addHumain(h2);
        reg.addHumain(h3);
        reg.addHumain(h4);
        reg.addHumain(h5);
        reg.addHumain(h6);
        reg.addHumain(h7);
        reg.addHumain(f1);
        
        System.out.println();
        System.out.println("personnes présentes dans le registre : ");
        System.out.println(reg.toString());
     
        System.out.println();
        System.out.println(h1.toRope());
        System.out.println(h2.toRope());
        System.out.println(h3.toRope());
        System.out.println(h4.toRope());
        System.out.println(h5.toRope());
        System.out.println(h6.toRope());
        System.out.println(h7.toRope());
        System.out.println(f1.toRope());
        
        
        

    }
}
