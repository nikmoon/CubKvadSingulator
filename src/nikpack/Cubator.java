package nikpack;

/**
 * Created by sa on 10.06.17.
 */
public class Cubator extends Thread {

    private double x;
    private Consumer consumer;

    public Cubator(double x, Consumer consumer) {
        this.x = x;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        consumer.save(x*x*x);
    }
}
