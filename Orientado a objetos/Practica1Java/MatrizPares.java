public class MatrizPares {
    private int[][] matriz; int f,c;
    
    public MatrizPares() {
        f = 10;
        c = 10;
        matriz = new int[f][c];
    }
    
    public void setMatrizPares() {
        int numPar = 0;
        for (int i = 0; i<=f-1; i++) {
            for(int j = 0; j<=c-1; j++) {
                matriz[i][j] = numPar;
                numPar += 2;
            }
        }
    }
    
    public void ImprimirMatriz() {
        for (int i = 0; i<=f-1; i++) {
            for(int j = 0; j<=c-1; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public void SumaAcotada() {
        int suma = 0;
        for (int i = 2; i<f; i++) {
            for(int j = 0; j<c-6; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos es: " + suma );
    }
}