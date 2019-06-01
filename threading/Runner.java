package threading;

/**
 * Created by jkers on 6/29/2017.
 */

public class Runner extends Thread {
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello" + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

