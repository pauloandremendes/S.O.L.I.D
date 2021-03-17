package srp;

import java.util.Scanner;

public class AppIMC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Informe seu peso: ");
		double peso = scanner.nextDouble();
		
		CalculadoraImc calculadora1 = new CalculadoraImc();
		calculadora1.setAltura(altura);
		calculadora1.setPeso(peso);
		System.out.println("Seu resultado final é: " + calculadora1.status());
	}

}
