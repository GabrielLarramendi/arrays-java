import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas e quantas colunas a matriz terá? ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        int sumNegativeNumbers = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) {
                    sumNegativeNumbers++;
                }
            }
        }

        System.out.println();
        System.out.println("Diagonal principal: ");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.print("Numeros negativos = ");
        System.out.println(sumNegativeNumbers);

        sc.close();
    }
}