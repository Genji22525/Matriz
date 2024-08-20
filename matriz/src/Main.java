public class Main {
    public static void main(String[] args) {

        Matriz matrizObj = new Matriz();


        matrizObj.preencherMatrizComValoresPredefinidos();


        matrizObj.exibirMatriz();

        
        Executora executora = new Executora();
        System.out.println("\nExibindo recursivamente:");
        executora.exibirMatrizRecursivamente(matrizObj.getMatriz(), 0, 0);
    }
}
