package Exercicios;

import javax.swing.JOptionPane;

//Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e tamb�m
//que solicite ao usu�rio a entrada de dados de um valor inteiro qualquer. A
//solu��o dever� fazer uma busca do valor, informado pelo usu�rio, no vetor e
//imprima a posi��o em que este foi encontrado ou se n�o foi encontrado.
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		Boolean validador = false;
		int[] valor = new int[10];

//for (int i = 0; i<10; i++ ) {

		for (int i = 0; i < 10; i++) {
			valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " � valor: "));
		}
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que gostaria de ver: "));
		for (int i = 0; i < 10; i++) {
			if (numero == valor[i]) {
				validador = true;
				JOptionPane.showMessageDialog(null, "A posi��o do n�mero � " + i, "Posi��o de 0 a 10",
						JOptionPane.INFORMATION_MESSAGE);

			}
		}
		if (validador == false) {

			JOptionPane.showMessageDialog(null, "N�mero n�o encontrado ", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
