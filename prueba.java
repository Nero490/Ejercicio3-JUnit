package ejercicio3;

public class prueba {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Introduce un numero de el cual desees sus m�ltiplos");
		int n = Console.readInt();
		
		Multiplo m1 = new Multiplo(n);
		
		System.out.println("Introduce el numero de m�ltiplos que desees obtener");
		int m = Console.readInt();
	
		do {
			if (n > m) {
				System.out.println("El n�mero m es menor que el n�mero n");
				System.out.println();
				System.out.println("Introduzca otro n�mero");
				m = Console.readInt();
			} 
			
			
			
		} while (n > m);	
		
		System.out.println();
		System.out.println();
		m1.obtenerMultiplos(m);

	}

}
