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
    // clone() para não modificar o vetor original
    long endTime = System.currentTimeMillis();
    System.out.println("Tempo de execução do Bubble Sort: " + (endTime - startTime) + " ms");

    // Merge Sort
    MergeSort mergeSort = new MergeSort();
    startTime = System.currentTimeMillis();
    mergeSort.mergeSort(vetor.clone(), 0, vetor.length - 1); 
    // clone() para não modificar o vetor original
    endTime = System.currentTimeMillis();
    System.out.println("Tempo de execução do Merge Sort: " + (endTime - startTime) + " ms");

    // Quick Sort
    QuickSort quickSort = new QuickSort();
    startTime = System.currentTimeMillis();
    quickSort.quickSort(vetor.clone(), 0, vetor.length - 1); 
    // clone() para não modificar o vetor original
    endTime = System.currentTimeMillis();
    System.out.println("Tempo de execução do Quick Sort: " + (endTime - startTime) + " ms");

	}

}

/* A função clone() em Java é um método da classe Objeto, 
 * que é a superclasse de todas as classes em Java. 
 * Este método é usado para criar uma cópia superficial 
 * de um objeto. 
 * Portanto, igual para todos os ordenamentos da tarefa.
 * Quando chama o método clone() em um vetor, 
 * como em vetor.clone(), está criando 
 * uma cópia superficial do vetor. 
 */
