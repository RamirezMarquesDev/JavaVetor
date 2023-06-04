package package_LVetor;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.print("Quantos Numeros voçê vai digitar? ");
		int n = sc.nextInt();
		int []vet = new int[6];
		
		for (int i = 0; i < n; i++ ) {
			System.out.print("Digite Um Número: ");
			vet[i] = sc.nextInt();	
		}
		System.out.println("NÚMEROS NEGATIVOS! ");
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		sc.close();
    }
    }        
	

    
