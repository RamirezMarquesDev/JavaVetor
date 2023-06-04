package package_LVetor;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qauntos Elementos Vai Ter o Vetor? ");
        double n = sc.nextDouble();
        double []vet = new double[4];
        double soma = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Digite um Número: ");
            vet[i] = sc.nextDouble();
            soma += vet[i]; 
        }
        double media = soma / n;
        System.out.print("Média do Vetor = " + media);
        System.out.println();
        System.out.println("Elementos Abaixo da Média: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] < media){
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }    
}
