public class Factorial {
    private int n;
    
    public Factorial(int n) {
        this.n = n;
    }
    
    public int getResultado() {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
