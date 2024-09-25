import java.util.Scanner;

class Main {
    public static void main(String args[]) {
       int dimF = 3; 
        Persona[] vectorPersonas = cargarPersonas(dimF);

        System.out.println("La cantidad de personas mayores a 65 son: " + contador65(vectorPersonas, dimF));
        System.out.println("La persona con menor DNI: " + menorDni(vectorPersonas, dimF));       
       
    }
    
    public static Persona[] cargarPersonas(int dimF) {
        Persona[] vector = new Persona[dimF];
        Scanner in = new Scanner(System.in);    
        for (int i = 0; i < dimF; i++) {
        // Lectura de los datos
        System.out.println("Ingrese el nombre de la persona " + i);
        String nom = in.next();
        System.out.println("Ingrese el dni de la persona " + i);
        int dni = in.nextInt();
        System.out.println("Ingrese la edad de la persona " + i);
        int edad = in.nextInt();
        
        // Guardo datos en el vector
        vector[i] = new Persona(nom, dni, edad);
        }

        return vector; // Retornas el vector cargado
    }
    
    public static int contador65(Persona v[], int dimF) {
        int cont = 0;
        for (int i = 0; i < dimF; i++) {
            if (v[i].getEdad() > 65) {cont++;}
        }
        return cont;
    }
    
    public static String menorDni(Persona v[], int dimF) {
        Persona menorDni = new Persona();
        menorDni.setDNI(99999999);
        for (int i = 0; i < dimF; i++) {
            if (v[i].getDNI() < menorDni.getDNI()){menorDni = v[i];}
        }
        return menorDni.toString();
    }
    
    
    
    
    }
