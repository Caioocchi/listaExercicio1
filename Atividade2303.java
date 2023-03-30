package aula3003;
import java.util.Scanner;

public class Atividade2303 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da pizza pequena: ");
		Double pizzaP = sc.nextDouble();
		System.out.println("Informe o valor da pizza média: ");
		Double pizzaM = sc.nextDouble();
		System.out.println("Informe o valor da pizza grande: ");
		Double pizzaG = sc.nextDouble();
		System.out.println("Informe o valor do chopp: ");
		Double chopp = sc.nextDouble();
		System.out.println("Informe o valor da cobertura");
		Double cobertura = sc.nextDouble();
		System.out.println("Informe a quantidade de pessoas: ");
		int pessoas = sc.nextInt();
		System.out.println("Informe quantas pizzas: ");
		int quantPizza = sc.nextInt();
		System.out.println("Informe quantas coberturas: ");
		int quantCobertura = sc.nextInt();
		System.out.println("Informe a quantidade de chopes: ");
		int quantChopp = sc.nextInt();
		sc.nextLine();
		
		
		
		

		System.out.println("Digite o tamanho da pizza que deseja (P, M ou G): ");
		String pizza = sc.nextLine();
		if(pizza.equalsIgnoreCase("P")){
			Double totalP = ((pizzaP*quantPizza + chopp*quantChopp + cobertura*quantCobertura)*1.1/pessoas);
			System.out.printf("O total por pessoa foi: %.2f", totalP);
		}else if(pizza.equalsIgnoreCase("M")){
			Double totalM = ((pizzaM*quantPizza + chopp*quantChopp + cobertura*quantCobertura)*1.1/pessoas);
			System.out.printf("O total por pessoa foi: %.2f", totalM);
		}else if(pizza.equalsIgnoreCase("G")){
			Double totalG = ((pizzaG*quantPizza + chopp*quantChopp + cobertura*quantCobertura)*1.1/pessoas);
			System.out.printf("O total por pessoa foi: %.2f", totalG);
		}else{
			System.out.println("Opção inválida!");
		}
		sc.close();
	}

}
