package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicar = 1;

        System.out.println(fatorial + "! = ");

        for (int i = fatorial ; i >= 1 ;i -- ){
              multiplicar = multiplicar * i;
        }

        System.out.println(multiplicar);
    }
}
