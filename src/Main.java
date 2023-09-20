import java.util.concurrent.locks.ReentrantLock;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static volatile int a = 0;
    public void add() {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        //volitate
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Main main = new Main();
                main.add();
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(a+"asuydfgasf");

    }
}