package main;

import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe quantas frases irá digitar: ");
		int n = obterEntradaValidada(sc); 
		
		sc.nextLine();

		String[] lines = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Informe a frase %d: ", i+1);
			lines[i] = sc.nextLine();
		}

		sc.close();

		for (int i = 0; i < n; i++) {
			String decipheredLine = decipher(lines[i]);
			System.out.println(decipheredLine);
		}
	}

	private static String decipher(String line) {
		int length = line.length();
		int halfLength = length / 2;
		StringBuilder sb = new StringBuilder();

		for (int i = halfLength - 1; i >= 0; i--) {
			sb.append(line.charAt(i));
		}

		for (int i = length - 1; i >= halfLength; i--) {
			sb.append(line.charAt(i));
		}

		return sb.toString();
	}
	
	private static int obterEntradaValidada(Scanner sc) {
		String entrada = "";
		
		entrada = sc.next();
		
		while (!entrada.matches("-?\\d+(\\.\\d+)?")) {
			System.out.println("Por favor, somente número inteiro maiores que zero");
			entrada = sc.next();
		}
		
		return Integer.valueOf(entrada);
	}
}
