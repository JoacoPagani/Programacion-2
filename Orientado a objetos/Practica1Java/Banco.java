public class Banco{
    private int[] cantop; int patendidas; int maxOp; int op;
    
    //Defino mi constructor
    public Banco(){
        op = 0;
        cantop = new int[5];
        patendidas = 0;
        int maxOp = -1;
    }
    
    public void procesarOperacion() {
        switch (op) {
            case 0:
                    System.out.println("Cobro de cheque");
                    break;
            case 1:
                    System.out.println("deposito/extraccion en cuenta");
                    break;
            case 2:
                    System.out.println("pago de impuestos o servicios");
                    break;
            case 3:
                    System.out.println("Cobro de jubilacion");
                    break;
            case 4:
                    System.out.println("Cobro de planes");
                    break;
            default:
                    System.out.println("Operación inválida.");
                    return;
        }
        
        // Incrementar contadores si la operación es válida
        cantop[op]++;
        patendidas++;
    }
        // Método para mostrar los resultados
    public void mostrarResultados() {
        String[] operaciones = {
            "Cobro de cheque",
            "Depósito/extracción en cuenta",
            "Pago de impuestos o servicios",
            "Cobro de jubilación",
            "Cobro de planes"
        };

        // Mostrar cantidad de personas atendidas por cada operación
        System.out.println("Cantidad de personas atendidas por operación:");
        for (int i = 0; i < cantop.length; i++) {
            System.out.println(operaciones[i] + ": " + cantop[i]);
        }

        // Encontrar la operación más solicitada
        int maxOp = getOperacionMasSolicitada();
        System.out.println("La operación más solicitada es: " + operaciones[maxOp]);
        System.out.println("Total de personas atendidas: " + patendidas);
        }
    
    
    // Setters
    public void setOperacion(int o) {op = o;}
    
    // Getters
    public int[] getCantOp() {
        return cantop;
    }

    public int getTotalPersonas() {
        return patendidas;
    }

    public int getOperacionMasSolicitada() {
        for (int i = 0; i < cantop.length; i++) {
            if (cantop[i] > cantop[maxOp]) {
                maxOp = i;
            }
        }
        return maxOp;
    }
    
    
    
    
    
}