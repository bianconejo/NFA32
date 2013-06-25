
package td11;

/**
 *
 * @author François TAVIN
 */
public class ListeChainee
{
  /**
   * L'élément du chainon courant, null si c'est la fin de la chaine
   */
  private Object element;
  
  /**
   * Le chainon suivant, null si c'est la fin de la chaine
   */
  private ListeChainee suite;

  /**
   * Constructeur public, ne fait rien mais nécessaire à cause du constructeur privé
   */
  public ListeChainee()
  {
    
  }
  
  /**
   * Constructeur privé qui permet de créer un nouveau chainon par duplication
   * @param aCopier le chainon à dupliquer
   */
  private ListeChainee(ListeChainee aCopier)
  {
    this.element = aCopier.element;
    this.suite = aCopier.suite;
  }

  /**
   * Méthode d'ajout d'un élément en fin de liste
   * @param element l'élément à ajouter
   * @return true si l'élément a été ajouté, false sinon (si il était null)
   */
  public boolean add(Object element)
  {
    boolean res = element != null;
    
    if (element != null) // si l'élément à ajouter n'est pas null
    {
      if (this.element == null) // si nous sommes en fin de chaine
      {
        insert(element); // on insère l'élément en position courante
      }
      else // sinon
      {
        this.suite.add(element); // on appelle cette méthode sur le chainon suivant
      }
    }
    
    return res;
  }

  /**
   * Méthode d'ajout d'un élément à l'indice donné
   * @param index l'indice où ajouter l'élément
   * @param element l'élément à ajouter
   */
  public void add(int index, Object element)
  {
    if(element != null) // si l'élément à ajouter n'est pas null
    {
      if(index == 0) // si c'est sur ce chainon qu'on doit l'ajouter
      {
        insert(element); // on insère l'élément en position courante
      }
      else if(this.suite != null) // sinon si on n'est pas en fin de chaine
        this.suite.add(index-1, element); // on appelle cette méthode sur le chainon suivant en diminuant l'indice de 1
    }
  }
  
  /**
   * Méthode privée utilisée pour l'insertion d'un élément en position courante
   * @param element l'élément à insérer
   */
  private void insert(Object element)
  {
    ListeChainee nouveauMaillon = new ListeChainee(this); // création d'un maillon par duplication
    this.suite = nouveauMaillon; // le nouveau maillon est placé après l'actuel
    this.element = element; // l'élément est assigné au maillon courant
  }

  /**
   * Méthode qui vide la liste
   */
  public void clear()
  {
    // il suffit de mettre les références du chainon à null
    this.element = null;
    this.suite = null;
  }

  /**
   * Méthode qui indique si la chaine contient l'élément donné
   * @param element l'élément à chercher
   * @return true si l'élément est contenu dans la liste
   */
  public boolean contains(Object element)
  {
    boolean res;

    if (this.element == null) // si on est en fin de chaine
      res = false;
    else if (this.element == element) // sinon si l'élément recherché est l'actuel
      res = true;
    else  // sinon on apelle cette méthode sur le chainon suivant
      res = this.suite.contains(element);

    return res;
  }

  // variante plus simple
  /*
  public boolean contains2(Object element)
  {
    return indexOf(element) != -1;
  }*/

  /**
   * Méthode retournant l'élément à l'indice donné
   * @param index l'indice de l'élément à retourner
   * @return l'élément à l'indice donné
   */
  public Object get(int index)
  {
    Object res;

    if (this.element == null) // si on est en fin de chaine
      res = null;
    else if (index == 0) // sinon si c'est le chainon actuel qui est recherché
      res = this.element;
    else  // sinon on appelle cette méthode sur le chainon suivant en diminuant l'indice de 1
      res = this.suite.get(index - 1);

    return res;
  }

  /**
   * Méthode qui retourne l'indice d'un élément
   * @param element l'élément recherché
   * @return l'indice de la première occurence l'élément ou -1 si élément absent
   */
  public int indexOf(Object element)
  {
    int res;

    if (this.element == null) // si on est en fin de liste
      res = -1;
    else if (this.element == element) // sinon si c'est l'élément actuel qui est recherché
      res = 0;
    else // sinon
    {
      int r = this.suite.indexOf(element); // on appelle cette méthode sur le chainon suivant

      if (r == -1) // si le résultat est -1 on le conserve
        res = -1;
      else // sinon on l'augmente de 1
        res = r + 1;
    }

    return res;
  }

