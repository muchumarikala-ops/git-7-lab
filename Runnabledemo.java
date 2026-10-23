
class MessageTask implements Runnable {
    private String message;
    private int seconds;

    MessageTask(String message, int seconds) {
        this.message = message;
        this.seconds = seconds;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(seconds * 1000L);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(new MessageTask("Good Morning", 1)).start();
        new Thread(new MessageTask("Hello", 2)).start();
        new Thread(new MessageTask("Welcome", 3)).start();
    }
}
