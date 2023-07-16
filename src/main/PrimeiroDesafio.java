package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, valor;

		System.out.println("Por favor, informe a quantidade de n�meros que ir� digitar:  ");
		n = obterQuantidadeNumero(sc);
		
		List<Integer> listaPar = new ArrayList<>();
		List<Integer> listaImpar = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Por favor, informe o n�mero da posi��o %d \n", i+1);
			valor = sc.nextInt();

			if(valor > 0) {
				if (valor % 2 == 0) {
					listaPar.add(valor);
				} else {
					listaImpar.add(valor);
				}
			}else {
				System.out.println("Informe apenas n�meros inteiros positivos!");
			}
		}
		
		System.out.println("N�meros pares em ordem crescente e �mpares decrescente:");
		
		listarPares(listaPar);
		
		listarImpares(listaImpar);

		sc.close();
	}
	
	
	private static void listarPares(List<Integer> listaPar) {
		Collections.sort(listaPar);
		
		for (int numeroPar : listaPar) {
			System.out.println(numeroPar);
		}
		
	}
	
	private static void listarImpares(List<Integer> listaImpar) {
		Collections.sort(listaImpar, Collections.reverseOrder());

		for (int numeroImpar : listaImpar) {
			System.out.println(numeroImpar);
		}
		
	}
	
	private static int obterQuantidadeNumero(Scanner sc) {
		int entrada = 0;
		
		entrada = sc.nextInt();
		
		while (1 >= entrada || entrada > Math.pow(10,5)) {
			System.out.println("Por favor, informe um n�mero entre 2 e 100000");
			entrada = sc.nextInt();
		}
		
		return entrada;
	}
}
