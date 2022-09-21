import java.util.Scanner;

public class ExercicioMediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros terá a array? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        double somaPares = 0;
        int quantPares = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                somaPares += numbers[i];
                quantPares ++;
            }
        }

        if (quantPares != 0) {
            double avgPares = somaPares / quantPares;
            System.out.println("MEDIA DOS PARES = " + avgPares);
        } else {
            System.out.println("NENHUM NUMERO PAR!");
        }

        sc.close();
    }
}
