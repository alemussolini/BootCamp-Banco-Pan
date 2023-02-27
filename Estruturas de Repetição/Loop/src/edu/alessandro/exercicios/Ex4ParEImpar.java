package edu.alessandro.exercicios;

import java.util.Scanner;

public class Ex4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPar = 0, quantImpar = 0;

        System.out.println("Quantidade de Numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                quantPar++;
            }else {
                quantImpar++;
            }
            count++;
        }while(count < quantNumeros);

        System.out.println("Quantidade de Par: " + quantPar);
        System.out.println("Quantidade de Impar: "+ quantImpar);
    }
}
