//3. Construir uma fun��o recursiva que receba um vetor e seu tamanho e apresente a quantidade de n�meros pares existentes no vetor. Considere que a entrada deve ser, apenas de n�meros naturais diferentes de zero.
package controller;

public class ControllerPar {
	
	public ControllerPar() {
		super();
	}
	
	public int contarPares(int[] vet, int tamanho) {
		int pares = 0;
		if(tamanho == 0) {
			return pares;
		} else if(vet[tamanho - 1] % 2 == 0) {
			pares++;
			return pares + contarPares(vet, tamanho - 1);
		} else {
			return pares + contarPares(vet, tamanho - 1);
		}
	}
}
