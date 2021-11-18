public class Student implements Element
{
    String nume;
    String email;

    public Student(String nume, String email)
    {
        this.nume=nume;
        this.email=email;
    }
    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Invalid operation for student class");
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitStudent(this);
    }
    
}
