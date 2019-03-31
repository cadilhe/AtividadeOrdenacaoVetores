package ordenacaovetores.main;

import static ordenacaovetores.Metodos.clonar;
import static ordenacaovetores.Metodos.mergeSort;
import java.util.Random;

public class MergeSortMain {

    public static int[] vetor1;
    public static int[] vetor2;
    public static int[] vetor3;
    public static int[] vetor4;

    public static void main(String[] args) {
        // Tamanhos n(x) para cada vetor(x)
        int n1 = 1000; // tamanho vetor1
        int n2 = 5000; // tamanho vetor2
        int n3 = 10000;// tamanho vetor3
        int n4 = 30000;// ramanho vetor4

        // Definir tamanho n para cada vetor x
        vetor1 = new int[n1];
        vetor2 = new int[n2];
        vetor3 = new int[n3];
        vetor4 = new int[n4];

        // Criando vetores com valores randômicos
        int[] vetor1Random = new int[n1];
        int[] vetor2Random = new int[n2];
        int[] vetor3Random = new int[n3];
        int[] vetor4Random = new int[n4];

        // Vetores com valores em ordem crescente
        int[] vetor1Crescente = new int[n1];
        int[] vetor2Crescente = new int[n2];
        int[] vetor3Crescente = new int[n3];
        int[] vetor4Crescente = new int[n4];

        // Vetores com valores em ordem decrescente
        int[] vetor1Decrescente = new int[n1];
        int[] vetor2Decrescente = new int[n2];
        int[] vetor3Decrescente = new int[n3];
        int[] vetor4Decrescente = new int[n4];

        Random num = new Random();

        // Populando os vetores
        // n1 = 1000 elementos
        for (int i = 0, j = n1; i < n1; i++, j--) {
            vetor1Random[i] = num.nextInt();
            vetor1Crescente[i] = i + 1;
            vetor1Decrescente[i] = j;
        }
        // n2 = 5000 elementos
        for (int i = 0, j = n2; i < n2; i++, j--) {
            vetor2Random[i] = num.nextInt();
            vetor2Crescente[i] = i + 1;
            vetor2Decrescente[i] = j;
        }
        // n3 = 10000 elementos
        for (int i = 0, j = n3; i < n3; i++, j--) {
            vetor3Random[i] = num.nextInt();
            vetor3Crescente[i] = i + 1;
            vetor3Decrescente[i] = j;
        }
        // n4 = 30000 elementos
        for (int i = 0, j = n4; i < n4; i++, j--) {
            vetor4Random[i] = num.nextInt();
            vetor4Crescente[i] = i + 1;
            vetor4Decrescente[i] = j;
        }

        // Declarando variáveis para medir o tempo de execução        
        long inicio;
        long fim;
        long tempo;

// Início da aplicação dos métodos
// 4. MÉTODO MERGE SORT         
        System.out.println("===========================================================");
        System.out.println("4. Ordenação com MERGE SORT: ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nº de elementos \t\tTempo (Milissegundos)");
        System.out.println("------------------------------------------------------");

        // Valores aleatórios 
        System.out.println("----------------------------------------");
        System.out.println("Valores aleatórios (Merge Sort): ");
        clonar(vetor1Random, vetor2Random, vetor3Random, vetor4Random);

        // n1 =1.000 valores aleatórios  
        inicio = System.currentTimeMillis();
        mergeSort(vetor1, 0, (vetor1.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n1 + " \t\t\t\t" + tempo);

        // n2 = 5.000 valores aleatórios 
        inicio = System.currentTimeMillis();
        mergeSort(vetor2, 0, (vetor2.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n2 + " \t\t\t\t" + tempo);

        // n3 = 10.000 valores aleatórios 
        inicio = System.currentTimeMillis();
        mergeSort(vetor3, 0, (vetor3.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n3 + " \t\t\t\t" + tempo);

        // n4 = 25.000 valores aleatórios 
        inicio = System.currentTimeMillis();
        mergeSort(vetor4, 0, (vetor4.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n4 + " \t\t\t\t" + tempo);

        // Valores em ordem crescente
        System.out.println("----------------------------------------");
        System.out.println("Valores crescentes (Merge Sort):");
        clonar(vetor1Crescente, vetor2Crescente, vetor3Crescente, vetor4Crescente);

        // n1 = 1.000 valores em ordem crescente 
        inicio = System.currentTimeMillis();
        mergeSort(vetor1, 0, (vetor1.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n1 + " \t\t\t\t" + tempo);

        // n2 = 5.000 valores em ordem crescente 
        inicio = System.currentTimeMillis();
        mergeSort(vetor2, 0, (vetor2.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n2 + " \t\t\t\t" + tempo);

        // n3 = 10.000 valores em ordem crescente 
        inicio = System.currentTimeMillis();
        mergeSort(vetor3, 0, (vetor3.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n3 + " \t\t\t\t" + tempo);

        // n4 = 25.000 valores em ordem crescente 
        inicio = System.currentTimeMillis();
        mergeSort(vetor4, 0, (vetor4.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n4 + " \t\t\t\t" + tempo);

        // Valores em ordem decrescente
        System.out.println("----------------------------------------");
        System.out.println("Valores decrescentes (Merge Sort):");
        clonar(vetor1Decrescente, vetor2Decrescente, vetor3Decrescente, vetor4Decrescente);

        // n1 = 1.000 valores em ordem decrescente
        inicio = System.currentTimeMillis();
        mergeSort(vetor1, 0, (vetor1.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n1 + " \t\t\t\t" + tempo);

        // n2 = 5.000 valores em ordem decrescente
        inicio = System.currentTimeMillis();
        mergeSort(vetor2, 0, (vetor2.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n2 + " \t\t\t\t" + tempo);

        // n3 = 10.000 valores em ordem decrescente
        inicio = System.currentTimeMillis();
        mergeSort(vetor3, 0, (vetor3.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n3 + " \t\t\t\t" + tempo);

        // n4 = 25.000 valores em ordem decrescente
        inicio = System.currentTimeMillis();
        mergeSort(vetor4, 0, (vetor4.length - 1));
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println(n4 + " \t\t\t\t" + tempo);
        System.out.println("");
    }
}
