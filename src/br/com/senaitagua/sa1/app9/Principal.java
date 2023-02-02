package br.com.senaitagua.sa1.app9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int senha;
		int cont= 0;
		    
			while (cont < 3) {
		   senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
		   if(senha == 123) {
			  JOptionPane.showMessageDialog(null, "Você está autorizado para sacar!");
			   break;
		   }else{
			  JOptionPane.showMessageDialog(null, "Senha incorreta, digite novamente.");
			   cont++;
		   }
			   
		if (cont >= 3) {
			JOptionPane.showMessageDialog(null, "Sua conta foi bloqueada.");
			break;
			}
		}      		   
	}

}
		
				