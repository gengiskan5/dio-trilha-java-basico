package br.com.dio.exercicios.arrays;



public class Ex1_OrdemInversa {
    public static void main(String[] args) {


        int [] vetor = {0, 5, 15, 8, 4, 6};


        int count = 0;

        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;

        }
        System.out.print("/nVetor:  ");

       for (int i = (vetor.length - 1); i >= 0; i--){
           System.out.print(vetor[i] + " ");
       }


    }
}
