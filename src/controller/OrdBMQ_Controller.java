package controller;

import br.edu.fateczl.bubblesort.BubbleSort;
import br.edu.fateczl.mergesort.MergeSort;
import br.edu.fateczl.quicksort.QuickSort;

public class OrdBMQ_Controller {

	public OrdBMQ_Controller() {
		super();
	}

	public int[] ordenar_bs(int[] vetor) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.bubbleSort(vetor);
	}
	
	public int[] ordenar_ms(int[] vetor) {
		MergeSort mergeSort = new MergeSort();
		return mergeSort.mergeSort(vetor, 0, vetor.length - 1); 
	}
	
	public int[] ordenar_qs(int[] vetor) {
		QuickSort quickSort = new QuickSort();
		return quickSort.quickSort(vetor, 0, vetor.length - 1);
	}
}
