import java.util.Scanner;

public class ExercicioSomaDeVetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada Array? ");
        int n = sc.nextInt();

        int[]  a = new int[n],
               b = new int[n];

        System.out.println("Digite os valores da Array A:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores da Array B:");
        for (int i = 0; i < a.length; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = arrayResultante(a, b);
        System.out.println("VETOR RESULTANTE: ");
        for (int number : c) {
            System.out.println(number);
        }

        //System.out.println(c);

/*      System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }*/

        sc.close();
    }

    public static int[] arrayResultante(int[] arrayA, int[] arrayB) {

        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        return arrayC;
    }
}
