public class Matriz {
    private int[][] matriz;


    public Matriz() {
        matriz = new int[3][3];
    }


    public void preencherMatrizComValoresPredefinidos() {
        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor++;
            }
        }
        System.out.println("Matriz preenchida com valores predefinidos.");
    }


    public void exibirMatriz() {
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int[][] getMatriz() {
        return matriz;
    }
}
