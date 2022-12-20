import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import static java.lang.System.in;

public class MyQueue <E> implements Interface_Queue{

    Queue<E> queue = new ConcurrentLinkedQueue<>();

    public void printQueue(){
        for (Object o: queue) {
            System.out.println(o);
        }
    }
    @Override
    public void enter(Object elm) {
        queue.add((E)elm);
    }
    @Override
    public Object leave() {
        return queue.remove();
    }
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size() ;
    }

    @Override
    public void clear() {
        queue.clear();
    }
}
