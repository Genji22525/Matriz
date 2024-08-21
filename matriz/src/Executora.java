public class Executora {


    public void exibirMatrizRecursivamente(int[][] matriz, int i, int j) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;


        if (i >= linhas) {
            return;
        }


        System.out.print(matriz[i][j] + " ");


        if (j == colunas - 1) {
            System.out.println();  
            exibirMatrizRecursivamente(matriz, i + 1, 0);  
        } else {
            exibirMatrizRecursivamente(matriz, i, j + 1);  
        }
    }
}
 
