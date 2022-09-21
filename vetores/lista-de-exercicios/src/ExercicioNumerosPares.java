import java.util.Scanner;

public class ExercicioNumerosPares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = input.nextInt();
        }

        System.out.println();
        int evenQuantity = 0;
        System.out.println("NUMEROS PARES: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                evenQuantity++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Quantidade de PARES = " + evenQuantity);

        input.close();
    }

/*    public static int[] isEven(int[] numbers) {

        int evenQuantity = 0;

        for (int number: numbers) {
            if (number % 2 == 0) {
                evenQuantity++;
            }
        }
        int[] evenNumbers;
        evenNumbers = new int[evenQuantity];

        for (int number : numbers) {
            if (number % 2 == 0) {

            }
        }

        return evenNumbers;
    }*/
}
