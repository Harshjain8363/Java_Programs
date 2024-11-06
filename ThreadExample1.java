class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
                // Pause for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        // Create an instance of the NumberPrinter thread
        NumberPrinter thread = new NumberPrinter();
        
        // Start the thread
        thread.start();
    }
}
