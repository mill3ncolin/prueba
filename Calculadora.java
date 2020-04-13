package PaqueteCalculadora2020;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion = 0;
		Integer resultado=0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("-----------------------------------------");
		System.out.println(" Ingrese su OPCION        ---------------");
		System.out.println(" de opcion 1 opcion 2 opcion 3 opcion 4  ");
		System.out.println(" opcion 1 -     SUMA      ---------------");
		System.out.println(" opcion 2 -    RESTA      ---------------");
		System.out.println(" opcion 3 - MULTIPLICACION  -------------");
		System.out.println(" opcion 4 - DIVISION      ---------------");
		System.out.println("-----------------------------------------");
		opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("-----------------------");
			System.out.println("Ingreso a la opción UNO");
			System.out.println(" opcion 1 -   SUMA ----");
			System.out.println("-----------------------");
			break;
		case 2:
			System.out.println("----------------------");
			System.out.println("Ingreso a la opción DOS");
			System.out.println("opcion 2 - RESTA -----");
			System.out.println("----------------------");

			break;
		case 3:
			System.out.println("-------------------------------");
			System.out.println("Ingreso a la opción TRES");
			System.out.println(" opcion 3 - MULTIPLICACION----");
			System.out.println("-------------------------------");

			break;
		case 4:
			System.out.println("-----------------------------");
			System.out.println("Ingreso a la opción CUATRO");
			System.out.println(" opcion 4 - DIVISION---------");
			System.out.println("-----------------------------");

			break;
		default:
			System.out.println("----------------------");
			System.out.println("SIN OPCIONES");
			System.out.println("----------------------");
			break;
		}
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		if (opcion.equals(1)) {
			resultado = a + b;
			System.out.println("El resultado es " + resultado.toString());
		} else if (opcion.equals(2)) {
			resultado = a - b;
			System.out.println("El resultado es " + resultado.toString());
		} else if (opcion.equals(3)) {
			resultado = a * b;
			System.out.println("El resultado es " + resultado.toString());
		} else if  (!a.equals(0)){
			resultado = a / b;
			System.out.println("El resultado es " + resultado.toString());
		} else {System.out.println("0 numero invalido");}
			teclado.close();
		
		
	}
}
