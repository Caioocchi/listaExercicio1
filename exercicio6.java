package lista_de_exercicios1;
import java.util.Scanner;
import java.lang.Math;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int num = sc.nextInt();
		
		int triplo = num*3;
		int metade = num/2;
		double raiz3 = Math.cbrt(num);
		double potencia = Math.pow(num, 2/3);
		
		System.out.println("O triplo de "+num+" é:"+triplo);
		System.out.println("A metade de "+num+" é:"+metade);
		System.out.println("A raiz cúbica de "+num+" é:"+raiz3);
		System.out.println("O resultado da potência de "+num+" é:"+potencia);
		
		sc.close();
	}

}
