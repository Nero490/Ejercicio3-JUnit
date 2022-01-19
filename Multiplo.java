package ejercicio3;


public class Multiplo {

	//Atributos
	private int n;

	
	//Constructor
	public Multiplo(int numero) {
		this.n = numero;	
	}
	
	
	
	// Calcula los multiplos de n hasta el valor m
	public void obtenerMultiplos(int m) throws Exception {
		if (n > m) {
			throw new Exception("El número m es mayor que el número n");
		}
		for (int i = 1; i <= m; i++) {
			System.out.println(this.n * i);
			
		}
	}
	

}
