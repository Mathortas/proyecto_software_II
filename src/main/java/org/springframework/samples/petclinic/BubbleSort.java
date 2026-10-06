package org.springframework.samples.petclinic;

public class BubbleSort {

	public void bubbleSort(int[] vet) {
		int aux;
		for (int i = vet.length; i >= 2; i--) {
			for (int j = 0; j <= i - 2; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
	}

}