public class Noclasificado extends Piloto {
    
    public Noclasificado() {}
    
    public Noclasificado(String Nombre, String Apellido, int Ranking) {
        super(Nombre, Apellido, Ranking);
    }

    
    public void calcularPuntaje(String lugar, int pos) {
        int puntaje = super.getPuntaje();
        if ((lugar.equalsIgnoreCase("Japon") || lugar.equalsIgnoreCase("China"))) {puntaje += 3;
        } else if (lugar.equalsIgnoreCase("Belgica") || lugar.equalsIgnoreCase("Hungria")){puntaje += 1;
        }    
        if (super.getTermino5()) {puntaje += 1;}
        super.setPuntaje(puntaje);
    }

}