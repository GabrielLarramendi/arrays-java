package applicationExMaisVelho;

import entities.Person01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Person01[] people = new Person01[n];

        int highestAge = 0;
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person01();
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            people[i].setName(sc.nextLine());
            System.out.print("Idade: ");
            people[i].setAge(sc.nextInt());

            if (people[i].getAge() > highestAge) {
                highestAge = people[i].getAge();
            }
        }

        System.out.println();
        System.out.println("Pessoa(s) mais velha(s): ");
        for (Person01 person : people) {
            if (person.getAge() == highestAge) {
                System.out.println(person.getName() + " ");
            }
        }

        sc.close();
    }
}