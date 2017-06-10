package nikpack;

/**
 * Created by sa on 10.06.17.
 */
public class Kvadrator extends Thread {

    private double y;
    private Consumer consumer;

    public Kvadrator(double y, Consumer consumer) {
        this.y = y;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        consumer.save(y*y);
    }
}
