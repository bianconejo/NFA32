
package td11;

public class ChaineListe implements Liste
{
  private ListeChainee l = new ListeChainee();

  public void add(Element e)
  {
    l.add(e);
  }

  public void insert(int index, Element e)
  {
    l.add(index, e);
  }

  public void clear()
  {
    l.clear();
  }

  public boolean contains(Element e)
  {
    return l.contains(e);
  }

  public Element get(int index)
  {
    return (Element)l.get(index);
  }

  public void remove(int index)
  {
    l.remove(index);
  }

  public void set(int index, Element e)
  {
    l.set(index, e);
  }

  public int size()
  {
    return l.size();
  }

  @Override
  public String toString()
  {
    return l.toString();
  }
}
