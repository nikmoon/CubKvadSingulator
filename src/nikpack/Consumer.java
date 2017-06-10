package nikpack;

/**
 * Created by sa on 10.06.17.
 */
public class Consumer {

    private double cube;
    private double square;
    private double single;

    Object cubatorLock = new Object();
    Object kvadratorLock = new Object();
    Object singulatorLock = new Object();

    void save(double value) {
        Thread currentThread = Thread.currentThread();

        synchronized (currentThread.getClass()) {
            if (currentThread instanceof Cubator) {
                System.out.println("Кубатор начал выполнение");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Кубатор закончил выполнение");
            }

        }

//        if (currentThread instanceof Cubator) {
//            synchronized (cubatorLock) {
//                System.out.println("Кубатор начал выполнение");
//                cube = value;
//                try {
//                    Thread.sleep(1000);     // для удобной отладки
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("Кубатор закончил выполнение");
//            return;
//        }
//
//        if (currentThread instanceof Kvadrator) {
//            synchronized (kvadratorLock) {
//                System.out.println("Квадратор начал выполнение");
//                square = value;
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("Квадратор закончил выполнение");
//            return;
//        }
//
//        if (currentThread instanceof Singulator) {
//            synchronized (singulatorLock) {
//                System.out.println("Сингулятор начал выполнение");
//                single = value;
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("Сингулятор закончил выполнение");
//        }
    }

    public void setCube(double cube) {
        this.cube = cube;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setSingle(double single) {
        this.single = single;
    }
}
