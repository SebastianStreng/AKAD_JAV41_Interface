import java.util.List;
import java.util.Queue;

public class MyQueue implements Interface_Queue{


    @Override
    public void enter(Object elm, Queue queue) {
        queue.add(elm);
    }

    @Override
    public Object leave(Queue queue) {
        return queue.poll(); //returns null if empty
    }

    @Override
    public boolean isEmpty(Queue queue) {
        if (queue.isEmpty()){
            return true;
        } return false;
    }

    @Override
    public int size(Queue queue) {
        return queue.size();
    }

    @Override
    public void clear(Queue queue) {
        queue.clear();
    }
}
