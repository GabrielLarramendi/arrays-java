package applicationExAlturas;

import entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person[] people;

        System.out.print("Quantas pessoas você quer cadastras? ");
        int n = input.nextInt();

        people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();

            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            input.nextLine();
            people[i].setName(input.nextLine());
            System.out.print("Idade: ");
            people[i].setAge(input.nextInt());
            System.out.print("Altura: ");
            people[i].setHeigth(input.nextDouble());
        }

        double heigthSum = 0;
        for (int i = 0; i < people.length; i++) {
            heigthSum += people[i].getHeigth();
        }

        System.out.println();
        double heigthAvg = heigthSum / n;
        System.out.print("Altura Média = " + String.format("%.2f %n", heigthAvg));

        System.out.print("Pessoas com menos de 16 anos: ");
        int sumLessThan16 = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < 16) {
                sumLessThan16++;
            }
        }
        double lessthan16Percentual = (sumLessThan16 * 100 / n);
        System.out.println(lessthan16Percentual + "%");

        for (Person person : people) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }
        input.close();
    }
}
