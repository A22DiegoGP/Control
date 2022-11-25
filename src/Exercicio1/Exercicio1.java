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
        boolean condicion = true;
        do {
            lectura = sc.nextLine().trim().replace(",", ".");
           if (lectura.equals("00") && condicion == true) {
                System.out.println("No hay datos");
           } else if(lectura.equals("00") && condicion == false){
                System.out.printf("Min: %.2f%n", min);
                System.out.printf("Max: %.2f%n", max);
                System.out.printf("Suma: %.2f%n", suma);
                System.out.printf("Media: %.2f%n", (suma / (introducidos+1)));
           } else {
                num = Double.parseDouble(lectura);
                suma = suma + num;
                ++introducidos;
                if (num > max) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
           }
           condicion = false;
        } while (!lectura.equals("00"));
    }
}
