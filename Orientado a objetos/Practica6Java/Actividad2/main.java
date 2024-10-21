import java.util.Scanner;
public class main {
    public static void main () {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de variables: ");
        int b = in.nextInt();
        in.nextLine();
        String[] t = new String[b];
        String[] n = new String[b];
        System.out.println("Ingrese los tipos seguidos del nombre de las variables");
        
        String s;
        String[] separado = new String[2];
        for(int i = 0; i < b; i++) {
            s = in.nextLine();
            separado = s.split(" ");
            t[i] = separado[0];
            n[i] = separado[1];
        }
        
        
        System.out.println("\n /**Variables.*/");
        for(int i = 0; i < b; i++) {
            s = escribirVariable(t[i], n[i]);
            System.out.println(s);
        }
        
        System.out.println("\n /**Getters.*/");
        for(int i = 0; i < b; i++) {
            s = escribirGetter(t[i], n[i]);
            System.out.println(s);
        }
        
        System.out.println("\n /**Setters.*/");
        for(int i = 0; i < b; i++) {
            s = escribirSetter(t[i], n[i]);
            System.out.println(s);
        }
    }
    
    public static String escribirVariable(String T, String N){
        return ("private " + T + " " + N );
    }
    
    public static String escribirGetter(String T, String N){
        return ("public "+ T +" get" + N + "(){return " + N + ";}");
    }
    
    public static String escribirSetter(String T, String N){
        return ("public void set" + N + "("+ T +" "+ N +"){this."+N+" = "+N+";}");
    }
}