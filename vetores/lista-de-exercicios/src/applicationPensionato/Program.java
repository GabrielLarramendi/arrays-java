package applicationPensionato;

import entities.Guest;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Guest[] guests = new Guest[10];

        System.out.print("Quantos quartos serão reservados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            guests[room] = new Guest(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println(i + ": " + guests[i]);
            }
        }
        sc.close();

/*        for (Guest guest : guests) {
            System.out.println(guest);*/
    }
}

