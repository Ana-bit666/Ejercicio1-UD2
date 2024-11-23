package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos a realizar una suma");
		
		System.out.print("Introduce el primer número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Introduce el segundo número: ");
		double num2 = entrada.nextDouble();
		
		double suma = num1 + num2;
		
		System.out.println("El resultado de la suma es: " + suma);
		entrada.close();
	}

}
