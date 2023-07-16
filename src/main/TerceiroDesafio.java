package main;

import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Por favor informe a quantidade de n�meros que ir� digitar: ");
       int n = obterEntradaValidada(sc);
        
       System.out.println("Informe o valor alvo: ");
       int k = obterEntradaValidada(sc);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.printf("Informe o n�mero da posi��o %d:  ", i+1);
            arr[i] = obterEntradaValidada(sc);
        }

        int result = countPairs(arr, k);
        System.out.printf("Resultado de pares poss�veis: %d ", result);
    }
    
    private static int countPairs(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }
    
	private static int obterEntradaValidada(Scanner sc) {
		double entrada = 0.0;
		
		entrada = sc.nextDouble();
		
		while (entrada <= 0 || entrada % 1 != 0) {
			System.out.println("Por favor, somente n�mero inteiro maiores que zero");
			entrada = sc.nextDouble();
		}
		
		return (int) entrada;
	}
}
