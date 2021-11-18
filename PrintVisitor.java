public class PrintVisitor implements Visitor {

    @Override
    public void visitAn(An x) {
        // TODO Auto-generated method stub
        System.out.println(x.nume);
       for(Element y : x.grupe)
       {
           y.accept(this);
       }
    }

    @Override
    public void visitGrupa(Grupa x) {
        // TODO Auto-generated method stub
        System.out.println("  Grupa:"+x.nume);
        for(Element y : x.subgrupe)
        {
            y.accept(this);
        }
        
    }

    @Override
    public void visitSemigupa(Semigrupa x) {
        // TODO Auto-generated method stub
        System.out.println("    "+x.nume);
        for(Element y : x.studenti)
        {
            y.accept(this);
        }
       
    }

    @Override
    public void visitStudent(Student x) {
        // TODO Auto-generated method stub
        System.out.println("      "+x.nume+","+x.email);
    }
    
}
