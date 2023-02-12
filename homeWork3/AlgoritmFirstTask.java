package lessons.lesson12;

public class AlgoritmFirstTask {
    public AlgoritmFirstTask(int n, int b) {
        this.n = n;
        this.b = b;
    }
    private  int n;
    private int b;

    public void first() {
        int number = 0;
        if (n > b) {
            for (int i = b; i <= n; i *= b) {
                number = i;
            }
        }
        if (number == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
