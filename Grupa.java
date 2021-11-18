import java.util.*;

public class  Grupa implements Element
{
    List<Element> subgrupe = new ArrayList<Element>();
    String nume;
    public Grupa(String nume)
    {
        this.nume=nume;
    }
    
    @Override
    public Element add(Element e) {
        // TODO Auto-generated method stub
        subgrupe.add(e);
        return e;
        
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitGrupa(this);
        
    }

}