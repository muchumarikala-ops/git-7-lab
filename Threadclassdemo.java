
class GoodMorning extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Hello extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class Welcome extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        new GoodMorning().start();
        new Hello().start();
        new Welcome().start();
    }
}
