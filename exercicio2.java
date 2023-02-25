package Exercicios;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maioridade = 0;
		int idade = 0;

		maioridade = Integer.parseInt(JOptionPane.showInputDialog("Insira a maioridade civil de seu país/estado: "));
		while (maioridade < 0) {
			maioridade = Integer.parseInt(JOptionPane.showInputDialog("Erro: Insira novamente a maioridade: "));
		}
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
		while (idade < 0) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Erro: Insira novamente sua idade"));
		}

		if (idade >= maioridade) {
			JOptionPane.showMessageDialog(null, "você é de maior");
		} else {
			JOptionPane.showMessageDialog(null, "você é de menor");

		}

	}

}
