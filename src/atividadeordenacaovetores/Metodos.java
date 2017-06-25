package atividadeordenacaovetores;

import static atividadeordenacaovetores.Main.vetor1;
import static atividadeordenacaovetores.Main.vetor2;
import static atividadeordenacaovetores.Main.vetor3;
import static atividadeordenacaovetores.Main.vetor4;

/**
 *
 * @author Carlos Cadilhe
 */
public class Metodos {

    public static void clonar(int v1[], int v2[], int v3[], int v4[]) {
        vetor1 = v1.clone();
        vetor2 = v2.clone();
        vetor3 = v3.clone();
        vetor4 = v4.clone();
    }

    public static void insertionSort(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            int a = vetor[i];
            for (int j = (i - 1); j >= 0 && vetor[j] > a; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = a;
            }
        }
    }

    public static void bubbleSort(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void mergeSort(int vetor[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge2(vetor, inicio, meio, fim);
        }
    }

    public static void merge2(int vetor[], int inicio, int meio, int fim) {
        int posLivre = inicio;
        int inicioVetor1 = inicio;
        int inicioVetor2 = meio + 1;
        int aux[] = new int[vetor.length];

        while (inicioVetor1 <= meio && inicioVetor2 <= fim) {
            if (vetor[inicioVetor1] <= vetor[inicioVetor2]) {
                aux[posLivre] = vetor[inicioVetor1];
                inicioVetor1++;
            } else {
                aux[posLivre] = vetor[inicioVetor2];
                inicioVetor2++;
            }
            posLivre++;
        }
        for (int i = inicioVetor1; i <= meio; i++) {
            aux[posLivre] = vetor[i];
            posLivre++;
        }
        for (int i = inicioVetor2; i <= fim; i++) {
            aux[posLivre] = vetor[i];
            posLivre++;
        }
        for (int i = inicio; i <= fim; i++) {
            vetor[i] = aux[i];
        }
    }

    public static void heapSort(int vetor[]) {
        heap2(vetor);
        int n = vetor.length;

        for (int i = vetor.length - 1; i > 0; i--) {
            heap4(vetor, i, 0);
            heap3(vetor, 0, --n);
        }
    }

    public static void heap2(int[] vetor) {
        for (int i = vetor.length / 2 - 1; i >= 0; i--) {
            heap3(vetor, i, vetor.length);
        }
    }

    public static void heap3(int[] vetor, int pos, int tamanhoDoVetor) {
        int max = 2 * pos + 1, right = max + 1;
        if (max < tamanhoDoVetor) {
            if (right < tamanhoDoVetor && vetor[max] < vetor[right]) {
                max = right;
            }
            if (vetor[max] > vetor[pos]) {
                heap4(vetor, max, pos);
                heap3(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public static void heap4(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }

    public static void shellSort(int vetor[]) {
        int i, j, h = 1, ok;
        do {
            h = 3 * h + 1;
        } while (h < vetor.length);
        do {
            h = h / 3;
            for (i = h; i < vetor.length; i++) {
                ok = vetor[i];
                j = i - h;
                while (j >= 0 && ok < vetor[j]) {
                    vetor[j + h] = vetor[j];
                    j = j - h;
                }
                vetor[j + h] = ok;
            }
        } while (h > 1);
    }

    public static void quickSort(int v[], int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = v[(esq + dir) / 2];
        int troca;
        while (esq <= dir) {
            while (v[esq] < pivo) {
                esq = esq + 1;
            }
            while (v[dir] > pivo) {
                dir = dir - 1;
            }
            if (esq <= dir) {
                troca = v[esq];
                v[esq] = v[dir];
                v[dir] = troca;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda) {
            quickSort(v, esquerda, dir);
        }
        if (esq < direita) {
            quickSort(v, esq, direita);
        }
    }

}
