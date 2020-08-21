package guava.wrapper.forward;

import java.util.Collection;
import java.util.Iterator;

public abstract class ForwardingCollection<E> implements Collection<E> {
    protected ForwardingCollection(){

    }

    protected abstract Collection<E> delegate();

    @Override
    public int size() {
        return this.delegate().size();
    }

    @Override
    public boolean isEmpty() {
        return this.delegate().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.delegate().contains(object);
    }

    @Override
    public Iterator<E> iterator() {
        return this.delegate().iterator();
    }

    @Override
    public Object[] toArray() {
        return this.delegate().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.delegate().toArray(a);
    }

    @Override
    public boolean add(E e) {
        return this.delegate().add(e);
    }

    @Override
    public boolean remove(Object object) {
        return this.delegate().remove(object);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.delegate().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return this.delegate().addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.delegate().retainAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.delegate().retainAll(c);
    }

    @Override
    public void clear() {
        this.delegate().clear();
    }
}
