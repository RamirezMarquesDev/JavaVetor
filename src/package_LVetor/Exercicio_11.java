package package_LVetor;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas Pessoas Serão Digitadas? ");
        int n = sc.nextInt();
        
        double []vetAltura = new double[n];
        char []vetGen = new char[n];
        double maior = 0;
        double menor = 0;
        double somaMulher = 0;
        double contMulher = 0;
        int contHomem = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "ª Pessoa: ");
            vetAltura[i] = sc.nextDouble();
            System.out.print("Gênero da " + (i+1) + "ª Pessoa: ");
            vetGen[i] = sc.next().charAt(0);

            if (vetGen[i] == 'f'){
                contMulher++;
                somaMulher += vetAltura[i];
            }
            else {
                contHomem++;
            }

            if (i == 0) {
                menor = vetAltura[i]; 
            } else if (vetAltura[i] < menor) {
                menor = vetAltura[i];
            }

            if (vetAltura[i] > maior){
                maior = vetAltura[i];
            }
        }

        System.out.println("Menor Altura = " + menor);
        System.out.println("Maior Altura = " + maior);
        System.out.printf("Média das Mulheres = %.2f%n", somaMulher / contMulher);
        System.out.println("Números de Homens = " + contHomem);

        sc.close();
    }
    }
