public class Main {
    public static void main(String[] args) {
        // Crear la estación La Plata y un sistema con reporte anual
        Estacion laPlata = new Estacion("La Plata", -34.921, -57.955);
        SistemaRegistro sistemaAnual = new SistemaAnio(laPlata, 2021, 3);

        // Cargar temperaturas para 3 años consecutivos (2021, 2022, 2023)
        sistemaAnual.registrarTemperatura(2021, 1, 23.5);
        sistemaAnual.registrarTemperatura(2021, 2, 24.0);
        // ...cargar todas las demás temperaturas...

        // Informar los promedios anuales
        System.out.println(sistemaAnual.reportarPromedio());

        // Informar el mes y año de la mayor temperatura
        System.out.println("Mayor temperatura registrada: " + sistemaAnual.obtenerMayorTemperatura());

        // Crear la estación Mar del Plata y un sistema con reporte mensual
        Estacion marDelPlata = new Estacion("Mar del Plata", -38.002, -57.556);
        SistemaRegistro sistemaMensual = new SistemaMes(marDelPlata, 2020, 4);

        // Cargar temperaturas para 4 años consecutivos (2020, 2021, 2022, 2023)
        sistemaMensual.registrarTemperatura(2023, 1, 26.5);
        sistemaMensual.registrarTemperatura(2023, 2, 27.1);


        // Informar los promedios mensuales
        System.out.println(sistemaMensual.reportarPromedio());

        // Informar el mes y año de la mayor temperatura
        System.out.println("Mayor temperatura registrada: " + sistemaMensual.obtenerMayorTemperatura());
    }
}
