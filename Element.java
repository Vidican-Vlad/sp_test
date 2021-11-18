public interface Element {
    
    Element add(Element e);
    public void accept(Visitor visitor);

}
