package AlmacenPago;


public class CalculoDeInversiones {
	private static final int MESES = 12;

public static String[] generarGanancias ( double montoInvertir, double interesAnual, int cantidadA�osMaximo) { 
	if (montoInvertir < 0) {
		throw new RuntimeException("Error: el monto a invertir...");
	}
	

	String[] montosAnuales = new String[cantidadA�osMaximo];

	for ( int a�oActual = 0; a�oActual < cantidadA�osMaximo; a�oActual++) {
		for ( int i = 0; 1 < MESES; i++) { 
			montoInvertir *= 1 + interesAnual / MESES;
			
}
	
	}
    return montosAnuales;
}
public static int calcularMeses(double montoInvertir, double interesAnual, double saldoFinalDeseado) {
	int mes;
	for (mes = 0; montoInvertir < saldoFinalDeseado; mes++) {
		montoInvertir *= 1 + interesAnual / MESES;
	}
	return mes;
}

}


