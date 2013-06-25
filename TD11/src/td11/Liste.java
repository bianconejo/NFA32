
package td11;

public interface Liste
{
  public void add(Element e);
  public void insert(int index, Element e);
  public void clear();
  public boolean contains(Element e);
  public Element get(int index);
  public void remove(int index);
  public void set(int index, Element e);
  public int size();
}
