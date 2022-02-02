package AlmacenPago;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculoDeInversionesTests {
	
	@Before
	public void setUp() throws Exception{
	}
	
	@Test
	public void test() {
		
	double montoInvertir = 1000;
	double interesAnual = 0.24;
	int cantidadAñosMaximo = 4;

	
	String[] expecteds =  { "1268.2418" , "1608.4372" , "2039.8873" , "2587.0704" };
	String[] actuals = CalculoDeInversiones.generarGanancias (montoInvertir, interesAnual, cantidadAñosMaximo );
			
			assertArrayEquals(expecteds, actuals);
	}


	@Test
 public void test2() {
	double montoInvertir = 1000;
	double interesAnual = 0.07;
	double saldoFinalDeseado = 2000;

	int expecteds = 120;

	int actuals = CalculoDeInversiones.calcularMeses(montoInvertir, interesAnual, saldoFinalDeseado);

	assertEquals(expecteds, actuals);
}
	@Test
public void test3() {
	double montoInvertir = 1000;
	double interesAnual = 0.24;
	double saldoFinalDeseado = 2587;

	int expecteds = 48;

	int actuals = CalculoDeInversiones.calcularMeses(montoInvertir, interesAnual, saldoFinalDeseado);

	assertEquals(expecteds, actuals);
}

}
