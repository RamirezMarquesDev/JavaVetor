## Exercicios Resolvidos Java (Vetor)
-------
#### Aluno: Ramirez Marques
------
**01 - Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.**

![Alt text](1.png)
```
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
```
**02 - Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:**

**Imprimir todos os elementos do vetor**
**Mostrar na tela a soma e a média dos elementos do vetor**

![Alt text](2.png)

```
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
```
**03 - Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também aporcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.**

![Alt text](3.png)

```
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
```
**04 - Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.**

![Alt text](4.png)

```
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
```
**05 - Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).**

![Alt text](5.png)
```
package package_LVetor;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double[]vet = new double[6];

        System.out.print("Quantos numeros você vai Digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vet[i] = sc.nextDouble();            
        }
        double test = vet[0];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (test < vet[i]) {
                test = vet[i];
                contador = i;
        }        
    }
    System.out.print("Maior Valor = " + test);
        System.out.println();
        System.out.print("Posição do Maior Valor: " + contador);

        sc.close();
    
}
}
```
**06 - Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.**

![Alt text](6.png)
```
package package_LVetor;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int []vetA = new int[6];
        int []vetB = new int[6];
        int []vetC = new int[6];

        System.out.print("Quantos Valores vai ter cada Vetor? ");
        int n = sc.nextInt();

        System.out.println("Digite os Valores do Vetor A: ");
        for (int i = 0; i < n; i++) {

            
            vetA[i] = sc.nextInt();          
        }
        System.out.println("Digite os Valores do Vetor B: ");
        for (int i = 0; i < n;i++) {
            
            vetB[i] = sc.nextInt();
            
            vetC[i] = vetA[i]+vetB[i];
            
        }
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < n;i++){

        System.out.println(vetC[i]);
        sc.close();
    }
    }
    
}

```
**07 - Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.**

![Alt text](7.png)

```
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
```
**08 - Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"**

![Alt text](8.png)
```
package package_LVetor;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int []vet = new int[6];
        double media = 0;
        int soma = 0;
        int contSoma = 0;

        System.out.print("Quantos Elementos Vai Ter o Vetor?" );
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Digite Um Número: ");
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0){
                soma += vet[i];
                contSoma++;   
            }        
    }
    if (soma > 0){
        media = (double) soma / (double) contSoma;
        System.out.print("Média Dos Pares = " + media);
        System.out.println();
    }
    else{
        System.out.println("Nenhum Número Par!");
    }
    sc.close();   
}  
}
```
**09 - Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.**

![Alt text](9.png)
```
package package_LVetor;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String []vetNome = new String[5];
        int []vetIdade = new int[5];
        int maiorIdade = vetIdade[0];
        String nomeMvelho = "Nome";

        System.out.print("Quantas Pessoas voçê vai Digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "ª Pessoa:" );
            System.out.print("Nome: ");
            vetNome[i] = sc.next();
            System.out.print("Idade: ");
            vetIdade[i] = sc.nextInt();

            if (vetIdade[i] > maiorIdade) {
                maiorIdade = vetIdade[i];
                nomeMvelho = vetNome[i];
            }           
    }
    System.out.print("Pessoa Mais Velha: " + nomeMvelho);

        sc.close();
    
}
}
```
**10 - Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).**

![Alt text](10.png)
```
package package_LVetor;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        System.out.print("Quantos Alunos Serão Digitados? ");
        int n = sc.nextInt(); 
        
        String []vetNome = new String[n];
        double []vetSemestre1 = new double[n];
        double []vetSemestre2 = new double[n];
        
        for(int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.println("Digite Nome, Primeira e Segunda Nota do " + (i + 1) + "º Aluno: ");        
            vetNome[i] = sc.nextLine();            
            vetSemestre1[i] = sc.nextDouble();          
            vetSemestre2[i] = sc.nextDouble();
                        
        }
        System.out.println("Aluno(s) Aprovado(s): ");
        for(int i = 0; i < n; i++) {
            if (vetSemestre1[i] + vetSemestre2[i] >= 12.0){
                System.out.println(vetNome[i]);
            }
        }
       sc.close();
    }    
}
```
**11 - Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.**

![Alt text](11.png)
```
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
```
**12 - Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
lucro < 10%
10% ≤ lucro ≤ 20%
lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.**

![Alt text](12.png)
```
package package_LVetor;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Serão Digitados Dados de Quantos Produtos? ");
        int n = sc.nextInt();

        String[] nomeMercadoria = new String[n];
        double[] precoCompra = new double[n];
        double[] precoVenda = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Produto: " + (i + 1));
            System.out.print("Nome: ");
            sc.nextLine(); 
            nomeMercadoria[i] = sc.nextLine();
            System.out.print("Preço de Compra: ");
            precoCompra[i] = sc.nextDouble();
            System.out.print("Preço de Venda: ");
            precoVenda[i] = sc.nextDouble();
        }

        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        int countLucroMenor10 = 0;
        int countLucroEntre10e20 = 0;
        int countLucroMaior20 = 0;

        
        for (int i = 0; i < n; i++) {
            double lucro = precoVenda[i] - precoCompra[i];
            double percentualLucro = (lucro / precoCompra[i]) * 100;

            if (percentualLucro < 10) {
                countLucroMenor10++;
            } else if (percentualLucro <= 20) {
                countLucroEntre10e20++;
            } else {
                countLucroMaior20++;
            }

            valorTotalCompra += precoCompra[i];
            valorTotalVenda += precoVenda[i];
        }

        double lucroTotal = valorTotalVenda - valorTotalCompra;

        System.out.println("Relatório: ");
        System.out.println("lucro abaixo de 10%: " + countLucroMenor10);
        System.out.println("lucro entre 10% e 20%: " + countLucroEntre10e20);
        System.out.println("lucro acima de 20%: " + countLucroMaior20);
        System.out.printf("Valor total de compra: %.2f\n" , valorTotalCompra);
        System.out.printf("Valor total de venda: %.2f\n" , valorTotalVenda);
        System.out.printf("Lucro total: %.2f\n" , lucroTotal);

        sc.close();
    }
}
```
# The End Obrigado!