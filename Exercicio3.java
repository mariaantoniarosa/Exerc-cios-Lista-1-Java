package Exercicios;

import javax.swing.JOptionPane;

//Fa�a um programa que pe�a ao usu�rio para informar 03 n�meros e mostre o
//menor entre eles. Considere que o usu�rio n�o poder� informar n�meros
//iguais.
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo n�mero: "));
		while (num1 == num2) {
			num2 = Integer
					.parseInt(JOptionPane.showInputDialog("N�mero repetido, por favor digite novamente outro n�mero"));
		}
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero: "));
		while ((num3 == num2) || (num3 == num1)) {
			num3 = Integer
					.parseInt(JOptionPane.showInputDialog("N�mero repetido, por favor digite novamente outro n�mero"));
		}

		if ((num1 < num2) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null, num1, "O menor n�mero � o primeiro ", JOptionPane.INFORMATION_MESSAGE);
		} else if ((num2 < num1) && (num2 < num3)) {
			JOptionPane.showMessageDialog(null, num2, "O menor n�mero � o segundo ", JOptionPane.INFORMATION_MESSAGE);
		} else if ((num3 < num2) && (num3 < num1)) {
			JOptionPane.showMessageDialog(null, num3, "O menor n�mero � o terceiro  ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
