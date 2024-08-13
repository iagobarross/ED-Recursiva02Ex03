package view;

import controller.ControllerPar;

public class Principal {

	public static void main(String[] args) {
		ControllerPar contPar = new ControllerPar();
		int[] vetor = {2,5,6,13,15,20, 14};
		int tamanho = vetor.length;
		
		int pares = contPar.contarPares(vetor, tamanho);
		System.out.println("Existem " + pares + " números pares no vetor.");
	}

}