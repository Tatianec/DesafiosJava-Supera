package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        
        int valorEmCentavos;
        int notas, moedas;
        int[] notasValores = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedasValores = {100, 50, 25, 10, 5, 1};
        
		System.out.println("Por favor, informe valor");
        double valor = obterValor(sc);
        
        valorEmCentavos = (int) (valor * 100);
       
        System.out.println("NOTAS:");
        for (int i = 0; i < notasValores.length; i++) {
            notas = valorEmCentavos / notasValores[i];
            valorEmCentavos %= notasValores[i];

            System.out.printf("%d nota(s) de R$ %s%n", notas, formatarValor((double) notasValores[i] / 100, decimalFormat));
        }

        System.out.println("\nMOEDAS:");
        for (int i = 0; i < moedasValores.length; i++) {
            moedas = valorEmCentavos / moedasValores[i];
            valorEmCentavos %= moedasValores[i];

            System.out.printf("%d moeda(s) de R$ %s%n", moedas, formatarValor((double) moedasValores[i] / 100, decimalFormat));
        }
    }

    private static String formatarValor(double valor, DecimalFormat decimalFormat) {
        return String.format("%.2f", valor).replace(",", ".");
    }
    
	public static double obterValor(Scanner sc) {
		double valor = 0.0;
		
		valor = sc.nextDouble();
		
		while (0 >= valor || valor > 1000000.00) {
			System.out.println("Por favor, informe um número entre 0 e 1000000.00");
			valor = sc.nextDouble();
		}
		
		return valor;
	}
}
