import java.util.Scanner;

public class EcercicioAbaixoDaMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros terá a array? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        double soma = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            soma += numbers[i];
        }

        System.out.println();
        double avg = soma / n;
        System.out.println("Média do vetor = " + String.format("%.3f", avg));

        System.out.println("Elementos abaixo da média: ");
        for (double number : numbers) {
            if (number < avg) {
                System.out.println(String.format("%.1f", number));
            }
        }

        sc.close();
    }
}
