public class micro {
    private 
        String patente;
        String destino;
        int hora;
        boolean[] asiento;
        
    public micro(){}
    
    public micro(String patente, String destino, int hora){
        this.patente = patente;
        this.destino = destino;
        this.hora = hora;
        asiento = new boolean[20];//El vector de booleanos se setea en falso por defecto en Java
    }
    
    public int asientosOcupados(){
        int ocupados = 0;
        for (int i=0; i< 20; i++){ 
            if (asiento[i]) {ocupados++;}
        }
        return ocupados;
    }
    
    public boolean microLleno() {
        if (asientosOcupados() == 20) {
        return true;
        }
        return false;
    }
    
    public boolean validarAsiento(int nro) {
        if (nro > 0 && nro < 21) {
            return true;    
        }   
        return false;
    }
    
    public String estadoAsiento(int nro) {
        if (!validarAsiento(nro)) { return "El numero ingresado no es un asiento valido";
        } else if (asiento[nro-1]) {return "El asiento se encuentra ocupado";}
        return "El asiento se encuentra libre";
    }
    
    public String ocuparAsiento(int nro) {
        if (validarAsiento(nro)) { 
            if (estadoAsiento(nro).equalsIgnoreCase("El asiento se encuentra libre")) {
                asiento[nro - 1] = true;
                return "Ocupaste el asiento! ";
            } else {return estadoAsiento(nro);}
        } 
        return estadoAsiento(nro);
    }
    
    public String liberarAsiento(int nro) {
        if (validarAsiento(nro)) { 
            if (estadoAsiento(nro).equalsIgnoreCase("El asiento se encuentra libre")) {
                return "El asiento ya esta liberado";
            } else {
                    asiento[nro-1] = false;
                    return "Liberaste el asiento";}
        } 
        return estadoAsiento(nro);
    }    
    
    public int primerAsientoLibre() {
        for (int i = 0; i < asiento.length; i++) {
            if (!asiento[i]) {  
            return i + 1;   
            }
        }
        return -1;  
    }

    
    
    //Getters
    public String getPatente() {return patente;}
    public String getDestino() {return destino;}
    public int getHoraSalida() {return hora;}

    
    //Setters 
    public void setPatente(String p) {patente = p;}
    public void setDestino(String d) {destino = d;}
    public void setPatente(int h) {hora = h;}
}
