package ejercicio3;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MultiploTest {

	@ParameterizedTest
	@ValueSource(ints = {10, -8, 3, 5, 40})
	void testObtenerMultiplos(int numeros) throws Exception {
		
		System.out.println();
		System.out.println("------------------");
		Multiplo m1 = new Multiplo(numeros);
		
		try {
			System.out.println();
			m1.obtenerMultiplos(7);
			
		} catch (Exception e) {
			
			System.out.println();
			System.out.println("El numero m es menor que n");
		}
		
		
	}

	
	
	@ParameterizedTest
	@ValueSource(ints = {10, -8, 3, 5, 40})
	void testObtenerMultiplos2(int numeros) throws Exception {
		
		System.out.println();
		System.out.println("**************");
		Multiplo m1 = new Multiplo(7);
		
		try {
			System.out.println();
			m1.obtenerMultiplos(numeros);
			
			
		} catch (Exception e) {
			
			System.out.println();
			System.out.println("El numero m es menor que n");
		}
	}

}
