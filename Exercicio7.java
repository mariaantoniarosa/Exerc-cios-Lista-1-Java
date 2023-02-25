package Exercicios;

import javax.swing.JOptionPane;

//Faça uma solução que alimente um vetor com 10 valores inteiros e também
//que solicite ao usuário a entrada de dados de um valor inteiro qualquer. A
//solução deverá fazer uma busca do valor, informado pelo usuário, no vetor e
//imprima a posição em que este foi encontrado ou se não foi encontrado.
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		Boolean validador = false;
		int[] valor = new int[10];

//for (int i = 0; i<10; i++ ) {

		for (int i = 0; i < 10; i++) {
			valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " º valor: "));
		}
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que gostaria de ver: "));
		for (int i = 0; i < 10; i++) {
			if (numero == valor[i]) {
				validador = true;
				JOptionPane.showMessageDialog(null, "A posição do número é " + i, "Posição de 0 a 10",
						JOptionPane.INFORMATION_MESSAGE);

			}
		}
		if (validador == false) {

			JOptionPane.showMessageDialog(null, "Número não encontrado ", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
