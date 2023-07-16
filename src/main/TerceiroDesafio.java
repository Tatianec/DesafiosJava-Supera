package main;

import java.util.Scanner;

public class TerceiroDesafio {

    public static int countPairs(int[] arr, int k) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor informe a quantidade de números que irá digitar: ");
       int n = scanner.nextInt();
        
       System.out.println("Informe o valor alvo: ");
       int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.printf("Informe o número da posição %d:  ", i+1);
            arr[i] = scanner.nextInt();
        }

        int result = countPairs(arr, k);
        System.out.printf("Resultado de pares possíveis: %d ", result);
    }
}
