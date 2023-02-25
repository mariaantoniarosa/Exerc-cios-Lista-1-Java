package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedindo a hora
		int hora = 0;
		int minutos = 0;
		int segundos = 0;
		int horaSegundos = 0;
		int minutoSegundos = 0;
		int soma = 0;

		hora = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora"));
		while (hora < 0) {
			hora = Integer.parseInt(JOptionPane.showInputDialog("Insira novamente a hora"));

		}
		minutos = Integer.parseInt(JOptionPane.showInputDialog("Insira os minutos:"));
		while (minutos < 0) {
			minutos = Integer.parseInt(JOptionPane.showInputDialog("Insira novamente os minutos"));

		}
		segundos = Integer.parseInt(JOptionPane.showInputDialog("Insira os segundos"));
		while (segundos < 0) {
			segundos = Integer.parseInt(JOptionPane.showInputDialog("Insira novamente os segundos"));

		}
		horaSegundos = 60 * hora * 60;
		minutoSegundos = minutos * 60;
		soma = horaSegundos + minutoSegundos + segundos;
		JOptionPane.showMessageDialog(null, "O horário que você inseriu tem " + soma + " segundos", null,
				JOptionPane.INFORMATION_MESSAGE);

	}

}
