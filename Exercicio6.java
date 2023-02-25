package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor2= 0;
		double result =0;
		int opcao = 0;
		result = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
		String repetir = "";
		
		do {
		  opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o calculo desejado"
				+"\n [1] +"
				+ "\n [2] -"
				+"\n [3] *"
				+"\n [4] /"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));
		
		switch (opcao) {
		case 1:
			result = (result+valor2);
			break;
		case 2: 
			result = (result-valor2);
			break;
		case 3:
			result= (result*valor2);
			break;
		case 4: 
			while (valor2==0) { 
				valor2= Double.parseDouble(JOptionPane.showInputDialog("0 é um número indivisível. Por gentileza, digite outro número: "));		
			}
			result = (result/valor2);
			break;
		}
		JOptionPane.showMessageDialog(null, "O resultado é "+ result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		repetir = JOptionPane.showInputDialog("Deseja calcular novamente? " 
			    + "\n Digite S para sim ou outro caractere para encerrar: ");
		}while (repetir.equalsIgnoreCase("S"));
			
	}				
}


