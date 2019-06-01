package threading;

public class Main {

    public static void main(String[] args) {
	Runner runner1 = new Runner();
	runner1.start();

	Runner runner2 = new Runner();
	runner2.start();

	Runner runner3 = new Runner();
	runner3.start();
    }
}
