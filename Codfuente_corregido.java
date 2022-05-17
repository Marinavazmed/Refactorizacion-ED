package pruebas;

import java.math.BigDecimal;
import java.util.*;

public class Codfuente_corregido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char bucle;
		int operacion;
		do {
			operacion = imprimirMenu();
			System.out.println("Ha seleccionado la opción " + operacion + ". Dime el primer operando");
			Double num1 = sc.nextDouble();
			System.out.println("Dime el segundo operando");
			Double num2 = sc.nextDouble();
			devuelveResultado(operacion, num1, num2);
			System.out.println("¿Desea seguir operando? (s/n)");
			bucle = sc.next().charAt(0);

		} while (bucle == 's');
	}

	/**
	 * Este método imprime el menú numerado con todas las opciones disponibles.
	 * 
	 * @author MarinaVaz
	 * @return Indice de la operación seleccionada por el usuario, o 0 si la opción
	 *         no es válida.
	 */
	public static int imprimirMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona la operación a realizar:");
		System.out.println("1.-Sumar");
		System.out.println("2.-Restar");
		System.out.println("3.-Multiplicar");
		System.out.println("4.-Dividir");
		System.out.println("5.-Potencia");
		System.out.println("----------------------------------");
		int devuelve = sc.nextInt();

		if (devuelve < 1 || devuelve > 5) {
			System.out.println("Operación no válida");
			devuelve = 0;
		}
		return devuelve;

	}

	/**
	 * Este método analiza la opción introducida e imprime el resultado esperado, o
	 * mensaje de error si la opción pasada como parámetro no es correcta.
	 * 
	 * @param operacion Define el índice de la operación deseada.
	 * @param num1      Define el primer valor (tipo Double) con el que opera.
	 * @param num2      Define el segundo valor (tipo Double) con el que opera.
	 * @author MarinaVaz
	 */
	public static void devuelveResultado(int operacion, Double num1, Double num2) {
		switch (operacion) {
		case 1:
			System.out.println("La suma es: ");
			System.out.println(Math.addExact(num1.intValue(), num2.intValue()));
			break;
		case 2:
			System.out.println("La resta es: ");
			System.out.println(Math.subtractExact(num1.intValue(), num2.intValue()));
			break;
		case 3:
			BigDecimal multi1 = new BigDecimal(num1);
			BigDecimal multi2 = new BigDecimal(num2);
			System.out.println("La multiplicación es: ");
			System.out.println(multi1.multiply(multi2));
			break;
		case 4:
			BigDecimal divi1 = new BigDecimal(num1);
			BigDecimal divi2 = new BigDecimal(num2);
			System.out.println("La division es: ");
			System.out.println(divi1.divide(divi2));
			break;
		case 5:
			System.out.println("La potencia es: ");
			System.out.println(Math.pow(num1, num2));
			break;
		default:
			System.out.println("Esta operación no se puede realizar");
		}

	}
}