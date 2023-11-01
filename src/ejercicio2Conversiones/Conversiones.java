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
			
			numeroEntero = Integer.parseInt(texto);
			numero = Double.parseDouble(texto1);
			 
			System.out.println(numeroEntero);
			System.out.println(numero);
		

	}
	
	

}
