import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas alturas vocẽ gostaria de cadastrar? ");
        int n = input.nextInt();

        double[] heigthArray;
        heigthArray = new double[n];

        for (int i = 0; i < heigthArray.length; i ++) {
            System.out.print("Digite a altura da " + (i + 1) + "ª pessoa: ");
            heigthArray[i] = input.nextDouble();
        }

        double heigthSum = 0.0;
        for (int i = 0; i < heigthArray.length; i ++) {
            heigthSum += heigthArray[i];
        }

        double heigthAverage = heigthSum / n;
        System.out.println();
        System.out.println("A média de todas as "
                            + heigthArray.length
                            + " alturas"
                            + " é igual a: "
                            + String.format("%.2f", heigthAverage)
                            + " metros.");

        input.close();
    }
}
