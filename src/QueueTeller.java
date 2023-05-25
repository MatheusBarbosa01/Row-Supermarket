import java.util.LinkedList;

public class QueueTeller {
    LinkedList<People> queueTeller = new LinkedList<>();

    public void enqueue(People people){
        queueTeller.addLast(people);
    }
    public void dequeue(){
        queueTeller.removeFirst();
    }
    public int size(){
        return queueTeller.size();
    }
    public void isEmpty(){
        queueTeller.isEmpty();
    }

    @Override
    public String toString() {
        return "" + queueTeller +
                "";
    }
}