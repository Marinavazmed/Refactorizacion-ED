package pruebas;
import java.math.BigDecimal;
import java.util.*;

public class Codfuente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char bucle = 's'; 
		int operacion=0;//inicializamos
		do {
		
			do{
			
			System.out.println("Selecciona la operación a realizar:");
			System.out.println("1.-Sumar");
			System.out.println("2.-Restar");
			System.out.println("3.-Multiplicar");
			System.out.println("4.-Dividir");
			System.out.println("5.-Potencia");
			System.out.println("----------------------------------");
			operacion = sc.nextInt();
			if (operacion<1 || operacion>5) {
				System.out.println("Operación no válida");
				}
			}while(operacion<1 || operacion>5);


			//ahora los operandos, wrappers double
			System.out.println("Ha seleccionado la opción " + operacion + ". Dime el primer operando");
			Double num1 = sc.nextDouble();
			System.out.println("Dime el segundo operando");
			Double num2 = sc.nextDouble();
			

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
			
			System.out.println("¿Desea seguir operando? (s/n)");
			bucle = sc.next().charAt(0);
		
		}while (bucle=='s');
	}

}