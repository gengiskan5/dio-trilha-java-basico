package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for ( int i = 0;i < numerosAleatorios.length ;i++ ){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("Numeros Aleatorios: ");
        for ( int numero : numerosAleatorios) {
            System.out.println(numero + " " );

        }
        System.out.println("\nAntecessor dos Numeros Aleatorios: ");
        for ( int numero : numerosAleatorios) {
            System.out.println((numero-1) + " " );

        }

        System.out.println("\nSucessores dos Numeros Aleatorios: ");
        for ( int numero : numerosAleatorios) {
            System.out.println((numero+10) + " " );

        }


    }

}
