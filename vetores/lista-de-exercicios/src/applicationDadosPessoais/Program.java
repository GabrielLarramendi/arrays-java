package applicationDadosPessoais;

import entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Person[] people = new Person[n];

        double highestHieght = 0.0;
        double smallerHeight = 0.0;
        int manQuantity = 0;
        int wemenQuantity = 0;
        double sumWemenHeight = 0.0;

        for (int i = 0; i < people.length; i++) {
            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            double heigth = sc.nextDouble();
            System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
            char gender = sc.next().charAt(0);

            people[i] = new Person(heigth, gender);

            if (i == 0) {
                smallerHeight = people[i].getHeigth();
            }

            if (people[i].getHeigth() > highestHieght) {
                highestHieght =  people[i].getHeigth();
            }

            if (people[i].getHeigth() < smallerHeight) {
                smallerHeight = people[i].getHeigth();
            }

            if (people[i].getGender() == 'M') {
                manQuantity ++;
            }

            if (people[i].getGender() == 'F') {
                wemenQuantity++;
            }

            if (people[i].getGender() == 'F') {
                sumWemenHeight += people[i].getHeigth();
            }
        }

        double avgWemenHeight = sumWemenHeight / wemenQuantity;

        System.out.println("MENOR ALTURA = " + String.format("%.2f", smallerHeight));
        System.out.println("MAIOR ALTURA = " + String.format("%.2f", highestHieght));
        System.out.println("Média da altura das mulheres = "  + String.format("%.2f", avgWemenHeight));
        System.out.println("Numero de homens = " + manQuantity);

        sc.close();
    }
}
