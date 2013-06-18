/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package td11;

/**
 *
 * @author roletar
 */
public class Trieur {
    
    public void TriABulles(Liste l){
        
        boolean echange_effectue=false;
        
        do{
                echange_effectue=false;
                
                for (int i=0;i<l.size()-1;i++){
                    
                    if (l.get(i).greaterThan(l.get(i+1))){
                        l.insert(i+2,l.get(i));
                        l.remove(i);
                        echange_effectue=true;
                    }
                }
            
            
        }while(echange_effectue);
        
    }
    
    public void TriSelection(Liste l){
        
        for (int i=0; i<l.size()-1;i++){
            int min =i;
            
            for (int j=i+1; j<l.size();j++){
                
                if (l.get(j).lesserThan(l.get(min))){
                    min=j;
                }
            }
            
            if (min !=i){
                 // on insere le plus grand apres la pos de depart du plus petit
                 l.insert(min+1,l.get(i));
                 
                 // on insere le plus petit apres la pos de depart du plus grand
                 l.insert(i+1,l.get(min));
               
                 // on supprime l'ancien plus petit
                 l.remove(i);
                 
                 // on supprime l'ancien plus grand
                 l.remove(min);
            }
            
            
        }
        
    }
    
    public void TriRapide(Liste l){
        this.TriRapide(l, 0, l.size()-1);
    }
    
    public void TriRapide(Liste l,int prem, int dern){
        int pivot=0;
        if (prem<dern){
            pivot=this.choixPivot(prem, dern);
         //   System.out.println("pivot 1: "+pivot);
            pivot=this.partitionner(l, prem, dern, pivot);
          //  System.out.println("pivot 2: "+pivot);
            this.TriRapide(l, prem, pivot-1);
            this.TriRapide(l, pivot+1, dern);
        }
    }
 
 
    private int partitionner(Liste l, int prem, int dern, int pivot){
        // on echange le pivot et le dernier
       // System.out.println("partitionnement: ");
        this.echange(l,pivot,dern);
       // System.out.println("sous liste pivot place en dernier: "+l.toString());
        int j=prem;
       // System.out.println("j: "+j);
        for(int i=prem;i<dern; i++){
            if (l.get(i).lesserThan(l.get(dern))){
                this.echange(l, i, j);
                j++;
            }
        }
        this.echange(l,dern,j);
   
        return j;
    }
    
    private int choixPivot(int prem, int dern){
        return (prem+(int)((dern-prem)*Math.random()));
    }
    
    public void echange(Liste l, int idx1, int idx2){
        // on ordonne les index
        if (idx1>idx2){
            int tmp=idx1;
            idx1=idx2;
            idx2=tmp;
        }
        // on insere le plus grand apres la pos de depart du plus petit
                 l.insert(idx2+1,l.get(idx1));
                 
                 // on insere le plus petit apres la pos de depart du plus grand
                 l.insert(idx1+1,l.get(idx2));
               
                 // on supprime l'ancien plus petit
                 l.remove(idx1);
                 
                 // on supprime l'ancien plus grand
                 l.remove(idx2);
        
    }
            
}
