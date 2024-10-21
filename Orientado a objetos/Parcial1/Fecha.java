public class Fecha {
    /**Variables*/
    private int dia,mes,ano;
    
    /**Constructores*/
    public Fecha(){}
    public Fecha(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    /**Setters*/
    public void setDia(int dia){this.dia = dia;}
    public void setMes(int mes){this.mes = mes;}
    public void setAno(int ano){this.ano = ano;}
    
    /**Getters*/
    public int getDia(){return dia;}
    public int getMes(){return mes;}
    public int getAno(){return ano;}
    
    /**Metodos*/
    
    public boolean mismoDia(int d,int m,int a){
        return (ano == a && mes == m && dia == d);        
    }
    
    public boolean esAntes(int d, int m, int a) {
        System.out.println("Fecha objeto: " + dia + "/" + mes + "/" + ano);
        System.out.println("Comparando con: " + d + "/" + m + "/" + a);
        boolean resultado = ((ano < a) || (ano == a && (mes < m || (mes == m && dia < d))));
        System.out.println("Resultado de la comparación: " + resultado);
        return resultado;
    }
    
    public boolean esDespues(int d, int m, int a){
        boolean b = false;
        if (!mismoDia(d,m,a) && !esAntes(d,m,a)) {b = true;}
        return b;
    }

}