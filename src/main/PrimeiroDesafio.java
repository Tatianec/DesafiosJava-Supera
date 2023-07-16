package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, valor;


		System.out.println("Por favor, informe a quantidade de números que irá digitar:  ");
		n = sc.nextInt();

		List<Integer> listaPar = new ArrayList<>();
		List<Integer> listaImpar = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			valor = sc.nextInt();

			if(valor > 0) {
				if (valor % 2 == 0) {
					listaPar.add(valor);
				} else {
					listaImpar.add(valor);
				}
			}else {
				System.out.println("Informe apenas números inteiros positivos!");
			}
		}
		
		listarPares(listaPar);
		
		listarImpares(listaImpar);

		sc.close();
	}
	
	
	public static void listarPares(List<Integer> listaPar) {
		Collections.sort(listaPar);
		
		for (int numeroPar : listaPar) {
			System.out.println(numeroPar);
		}
		
	}
	
	public static void listarImpares(List<Integer> listaImpar) {
		Collections.sort(listaImpar, Collections.reverseOrder());

		for (int numeroImpar : listaImpar) {
			System.out.println(numeroImpar);
		}
		
	}
}
