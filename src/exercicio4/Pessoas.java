
package exercicio4;
import java.util.Scanner;


public class Pessoas {

	Pessoa[] array = new Pessoa[15];
	
	
	void leia() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = new Pessoa();
			
			System.out.println("Digite o nome");
			array[i].nome = sc.next();
			
			System.out.println("Digite a altura");
			array[i].altura = sc.nextDouble();
			

			System.out.println("Digite o peso");
			array[i].peso = sc.nextDouble();
			

			System.out.println(
					"Digite M para homens e F para mulheres");
			array[i].sexo = sc.next().charAt(0);
			
		}
	}
}
