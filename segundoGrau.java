package aula3003;

import java.util.Scanner;
import java.lang.Math;

public class segundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de a: ");
		Double a = sc.nextDouble();
		if(a != 0){
			System.out.println("Informe o valor de b: ");
			Double b = sc.nextDouble();
			
			System.out.println("Informe o valor de c: ");
			Double c = sc.nextDouble();
			
			Double delta = (b*b) - 4*a*c;
			Double x1 = (-b + Math.sqrt(delta))/2*a;
			Double x2 = (-b - Math.sqrt(delta))/2*a;
			if(delta > 0){
				System.out.println("Os valores de x1 e x2, respectivamente s�o: "+x1+" e"+x2);
			}else if(delta == 0){
				System.out.println("Os valores de x1 e x2 s�o iguais: "+x1+" e "+x2);
			}else{
				System.out.println("Delta:" +delta);
				System.out.println("N�o � poss�vel calcular a raiz de um n�mero negativo!");
			}
		}else if(a == 0){
			System.out.println("O valor de a n�o pode ser zero!");
		}
		sc.close();
	}
}

