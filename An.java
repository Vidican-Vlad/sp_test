import java.util.ArrayList;
import java.util.List;

public class An implements Element
{
    List<Element> grupe = new ArrayList<Element>();
    String nume;
    public An(String x)
    {
        nume=x;
    }
    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub
        grupe.add(e);
        
    }
    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitAn(this);
    }
    
}
