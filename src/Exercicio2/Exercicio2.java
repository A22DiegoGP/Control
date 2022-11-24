package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String introletra; 
        String end = "<END>";
        String texto;
        int sumaletra = 0;
        //letra a examinar
        introletra = sc.nextLine();
        do {
                texto = sc.nextLine();
                for (int i = 0; i < texto.trim().length() ; i++) {
                    if(texto.trim().charAt(i) == (introletra.trim().charAt(0))){
                        ++sumaletra; 
                    }
                } 
        } while (texto.equals(texto.indexOf("<END>"))); 
         
    }
}