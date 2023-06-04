package package_LVetor;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Quantos Números você vai Digitar? ");
       int n = sc.nextInt();

       int contador = 0;
       int []vet = new int [6];

       for (int i = 0; i < n; i++) {

        System.out.print("Digite um Número: ");
        vet[i] = sc.nextInt(); 

    }   System.out.println("Números Pares: ");
        for (int i = 0; i < n; i++) {

            if (vet[i] % 2 == 0) {
                contador ++;
                System.out.print(" "+vet[i]);
                 
            }    
    }
    System.out.println();
    System.out.print("Quantidade de Pares = "+contador);
    sc.close();
    }
    }
