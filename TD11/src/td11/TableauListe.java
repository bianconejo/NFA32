
package td11;

public class TableauListe implements Liste
{
  private Element[] tab = new Element[0];

  public void add(Element e)
  {
    Element[] t = new Element[tab.length+1];

    for(int i = 0; i < tab.length; i++)
      t[i] = tab[i];

    t[tab.length] = e;

    tab = t;
  }

  public void insert(int index, Element e)
  {
    Element[] t = new Element[tab.length+1];

    for(int i = 0; i < index; i++)
      t[i] = tab[i];

    t[index] = e;

    for(int i = index+1; i < t.length; i++)
      t[i] = tab[i-1];

    tab = t;
  }

  public void clear()
  {
    tab = new Element[0];
  }

  public boolean contains(Element e)
  {
    boolean res = false;

    for(int i = 0; i < tab.length; i++)
      if(tab[i] == e)
        res = true;

    return res;
  }

  public Element get(int index)
  {
    return tab[index];
  }

  public void remove(int index)
  {
    Element[] t = new Element[tab.length-1];

    for(int i = 0; i < index; i++)
      t[i] = tab[i];

    for(int i = index; i < t.length; i++)
      t[i] = tab[i+1];

    tab = t;
  }

  public void set(int index, Element e)
  {
    tab[index] = e;
  }

  public int size()
  {
    return tab.length;
  }

  @Override
  public String toString()
  {
    String res = "[";

    for(int i = 0; i < tab.length; i++)
    {
      if(i != 0)
        res += ",";

      res += tab[i];
    }

    res += "]";

    return res;
  }
}
