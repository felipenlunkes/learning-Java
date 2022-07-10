import javax.swing.*;
import java.io.*;

public class Pares {

	
	public static void main(String[] args) {
	
int numero;
int resposta;
String numeropraint;
numeropraint=JOptionPane.showInputDialog("Insira um número real: ");
numero=Integer.parseInt(numeropraint);
if (numero%2==0){
	JOptionPane.showMessageDialog(null,"O seu número " +numero+ " é par.");
}
else {
	JOptionPane.showMessageDialog(null,"O seu número " +numero+ " não é par.");
	
}
	}

}
