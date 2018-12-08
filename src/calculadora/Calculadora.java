package calculadora;
import java.util.*;
/*
 * Programa que solicita dos números por teclado y realiza  
 * operaciones básicas con ellos
 */

public class Calculadora {

	public static void main(String[] args) {

		int resultado=0; //almacena el resultado de la operación
		byte opc=0;
			 //prueba
			//crea una instancia para leer de teclado y se almacena primer número
				Scanner teclado = new Scanner (System.in);
				System.out.println("Elija la operación: ");
				System.out.println("1. Suma ");
				System.out.println("2. Resta ");
				System.out.println("3. División ");
				opc = teclado.nextByte();
				
		    //comprueba que la opción escogida sea válida
				while ((opc>3)||(opc<1)){
					System.out.println("Opción no permitida. Introduzca una opción válida ");
					System.out.println("Elija la operación: ");
					System.out.println("1. Suma ");
					System.out.println("2. Resta ");
					System.out.println("3. División ");
					opc = teclado.nextByte();
				}
			//pide introducir los números por teclado
				System.out.println("Introduce un número: ");
				int	numero1 = teclado.nextInt();
				System.out.println("Introduce otro número: ");
				int	numero2 = teclado.nextInt();
				switch(opc) {
				case 1:
					resultado=numero1+numero2;
					System.out.print("La suma es: "+resultado);
					break;
				case 2:
	    			resultado=numero1-numero2;
					System.out.print("La resta es: "+ resultado);
					break;
				case 3:
	    			while (numero2==0) {
	    			 System.out.print("No se puede dividir por 0. Introduce otro número: ");
	    			 numero2 = teclado.nextInt();
	    			}
	    			resultado=numero1/numero2;
					System.out.print("La división es: "+ resultado);
					break;
                    }
				teclado.close();
	}
	
}
