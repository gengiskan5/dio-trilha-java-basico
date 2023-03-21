package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  Nota;

        System.out.println("Nota: ");
        Nota = scan.nextInt();

        while (Nota < 0 | Nota > 10){
            System.out.println("Nota Inválida! Digite novamente");
            Nota = scan.nextInt();
        }
    }
}
