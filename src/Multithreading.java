public class Multithreading implements  Runnable{

    private int threadNumber;

    public Multithreading(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public  void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "  from thread " + threadNumber );
        }
    }
}
