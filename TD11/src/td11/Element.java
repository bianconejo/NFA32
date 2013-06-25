
package td11;

public class Element
{
  private int val;

  public Element(int val)
  {
    this.val = val;
  }

  public boolean lesserThan(Element e)
  {
    return this.val < e.val;
  }

  public boolean greaterThan(Element e)
  {
    return this.val > e.val;
  }

  public boolean equals(Element e)
  {
    return this.val == e.val;
  }

  @Override
  public String toString()
  {
    return String.valueOf(this.val);
  }
}
