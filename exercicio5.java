package lista_de_exercicios1;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		float C = sc.nextFloat();
		
		float F = (C*9/5)+32;
		
		System.out.println("A temperatura, em Fahrenheit é de: "+F+" ºF");
		
		sc.close();
	}

}
