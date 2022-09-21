public class anotacoes {
    public static void main(String[] args) {
        int x = 13;
        Object obj = x;
        System.out.println(obj);

        int y = (int) obj; //Esse cast é necessario pq Objetc não é a wrapper class equivalente de int;
        //Caso obj fosse da wrapper Integer, não precisaria do cast, o java ja converte automaticamente;
    }
}
