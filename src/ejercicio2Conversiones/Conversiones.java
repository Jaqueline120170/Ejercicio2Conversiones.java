/**
 * 
 */
package ejercicio2Conversiones;

import java.util.Scanner;

/**
 * 
 */
public class Conversiones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		 
		 double numero;
			System.out.println("Introduce un número decimal");
			Scanner numeroIntroducido = new Scanner(System.in);
			numero = numeroIntroducido.nextDouble();
			int numeroEntero = (int) numero;
		 
			String texto = String.valueOf(numeroEntero);
			String texto1= String.valueOf(numero);
			 
			System.out.println(texto);
			System.out.println(texto1);
		

	}
	
	

}
