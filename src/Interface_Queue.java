import java.util.List;
import java.util.Queue;

public interface Interface_Queue <E> {


    public void enter( E elm);

    public E leave ();

    public boolean isEmpty();

    public int size();

    public void clear();
}
