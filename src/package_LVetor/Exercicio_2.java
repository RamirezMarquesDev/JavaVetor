package package_LVetor;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.print("Quantos Numeros voçê vai digitar? ");
		int n = sc.nextInt();
		double []vet = new double[4];
		double soma = 0;
		
		for (int i = 0; i < n; i++ ) {
			System.out.print("Digite Um Número: ");
			vet[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++ ) {
			soma += vet[i];	
		}
		double media = soma / n;
		
		System.out.println("Valores: ");
		for (int i = 0; i < n; i++ ) {
			System.out.printf(" %.1f", vet[i]);
		}
		System.out.println();
		System.out.printf("Soma= %.2f%n", soma);
		System.out.printf("Média= %.2f%n", media);
        sc.close();
	}
    }
    

