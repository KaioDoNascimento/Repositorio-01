package javaapplication;

import java.util.Scanner;

public class EntradaDeDados {
       
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Digite um número inteiro a ser convertido para binário: ");
        int num = scnr.nextInt();
        System.out.print("O valor inteiro "+num+" convertido em número binário é = "+Converter.toBinary(num));
        System.out.println();
    }
   
}