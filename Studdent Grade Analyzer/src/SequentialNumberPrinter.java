class NumberPrinter implements Runnable {
    private String threadName;
    private int numThreads;
    private int start;
    private int end;
    private int step;
    private static int currentThread = 1;

    public NumberPrinter(String threadName, int numThreads, int start, int end, int step) {
        this.threadName = threadName;
        this.numThreads = numThreads;
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public void run() {
        while (start <= end) {
            synchronized (NumberPrinter.class) {
                if (currentThread == Integer.parseInt(threadName.substring(threadName.length() - 1))) {
                    System.out.println(threadName + ": " + start);
                    start += step;
                    currentThread = (currentThread % numThreads) + 1;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SequentialNumberPrinter {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter("Thread 1", 3, -5, -1, 1));
        Thread thread2 = new Thread(new NumberPrinter("Thread 2", 3, 1, 9, 2));
        Thread thread3 = new Thread(new NumberPrinter("Thread 3", 3, 2, 10, 2));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}