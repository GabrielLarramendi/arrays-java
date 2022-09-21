import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("quantos numeros voce quer digitar? ");
        int n = sc.nextInt();
        int[] numbers= new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Números Negativos: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " - ");
        }

        sc.close();
    }
}