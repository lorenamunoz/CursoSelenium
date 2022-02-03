package comjava;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero;		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor ingrese el numero:");
		numero = teclado.nextInt();
		
		if(numero >= 0) {
			System.out.println("El numero ingresado es Positivo");
		}else {
				System.out.println("El numero ingresado es Negativo");
			}
		
		if(numero / 2 == 0) {
			System.out.println("El numero ingresado es Par");
		}else {
				System.out.println("El numero ingresado es Impar");
			}
				
			
		}

}
