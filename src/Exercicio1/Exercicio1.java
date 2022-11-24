package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String lectura;
        double num = 1;
        double suma = 0;
        double max = 0;
        double min = 0;
        int introducidos = -1;
        do {
            lectura = sc.nextLine().trim().replace(",", ".");
            num = Double.parseDouble(lectura);
            suma = suma + num;
            ++introducidos;
            if (num > max) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        } while (!lectura.equals("00"));
        if (lectura.equals("00")) {
            System.out.printf("Min: %.2f%n", min);
            System.out.printf("Max: %.2f%n", max);
            System.out.printf("Suma: %.2f%n", suma);
            System.out.printf("Media: %.2f%n", (suma / introducidos));
        }
    }
}
