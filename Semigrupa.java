import java.util.*;

public class Semigrupa implements Element{
    List<Element> studenti = new ArrayList<Element>();
    String nume;
    public Semigrupa(String nume)
    {
        this.nume=nume;
    }
    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub
        studenti.add(e);
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitSemigupa(this);
    }
    
    
}
