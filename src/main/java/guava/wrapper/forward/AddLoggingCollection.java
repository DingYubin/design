package guava.wrapper.forward;

import java.util.Collection;

/**
 * @author dingyubin
 * 如果我们不使用这个 ForwardinCollection 类，
 * 而是让 AddLoggingCollection代理类直接实现 Collection 接口，
 * 那 Collection 接口中的所有方法，都要在 AddLoggingCollection 类中实现一遍，
 * 而真正需要添加日志功能的只有 add() 和 addAll() 两个函数，其他函数的实现，
 * 都只是类似 Wrapper 类中 f2() 函数的实现那样，简单地委托给原始 collection 类对象的对应函数。
 */
public class AddLoggingCollection<E> extends ForwardingCollection<E>{
    private Collection<E> originalCollection;

    public AddLoggingCollection(Collection<E> originalCollection){
        this.originalCollection = originalCollection;
    }

    @Override
    protected Collection delegate() {
        return this.originalCollection;
    }

    @Override
    public boolean add(E element) {
        System.out.println("Add element: "+element);
        return this.delegate().add(element);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        System.out.println("Size of element to add: "+ collection.size());
        return this.delegate().addAll(collection);
    }
}
