package Exercicios;

import javax.swing.JOptionPane;

//Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente
//quantos são pares e a soma deles, bem como quantos são ímpares e a soma
//deles.
public class Exercicio5 {

	public static void main(String[] args) {
		int somaPar = 0;
		int quantPar = 0;
		int somaImpar = 0;
		int quantImpar = 0;
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " º valor: "));
			if ((numeros[i] % 2) == 0) {
				somaPar = somaPar + numeros[i];
				quantPar = quantPar + 1;

			} else {
				somaImpar = somaImpar + numeros[i];
				quantImpar = quantImpar + 1;
			}

		}
		JOptionPane.showMessageDialog(null,
				"Soma Total Número Pares: " + somaPar + "\n Quantidade de números pares: " + quantPar, "resultado ",
				(JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null,
				"Soma Total Números Impares: " + somaImpar + "\n Quantidade de números impares: " + quantImpar,
				"resultado", (JOptionPane.INFORMATION_MESSAGE));
	}
}
