package patterns.behavioral.iterator;

import java.util.Vector;

public class ConcreteIterator implements Iterator{
    private Vector vector = new Vector();
    //定义当前游标
    public int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()){
            result = this.vector.get(cursor++);
        }else {
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return this.cursor != this.vector.size();
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
