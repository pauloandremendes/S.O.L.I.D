package ocp;

import java.util.Scanner;

public class AppLoja {
	
	public static void main(String[] args) {
		
		Scanner entradaInfo = new Scanner(System.in);
		
		System.out.println("Informe a capacidade de litros da sua moto de baixa cc: ");
		Double capacidadeCombustivel1 = entradaInfo.nextDouble();
		
		System.out.println("Informe a capacidade de litros da sua moto de esportiva: ");
		Double capacidadeCombustivel2 = entradaInfo.nextDouble();
		
		MotoBaixaCilindrada veiculo2 = new MotoBaixaCilindrada();
		veiculo2.setCapacidadeCombustivel(capacidadeCombustivel1);
		MotoEsportiva veiculo3 = new MotoEsportiva();
		veiculo3.setCapacidadeCombustivel(capacidadeCombustivel2);
		
		System.out.println("A capacidade de litros de combustível da moto de baixa cilindrada é igual a " + capacidadeCombustivel1);
		System.out.println("\nA capacidade de litros de combustível da moto esportiva é de " + capacidadeCombustivel2);
		
	}

}
