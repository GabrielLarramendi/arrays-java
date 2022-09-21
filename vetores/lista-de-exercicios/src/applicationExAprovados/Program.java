package applicationExAprovados;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
            sc.nextLine();
            students[i].setName(sc.nextLine());
            students[i].setGrade1(sc.nextDouble());
            students[i].setGrade2(sc.nextDouble());
        }

        System.out.println("Alunos aprovados: ");
        for (Student student : students) {
            double avgStudentGrades = (student.getGrade1() + student.getGrade2()) / 2;
            if (avgStudentGrades  >= 6.0) {
                System.out.println(student.getName());
            }
        }

        sc.close();
    }
}
