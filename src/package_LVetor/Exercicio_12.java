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
    

