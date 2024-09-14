package projetoEntrevista;

import java.util.Scanner;

public class Entrevista {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);	
		int indice = 13, soma = 0, k = 0;
		while (k < indice) {
			k += 1;
			soma += k;
		}
		System.out.println(soma);
		sc.close();
	}

}
