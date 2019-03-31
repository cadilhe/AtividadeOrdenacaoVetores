/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import static main.SortMainTemplate.vetor1;
import static main.SortMainTemplate.vetor2;
import static main.SortMainTemplate.vetor3;
import static main.SortMainTemplate.vetor4;

/**
 *
 * @author nimb
 */
public class FireUp {
    
    public static void fireup(){
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
    
}
    
}
