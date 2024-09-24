public class MainEj4 {
    public static void main(String[] args) {
        int i;
        
        for (i = 1; i <=9; i++) {
            Factorial factorial = new Factorial(i);
            System.out.println("El resultado de " + i + "! es : " + factorial.getResultado());
        }
        
    }
}