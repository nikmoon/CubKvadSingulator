package nikpack;

import java.util.DoubleSummaryStatistics;

public class Main {

    public static void main(String[] args) {

        double[] xs = {1,2,3,4,5};
        double[] ys = {6,7,8,9,10};
        double[] zs = {11,12,13,14,15};

        Consumer consumer = new Consumer();

        for(Double x: xs) {
            new Cubator(x, consumer).start();
        }

        for(Double y: ys) {
            new Kvadrator(y, consumer).start();
        }

        for(Double z: zs) {
            new Singulator(z, consumer).start();
        }

    }
}
