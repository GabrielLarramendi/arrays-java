package application;

import entities.TestClass;

public class Project {
    public static void main(String[] args) {
        TestClass produto1 = new TestClass("TV", 1000.00, 10);
        TestClass produto2 = produto1;

        System.out.println(produto1);
        System.out.println(produto2);

        produto1.setQuantity(15);

        lineGenerate();
        System.out.println(produto1);
        System.out.println(produto2);

        produto2.setName("Computer");

        lineGenerate();
        System.out.println(produto1);
        System.out.println(produto2);

        lineGenerate();
        TestClass p3 = new TestClass("Headphones", 200.00, 5);
        TestClass p4 = new TestClass("JBL", 70.00, 15);

        System.out.println(p3);
        System.out.println(p4);

        lineGenerate();
        p3 = p4;
        System.out.println(p3);
        System.out.println(p4);



    }

    public static void lineGenerate(){
        System.out.println("=======================================");
    }
}
