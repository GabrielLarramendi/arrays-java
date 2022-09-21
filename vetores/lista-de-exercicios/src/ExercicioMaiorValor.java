import java.util.Scanner;

public class ExercicioMaiorValor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você irá digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        double highestValue = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
            }
        }

        System.out.println();
        System.out.print("Maior valor da Array = " + String.format("%.1f %n", highestValue));

        System.out.print("Posição do maior valor = ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == highestValue) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
