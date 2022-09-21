package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos produtos você quer cadastrar? ");
        int n = input.nextInt();

        Product[] produtos;
        produtos = new Product[n];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o NOME do " + (i + 1) + "º produto: ");
            String name = input.next();
            System.out.print("Digite o PREÇO do " + (i + 1) + "º produto: ");
            double price = input.nextDouble();

            Product produto = new Product(name, price);
            produtos[i] = produto;
        }

        System.out.println("==================================");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

        double priceSum = 0;
        for (int i = 0; i < produtos.length; i++) {
            priceSum += produtos[i].getPrice();
        }

        System.out.println("==================================");
        double priceAvg = priceSum / n;
        System.out.println("Média dos preços: R$ " + priceAvg);

        input.close();
    }
}
