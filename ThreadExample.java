class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Number: " + i);
            try {
                // Pause for a short time to simulate some work being done
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of the NumberPrinter thread
        NumberPrinter thread = new NumberPrinter();
        
        // Start the thread
        thread.start();
    }
}
