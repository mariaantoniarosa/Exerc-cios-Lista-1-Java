package Exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//8) Faça um programa que carregue os valores das vendas de uma loja no
//primeiro semestre do ano. Considere para tal uma matriz [6,4], sendo que são
//06 meses e 04 semanas por mês. Ao final, mostre na tela:
//● Total de vendas do semestre
//● Total vendido em cada mês
public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ex.: double[][] valores = new double[4][4]
		// Ex.:
		// for (int l=0; l<4; l++){
		// for(int c=0; c<4; c++){
		// valores[l][c]=Double.parseDouble(JOptionPane.showInputDialog(“Informe o
		// valor”));
		// }
		// }
		
		double somaMes = 0;
		double soma = 0;
		//DecimalFormat df = new DecimalFormat("0.00");
		DecimalFormat df = new DecimalFormat ("0.00");
		double[][] valores = new double[6][4];
		for (int l = 0; l < 6; l++) {
			for (int c = 0; c < 4; c++) {
				valores[l][c] = Double.parseDouble((JOptionPane
						.showInputDialog("Informe o valor do " + (l + 1) + "º mês,  " + (c + 1) + "º Semana")));
				soma = soma + valores[l][c];
			}
		}

		for (int l = 0; l < 6; l++) {
			for (int c = 0; c < 4; c++) {

				somaMes = somaMes + (valores[l][c]);
			}
			JOptionPane.showMessageDialog(null, "A soma total do " + (l + 1) +"º mês é: R$ " + df.format(somaMes));
			somaMes = 0;
		}
		JOptionPane.showMessageDialog(null, "A soma total do semestre é R$ " + df.format(soma));
	}

}
