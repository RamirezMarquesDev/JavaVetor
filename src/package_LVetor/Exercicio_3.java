package package_LVetor;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
				System.out.print("Quantos Pessoas serão digitadas? ");
				int n = sc.nextInt();
				
				int contMenor = 0;
				double somaAltura = 0;
				
				double []altura = new double[5];
				int []idade = new int[5];
				String []nome = new String[5];
				
				for (int i = 0; i < n; i++ ) {
					
					System.out.println("Dados da Pessoa N° "+ (i+1)+" !");
					System.out.print("Nome: ");
					nome[i] = sc.next();
					System.out.print("Idade: ");
					idade[i] = sc.nextInt();
					System.out.print("Altura: ");
					altura[i] = sc.nextDouble();
					
					somaAltura += altura[i];
					
					if (idade[i] < 16) {
						contMenor = contMenor + 1 ;
					}
				}
				System.out.println(contMenor);
				double media = somaAltura / n;
				double porcentagem = ((double)contMenor /n * 100);
				System.out.printf("Altura Média: %.2f%n",media);
				System.out.printf("Pessoas Com Menos de 16 Anos: %.1f%%%n", porcentagem);
				
				for (int i = 0; i < n; i++ ) {
					if (idade[i] < 16) {
						System.out.println(nome[i]);
					}
				}
				sc.close();
			}				
	}
    
    

