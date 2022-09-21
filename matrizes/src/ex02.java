import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas matriz terá? ");
        int m = sc.nextInt();
        System.out.print("E quantas colunas? ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Qual número você deseja saber saber informações dele dentro da matriz? ");
        int x = sc.nextInt();

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if(j <= (n - 1) && j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if(j >= 0 && j < 2) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if(i <= 2 && i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if(i >= 0 && i < 2) {
                        System.out.println("Down " + matriz[i + 1][j]);
                    }
                }

            }
        }
    }
}