  /**
   * Méthode indiquant si la chaine est vide
   * @return true si la chaine est vide, false sinon
   */
  public boolean isEmpty()
  {
    // il suffit de regarder si on est en fin de chaine
    return this.element == null;
  }

  /**
   * Méthode qui retire la première occurence de l'élément passé en paramètre dans la liste
   * @param element l'élément à retirer
   * @return true si l'élément a été retiré (si il était présent)
   */
  public boolean remove(Object element)
  {
    boolean res = true;
    
    if(this.element != null) // si on n'est pas en fin de liste
    {
      if(this.element == element) // si l'élément à retirer est l'élément courant
        suppress();          // on le retire
      else // sinon
        res = this.suite.remove(element); // on appelle la méthode sur le chainon suivant
    }
    else // sinon
      res = false;
    
    return res;
  }
  
  /**
   * Méthode qui retire l'élément à la position donnée
   * @param index l'indice de l'élément à retirer
   * @return l'élément  retiré
   */
  public Object remove(int index)
  {
    Object res;
    
    if(this.element != null) // si on n'est pas en fin de liste
    {
      if(index == 0) // si l'élément à retirer est l'élément courant
        res = suppress(); // on le retire
      else // sinon
        res = this.suite.remove(index-1); // on appelle la méthode sur le chainon suivant en diminuant l'indice de 1
    }
    else // sinon
      res = null;
    
    return res;
  }
  
  /**
   * Méthode privée qui décale les éléments de la liste vers la gauche à partir du chainon courant
   * @return l'élément du premier chainon qui n'a plus sa place dans la sous-liste
   */
  private Object suppress()
  {
    Object res = this.element;
    
    if(res != null) // si on n'est pas en fin de liste
    {
      this.element = this.suite.element;
      this.suite = this.suite.suite;
    }
    
    return res;
  }

  /**
   * Méthode qui remplace l'élément à une position donnée par l'élément donné en paramètre
   * @param index l'indice de l'élément à remplacer
   * @param element l'élément de remplacement
   */
  public Object set(int index, Object element)
  {
    Object res;
    
    if(this.element == null) // si on est en fin de liste
      res = null;
    else if(index == 0) // sinon si l'élément à remplacer est l'actuel
    {
      res = this.element;
      this.element = element; // on remplace l'élément actuel
    }
    else
      res = this.suite.set(index-1, element); // on appelle la méthode sur le chainon suivant
    
    return res;
  }

  /**
   * Méthode qui retourne le nombre d'éléments dans la liste
   * @return le nombre d'éléments dans la liste
   */
  public int size()
  {
    int res;
    
    if(this.element == null) // si on est en fin de liste
      res = 0; // la taille est nulle
    else // sinon
      res = this.suite.size()+1; // la taille est égale à la taille de la sous-liste qui suit + 1
    
    return res;
  }



  /**
   * Méthode qui retourne une chaine contenant une description des éléments de la liste
   * @return la chaine décrivant les éléments de la liste
   */
  @Override
  public String toString()
  {
    String res = "[";

    if(this.element == null) // si on est en fin de liste
      res += "]"; // la liste est vide
    else // sinon
      res += this.element + this.suite.toStringSpec(); // on ajoute l'élément et on utilise toStringSpec pour la suite

    return res;
  }


  /**
   * Méthode qui retourne une chaine contenant une description des éléments de la liste
   * La distinction entre toString et toStringSpec est la gestion du premier élément de liste
   * @return la chaine décrivant les éléments de la liste
   */
  private String toStringSpec()
  {
    String res = "";

    if(this.element == null) // si on est en fin de liste
      res += "]"; // la liste est vide
    else // sinon
      res += "," + this.element + this.suite.toStringSpec(); // on ajoute l'élément et la suite

    return res;
  }
}
