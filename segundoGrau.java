package lista_de_exercicios1;
import java.util.Scanner;
import java.lang.Math;

public class segundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de a: ");
		Double a = sc.nextDouble();
		
		System.out.println("Informe o valor de b: ");
		Double b = sc.nextDouble();
		
		System.out.println("Informe o valor de c: ");
		Double c = sc.nextDouble();
		
		Double delta = (b*b) - 4*a*c;
		Double x1 = (-b + Math.sqrt(delta))/2*a;
		Double x2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.println("Os valores de x1 e x2, respectivamente são: "+x1+" e"+x2);
	
		sc.close();
	}
}
