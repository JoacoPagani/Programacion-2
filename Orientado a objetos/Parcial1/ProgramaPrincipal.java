import java.util.Scanner;

public class ProgramaPrincipal {
    
    public static void main(String[] args){
        Libro[] libros = new Libro[5];
        Scanner in = new Scanner(System.in);
        
        for (int i =0; i<5; i++) {
            libros[i] = leerLibro(in);
        }
    }
    
    public static Libro leerLibro(Scanner in) {
        Libro l;
        
        System.out.println("Ingrese los datos del autor");
        Autor a = leerAutor(in);
        System.out.println("Ingrese el codigo ISBN");
        int cod = in.nextInt();
        System.out.println("ingrese nombre del libro");
        String nombre = in.next();
        System.out.println("Ingrese la cantidad de paginas");
        int cant = in.nextInt();
        System.out.println("Ingrese el precio");
        double precio = in.nextDouble();
        System.out.println("Ingrese la fecha de publicacion ");
        Fecha f = leerFecha(in);
        System.out.println("Que tipo de libro es? Divulgativo / literatura");
        String tipo = in.next();
        System.out.println("Ingrese el genero");
        if (tipo.equalsIgnoreCase("divulgativo")) {
        in.nextLine();
        tipo = in.nextLine();
        l = new  Divulgativo(tipo, cod,nombre, cant, precio,f,a) ;
   
        } else { String genero = in.next();
        System.out.println("Es edicion de bolsillo? true/false");
        boolean edicion = in.nextBoolean();
        l = new  Literatura(genero,edicion, cod,nombre, cant, precio,f,a);
        } 
        return l;
    }
    
    public static Autor leerAutor(Scanner in) {
        System.out.println("Ingrese su DNI");
        int dni = in.nextInt();
        System.out.println("Ingrese su nombre");
        String nombre = in.next();
        System.out.println("Ingrese su apellido");
        String apellido = in.next();
        System.out.println("Ingrese su nacionalidad");
        String nacionalidad = in.next();
        Autor a = new Autor(dni,apellido,nombre,nacionalidad);
        
        return a;
    }
    
    public static Fecha leerFecha(Scanner in) {
        System.out.println("Ingrese el dia");
        int dia = in.nextInt();
        System.out.println("Ingrese el mes");
        int mes = in.nextInt();
        System.out.println("Ingrese el año");
        int año = in.nextInt();
        
        Fecha f = new Fecha (dia,mes,año);
        return f;
    }
}