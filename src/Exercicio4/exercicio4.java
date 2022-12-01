package Exercicio4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 1;
        int y = 1;

        while (x != 0 && y != 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                System.out.println("");
            } else {
                int forma1 = y - x;
                int forma2 = x + 99 - y;
                int forma3 = y + 99 - x;
                int forma1absoluta = Math.abs(forma1);
                int forma2absoluta = Math.abs(forma2);
                int forma3absoluta = Math.abs(forma3);

                if (forma1absoluta <= forma2absoluta && forma1absoluta <= forma3absoluta) {
                    System.out.println(forma1absoluta);
                } else if (forma2absoluta <= forma3absoluta && forma2absoluta <= forma1absoluta) {
                    System.out.println(forma2absoluta);
                } else {
                    System.out.println(forma3absoluta);
                }
            }
        }
    }
}