import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.println();
        double sum = 0,
                avg = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("SOMA = " + String.format("%.2f", (sum)));
        System.out.println("MEDIA = " + String.format("%.2f", (sum / n)));

        sc.close();
    }
}
