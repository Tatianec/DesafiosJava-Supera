package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int valorEmCentavos = (int) (valor * 100);
        int notas, moedas;
        int[] notasValores = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedasValores = {100, 50, 25, 10, 5, 1};

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
       
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
}
