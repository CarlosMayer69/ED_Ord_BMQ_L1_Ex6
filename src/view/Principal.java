package view;

import br.edu.fateczl.bubblesort.BubbleSort;
import br.edu.fateczl.mergesort.MergeSort;
import br.edu.fateczl.quicksort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[1500];
		for (int i = 0; i < vetor.length; i++) {
        vetor[i] = vetor.length - i - 1;
    }

    // Bubble Sort
	BubbleSort bubbleSort = new BubbleSort();
    long startTime = System.currentTimeMillis();
    bubbleSort.bubbleSort(vetor.clone()); 
    // clone() para n�o modificar o vetor original
    long endTime = System.currentTimeMillis();
    System.out.println("Tempo de execu��o do Bubble Sort: " + (endTime - startTime) + " ms");

    // Merge Sort
    MergeSort mergeSort = new MergeSort();
    startTime = System.currentTimeMillis();
    mergeSort.mergeSort(vetor.clone(), 0, vetor.length - 1); 
    // clone() para n�o modificar o vetor original
    endTime = System.currentTimeMillis();
    System.out.println("Tempo de execu��o do Merge Sort: " + (endTime - startTime) + " ms");

    // Quick Sort
    QuickSort quickSort = new QuickSort();
    startTime = System.currentTimeMillis();
    quickSort.quickSort(vetor.clone(), 0, vetor.length - 1); 
    // clone() para n�o modificar o vetor original
    endTime = System.currentTimeMillis();
    System.out.println("Tempo de execu��o do Quick Sort: " + (endTime - startTime) + " ms");

	}

}

/* A fun��o clone() em Java � um m�todo da classe Objeto, 
 * que � a superclasse de todas as classes em Java. 
 * Este m�todo � usado para criar uma c�pia superficial 
 * de um objeto. 
 * Portanto, igual para todos os ordenamentos da tarefa.
 * Quando chama o m�todo clone() em um vetor, 
 * como em vetor.clone(), est� criando 
 * uma c�pia superficial do vetor. 
 */
