package lista_de_exercicios1;
import java.util.Scanner;
import java.lang.Math;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro: ");
		int num = sc.nextInt();
		
		int triplo = num*3;
		int metade = num/2;
		double raiz3 = Math.cbrt(num);
		double potencia = Math.pow(num, 2/3);
		
		System.out.println("O triplo de "+num+" �:"+triplo);
		System.out.println("A metade de "+num+" �:"+metade);
		System.out.println("A raiz c�bica de "+num+" �:"+raiz3);
		System.out.println("O resultado da pot�ncia de "+num+" �:"+potencia);
		
		sc.close();
	}

}
