package Exercicio5;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = 0;
        int numinicio = 0;
        int numdestino = 0;
        int pisos = 0;
        int valoranterior = 0;
        boolean sair1 = false;
        boolean sair2 = false;
        boolean condicion = true;
        do {
            inicio = sc.nextInt();
            condicion = true;
            sair2 = false;
            pisos = 0;
            if (inicio >= 0) {
                do {
                    numinicio = sc.nextInt();
                    if (numinicio >= 0) {
                        numdestino = sc.nextInt();
                        if (numdestino >= 0) {
                            if (condicion == true) {
                                int op1 = numinicio - inicio;
                                int op1ab = Math.abs(op1);
                                pisos = pisos + op1ab;
                                int op2 = numdestino - numinicio;
                                int op2ab = Math.abs(op2);
                                pisos = pisos + op2ab;
                                valoranterior = numdestino;
                                condicion = false;
                            } else {
                                int op3 = valoranterior - numinicio;
                                int op3ab = Math.abs(op3);
                                int op4 = numdestino - numinicio;
                                int op4ab = Math.abs(op4);
                                pisos = pisos + op3ab + op4ab;
                                valoranterior = numdestino;
                            }
                        } else {
                            sair2 = true;
                            int op5 = inicio - numinicio;
                            int op5ab = Math.abs(op5);
                            System.out.println(op5ab);
                        }

                    } else {
                        sair2 = true;
                        if (pisos == 0) {
                            System.out.println(0);
                        } else {
                            System.out.println(pisos);
                        }

                    }
                } while (sair2 != true);
            } else {
                sair1 = true;
            }
        } while (sair1 != true);
    }
}