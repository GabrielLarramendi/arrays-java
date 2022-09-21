public class ArrayNotes {
    public static void main(String[] args) {

    /*    int[] anArray; // Declara a array => Tipo e nome;
        anArray = new int[10]; //Aloca na memória a Array com o tamanho dela;

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Elemento no índice [0]: " + anArray[0]);
        System.out.println("Elemento no índice [1]: " + anArray[1]);
        System.out.println("Elemento no índice [2]: " + anArray[2]);
        System.out.println("Elemento no índice [3]: " + anArray[3]);
        System.out.println("Elemento no índice [4]: " + anArray[4]);
        System.out.println("Elemento no índice [5]: " + anArray[5]);
        System.out.println("Elemento no índice [6]: " + anArray[6]);
        System.out.println("Elemento no índice [7]: " + anArray[7]);
        System.out.println("Elemento no índice [8]: " + anArray[8]);
        System.out.println("Elemento no índice [9]: " + anArray[9]);*/

        int[] anArray02;
        anArray02 = new int[10];

        for (int i = 0; i < anArray02.length; i++) {
            anArray02[i] = 100 * (i + 1);
        }

        for (int i = 0; i < anArray02.length; i++){
            System.out.println("Elemento no índice [" + i + "]: " + anArray02[i]);
        }

        int[] anArray03 = {
                //Outra maneira de declarar Arrays. O tamanho dela será a quantidade de números colocados e separados por vírgula;
                100, 200, 300, 400,
                500, 600, 700, 800,
                900, 1000
        };

        System.out.println(anArray03);
        for (int i = 0; i < anArray02.length; i++){
            System.out.println("Elemento no índice [" + i + "]: " + anArray03[i]);
        }
    }
}
