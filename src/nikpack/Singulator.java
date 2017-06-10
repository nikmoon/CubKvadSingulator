package nikpack;

/**
 * Created by sa on 10.06.17.
 */
public class Singulator extends Thread {

    private double z;
    private Consumer consumer;

    public Singulator(double z, Consumer consumer) {
        this.z = z;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        consumer.save(z);
    }
}
