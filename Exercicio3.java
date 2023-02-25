package Exercicios;

import javax.swing.JOptionPane;

//Faça um programa que peça ao usuário para informar 03 números e mostre o
//menor entre eles. Considere que o usuário não poderá informar números
//iguais.
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
		while (num1 == num2) {
			num2 = Integer
					.parseInt(JOptionPane.showInputDialog("Número repetido, por favor digite novamente outro número"));
		}
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero: "));
		while ((num3 == num2) || (num3 == num1)) {
			num3 = Integer
					.parseInt(JOptionPane.showInputDialog("Número repetido, por favor digite novamente outro número"));
		}

		if ((num1 < num2) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null, num1, "O menor número é o primeiro ", JOptionPane.INFORMATION_MESSAGE);
		} else if ((num2 < num1) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, num2, "O menor número é o segundo ", JOptionPane.INFORMATION_MESSAGE);
		} else if ((num3 < num2) && (num3 < num1)) {
			JOptionPane.showMessageDialog(null, num3, "O menor número é o terceiro  ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
