public interface Element {
    
    void add(Element e);
    public void accept(Visitor visitor);

}
