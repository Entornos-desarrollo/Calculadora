package calculadora;
import java.util.*;
/*
 * Programa que solicita dos n�meros por teclado y realiza  
 * operaciones b�sicas con ellos
 */

public class Calculadora {

	public static void main(String[] args) {

		int resultado=0; //almacena el resultado de la operaci�n
		byte opc=0;
			 //prueba
			//crea una instancia para leer de teclado y se almacena primer n�mero
				Scanner teclado = new Scanner (System.in);
				System.out.println("Elija la operaci�n: ");
				System.out.println("1. Suma ");
				System.out.println("2. Resta ");
				System.out.println("3. Divisi�n ");
				opc = teclado.nextByte();
				
		    //comprueba que la opci�n escogida sea v�lida
				while ((opc>3)||(opc<1)){
					System.out.println("Opci�n no permitida. Introduzca una opci�n v�lida ");
					System.out.println("Elija la operaci�n: ");
					System.out.println("1. Suma ");
					System.out.println("2. Resta ");
					System.out.println("3. Divisi�n ");
					opc = teclado.nextByte();
				}
			//pide introducir los n�meros por teclado
				System.out.println("Introduce un n�mero: ");
				int	numero1 = teclado.nextInt();
				System.out.println("Introduce otro n�mero: ");
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
	    			 System.out.print("No se puede dividir por 0. Introduce otro n�mero: ");
	    			 numero2 = teclado.nextInt();
	    			}
	    			resultado=numero1/numero2;
					System.out.print("La divisi�n es: "+ resultado);
					break;
                    }
				teclado.close();
	}
	
}
