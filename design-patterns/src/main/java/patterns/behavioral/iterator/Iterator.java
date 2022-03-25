package patterns.behavioral.iterator;

public interface Iterator {
    public Object next();
    public boolean hasNext();
    public boolean remove();
}
