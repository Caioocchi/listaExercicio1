package lista_de_exercicios1;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double chopp = 1.80;
		Double pizzaG = 25.0;
		Double cobertura = 3.50;
		
		System.out.println("Informe a quantidade de pessoas na mesa: ");
		Double pessoas = sc.nextDouble();
		
		System.out.println("Informe quantas coberturas: ");
		Double quantCobertura = sc.nextDouble();
		
		System.out.println("Informe a quantidade de tulipas: ");
		Double quantChopp = sc.nextDouble();

		Double total = (((quantChopp*chopp) + (quantCobertura*cobertura) + pizzaG)*1.1)/pessoas;

		System.out.println("o total, por pessoa é: "+total);
		
		sc.close();
	}

}
