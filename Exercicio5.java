package Exercicios;

import javax.swing.JOptionPane;

//Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e mostre posteriormente
//quantos s�o pares e a soma deles, bem como quantos s�o �mpares e a soma
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
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " � valor: "));
			if ((numeros[i] % 2) == 0) {
				somaPar = somaPar + numeros[i];
				quantPar = quantPar + 1;

			} else {
				somaImpar = somaImpar + numeros[i];
				quantImpar = quantImpar + 1;
			}

		}
		JOptionPane.showMessageDialog(null,
				"Soma Total N�mero Pares: " + somaPar + "\n Quantidade de n�meros pares: " + quantPar, "resultado ",
				(JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null,
				"Soma Total N�meros Impares: " + somaImpar + "\n Quantidade de n�meros impares: " + quantImpar,
				"resultado", (JOptionPane.INFORMATION_MESSAGE));
	}
}
