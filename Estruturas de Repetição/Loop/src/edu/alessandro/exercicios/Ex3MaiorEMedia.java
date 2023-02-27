package edu.alessandro.exercicios;

import java.util.Scanner;

public class Ex3MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int maior = 0;
        int soma = 0;
        int media = 0;

        int count = 0;
        do{
            System.out.println("Nota: ");
            number = scan.nextInt();

            soma = soma + number;
            media = soma / 5;

            if (number > maior) maior = number;
            count++;
        }while(count < 5);

        System.out.println("Maior Nota: " + maior);
        System.out.println("Media: " + media);

        if(media < 6 ){
        System.out.println("REPROVADO");
        }else {
            System.out.println("APROVADO");
        }
    }
}
