public class Teller {
    private QueueTeller queueTeller1 = new QueueTeller();
    private QueueTeller queueTeller2 = new QueueTeller();
    private QueueTeller queueTeller3 = new QueueTeller();


    private int contador = 1;

    public void pushPeople(People people){

        if(people.getCategory() == People.Category.ELDERY){
            queueTeller1.enqueue(people);
        } else if (people.getCategory() == People.Category.DEFICIENT) {
            queueTeller2.enqueue(people);
        } else if (people.getCategory() == People.Category.COMMON) {
            if(contador == 2 || contador%2 == 0){
                queueTeller2.enqueue(people);
            }
            else{
                queueTeller3.enqueue(people);
            }
        }
        contador++;
    }
    public void removePeople(){
        while(queueTeller1.size() != 0){
            queueTeller1.dequeue();
        }
        while(queueTeller2.size() != 0){
            queueTeller2.dequeue();
        }
        while(queueTeller3.size() != 0){
            queueTeller3.dequeue();
        }
     }

    public QueueTeller getTeller1() {
        return queueTeller1;
    }

    public QueueTeller getTeller2() {
        return queueTeller2;
    }

    public QueueTeller getTeller3() {
        return queueTeller3;
    }

    @Override
    public String toString() {
        return "" +
                "teller1=" + getTeller1() +
                ", teller2=" + getTeller2() +
                ", teller3=" + getTeller3() +
                "";
    }
}
