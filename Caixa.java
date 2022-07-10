import javax.swing.JOptionPane;
public class Caixa {

	
	public static void main(String[] args) {
		String nome=null;
		int resposta;
		nome=JOptionPane.showInputDialog("Qual seu nome? ");
		if (nome == "Cibele" | nome == "cibele"){
			sair();
			System.exit(1);
			System.exit(1);
	
		}
		resposta=JOptionPane.showConfirmDialog(null, "O seu nome é " +nome+ "?");
		
		
		if (resposta == 0){
		JOptionPane.showMessageDialog(null,  "Seu nome é " +nome);
		}
		else {
			JOptionPane.showMessageDialog(null,  "O seu nome não é " +nome);
			
			
		}

	}
	public static void sair(){
		System.exit(20000);
		
	}

}
