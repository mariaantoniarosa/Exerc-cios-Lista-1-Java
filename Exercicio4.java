package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um algoritmo que mostre a soma de todos os valores pares entre o
		// intervalo de dois números digitados pelo usuário.
		int valor1 = 0;
		int valor2 = 0;
		int aux = 0;
		int soma = 0;

		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		if (valor1 > valor2) {
			aux = valor1;
			valor1 = valor2;
			valor2 = aux;
		}

		for (int i = valor1; i <= valor2; i++) {
			if (i % 2 == 0) {
				soma = soma + i;

			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos numeros pares é " + soma, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
