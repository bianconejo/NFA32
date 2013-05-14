/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listechainee;

/**
 *
 * @author roletar
 */
public class ListeChainee {

   private Object element;
   private ListeChainee suivant;
   
   public ListeChainee(){
       this.element=null;
       this.suivant=null;
   }
   
   public ListeChainee(Object element){
       this.element=element;
       this.suivant=null;
   }
   
   public boolean add(Object element){
       if (this.isEmpty()){
            this.element=element;
        }else{
            this.suivant=new ListeChainee(element);
        }
       return true;
   }
   
   public void add(int index, Object element)
   {
       
   }
   
   public void clear(){
       
       
   }
   
   
   public boolean contains (Object element){
       
       return true;
   }
   
   public Object get(int index){
       Object o=new Object();
       
       return o;
   }
   
   public int indexOf(Object element){
        if (this.isEmpty())
           return -1;
       else
           if (this.suivant==null){
               if (this.element==element){
                   return 0;
               }
                
           }else{
                return 1+this.suivant.indexOf(element);
           }
        
       return 0;
   }
   
   public boolean isEmpty(){
       if (this.element==null)
           return true;
       else
           return false;
   }
   
   public boolean remove(Object element){
       return true;
   }
   
   public Object remove(int index){
       Object o=new Object();
       
       return o;
   }
   
   public Object set (int index, Object element){
       Object o=new Object();
       
       return o;
       
   }
   
   public int size(){
       if (this.isEmpty())
           return 0;
       else
           if (this.suivant==null){
                return 1;
           }else{
                return 1+this.suivant.size();
           }
           
   }
   
   @Override
   public String toString(){
       if (this.isEmpty()){
           //cas 1 : le maillon est vide
           System.out.println("la chaine est vide");
            return "()╖";
       }else{
           
           if (this.suivant==null){
               // cas 2 : le maillon n'est pas vide mais il est orphelin
               System.out.println("la chaine n'est pas vide mais c'est le dernier maillon.");
                return "("+this.element.toString()+")╖";
           }else{
               
               if(this.suivant.suivant==null){
                   //cas 3 : il existe un maillon suivant mais c'est le seul
               System.out.println("la chaine n'est pas vide et il reste des maillons.");
                return "("+this.element.toString()+")->("+this.suivant.toString()+")╖";
               }else{
                   //cas 4 : il existe un maillon suivant et plus
                   
                   
               }
           }
       }
   }
}
