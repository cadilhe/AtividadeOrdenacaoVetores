package metodos;

import static metodos.MainTodosMetodos.vetor1;
import static metodos.MainTodosMetodos.vetor2;
import static metodos.MainTodosMetodos.vetor3;
import static metodos.MainTodosMetodos.vetor4;

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

    // Bubble Sort
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

    // Selection Sort
    public static void selectionSort(int[] vetor, int N) {
        for (int fixo = 0; fixo < (N - 1); fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < N; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vetor[fixo];
                vetor[fixo] = vetor[menor];
                vetor[menor] = t;
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            int a = vetor[i];
            for (int j = (i - 1); j >= 0 && vetor[j] > a; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = a;
            }
        }
    }

    // Merge Sort
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

    // Heap Sort
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

    // Shell Sort
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

    /*
// Counting Sort 1
    public static void countingSort(int v[]) {
		
	int maior = v[0];
	for (int i = 1; i < v.length; i++) {
		    if (v[i] > maior) {
				maior = v[i];
			}
		}
		
// frequencia
	int[] c = new int[maior];
	for (int i = 0; i < v.length; i++) {
			c[v[i] -1] += 1;
		}
		
// cumulativa
	for (int i = 1; i < maior; i++) {
			c[i] += c[i-1];
		}
		
	Integer[] b = new Integer[v.length];
	for (int i = 0; i < b.length; i++) {
			b[c[v[i] -1] -1] = v[i];
			c[v[i] -1]--;
		}
		
	for (int i = 0; i < b.length; i++) {
			v[i] = b[i];
		}
	}
    
    
     
    // Counting Sort 2
    public static void countingSort(int vetor[], int esquerda, int direita) {

        //Encontrar o maior valor 
        int k = 0;
        for (int m = esquerda; m < direita; m++) {
            if (vetor[m] > k) {
                k = vetor[m];
            }
        }

        //Cria vetor com o tamanho do maior elemento
        int[] vetorTemporario = new int[k];

        //Inicializar com zero o vetor temporario
        for (int i = 0; i < vetorTemporario.length; i++) {
            vetorTemporario[i] = 0;
        }

        //Contagem das ocorrencias no vetor desordenado
        for (int j = esquerda; j < direita; j++) {
            vetorTemporario[vetor[j]] += 1;
        }

        //Fazendo o  complemento do numero anterior 
        for (int i = esquerda; i < k; i++) {
            vetorTemporario[i] = vetorTemporario[i] + vetorTemporario[i - 1];
        }

        //Ordenando o vetor da direita para a esquerda
        int[] vetorAuxiliar = new int[vetor.length];
        for (int j = direita; j > esquerda; j--) {
            vetorAuxiliar[vetorTemporario[vetor[j]]] = vetor[j];
            vetorTemporario[vetor[j]] -= 1;
        }

        //Retornando os valores ordenados para o vetor de entrada
        for (int i = esquerda; i < direita; i++) {
            vetor[i] = vetorAuxiliar[i];
        }
    }

     // Counting Sort 3
    public static void countingSort(int[] vetor, int k) {
        // create buckets 
        int counter[] = new int[k + 1];
        // fill buckets 
        for (int i : vetor) {
            counter[i]++;
        }
        // sort vetor 
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                vetor[ndx++] = i;
                counter[i]--;
            }
        }
    }
 */   
    // Counting Sorte
    public static void countingSort(int[] vetor, int min, int max){
	int[] count= new int[max - min + 1];
	for(int number : vetor){
		count[number - min]++;
	}
	int z= 0;
	for(int i= min;i <= max;i++){
		while(count[i - min] > 0){
			vetor[z]= i;
			z++;
			count[i - min]--;
		}
	}
}

    // Quick Sort
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
