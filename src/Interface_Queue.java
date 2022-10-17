import java.util.List;
import java.util.Queue;

public interface Interface_Queue <E> {

    public void enter( E elm, Queue<Object> queue);

    public E leave (Queue<Object> queue);

    public boolean isEmpty(Queue<Object> queue);

    public int size(Queue<Object> queue);

    public void clear(Queue<Object> queue);
}
