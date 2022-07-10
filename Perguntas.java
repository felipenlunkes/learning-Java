package Teste;
import java.util.Scanner;
public class Teste {

	static int cont=0;
	static int certas=0; 
	static int erradas=0;
	static int tamanho=0;
	
	public static void main(String[] args) {
	Scanner leitura = new Scanner(System.in);
	System.out.println("\n\nDigite seu nome para começar:\n");
	String nome=leitura.nextLine();
	double play=Teste.play1(nome);
	}
	public static double play1(String nome){
		System.out.println("\n\nSeja Bem Vindo " +nome+ ".\n\n");
        for (cont=1; cont < 14; cont++){
        	
        	String pergunta=Teste.Perguntas(cont);
        	double resposta=Teste.Respostas(cont);
        		
        }
	    System.out.println("Número de Respostas Corretas: " +certas);
	    System.out.println("Número de Respostas Erradas: " +erradas);
        return 0;
	}

	public static String Perguntas(int cont){
		String [] perg = new String [20];
		perg[1]="Qual a capital do Brasil?";
		perg[2]="Qual a doença que apresenta o sintoma de pintas vermelhas pelo corpo?";
		perg[3]="Qual ano a linguagem Java foi introduzida?";
		perg[4]="Qual a linguagem de programação em que o Java se baseia fortemente?";
		perg[5]="Qual religião possui sua sede no Vaticano?";
		perg[6]="Qual o idioma falado na Japão?";
		perg[7]="Qual a capital da Rússia?";
		perg[8]="Qual o sistema operacional utilizado nos novos celulares Nokia Lumia?";
		perg[9]="Qual o sistema operacional livre mais popular no mundo?";
		perg[10]="Qual a versão anterior do Windows NT ao Windows 2000?";
		perg[11]="Qual a classe de animais em que se encontram os Cães?";
		perg[12]="É um exemplo de mamífero ovíparo:";
		perg[13]="Quanto é 3*3+5-6?";
		System.out.println(perg[cont]);
		System.out.println("\n\nAlternativas:\n\n");
		return(perg[cont]);
	}
	public static int Respostas(int cont){
		Scanner leitura = new Scanner(System.in);
		int resp=0;
		if (cont == 1){
			System.out.println("1- Belo Horizonte  2- Brasília  3- São Paulo  4- Porto Alegre\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 2){
				System.out.println("Resposta correta!!!\n");
				certas++;
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		}
		if (cont == 2){
			System.out.println("1- Dengue  2- Febre Amarela  3- Meningite  4- Tétano\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 1){
				System.out.println("Resposta correta!!!\n");
				certas++;
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		if (cont == 3){
			System.out.println("1- 1998  2- 1992  3- 1995  4- 1999  5- 1990\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 3){
				System.out.println("Resposta correta!!!\n");
				certas++;
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 4){
			System.out.println("1- C  2- Assembly  3- Pascal  4- C++  5- C#\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 1){
				System.out.println("Resposta correta!!!\n");
				certas++;
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 5){
			System.out.println("1- Igreja Evangélica  2- Igreja Católica  3- Budista  4- Islâmica\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 2){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 6){
			System.out.println("1- Mandarim  2- Japonês  3- Chinês  4- Inglês  5- Português\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 1){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
		}
		
		
		
		if (cont == 7){
			System.out.println("1- Damasco  2- Chechenia  3- Praga  4- Moscou  5- Lisboa\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 4){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 8){
			System.out.println("1- Symbian  2- Android  3- Windows Phone  4- MeeGO  5- Tizen\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 3){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 9){
			System.out.println("1- Linux  2- Plan 9  3- ReactOS  4- Windows  5- Unix\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 1){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 10){
			System.out.println("1- Windows NT 4.0  2- Windows 95  3- Windows 98  4- Windows 3.0  5- MS-DOS\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 1){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 11){
			System.out.println("1- Canídeos  2- Felinos  3- Répteis  4- Galinácios  5- Bovinos\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 1){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		if (cont == 12){
			System.out.println("1- Chester   2- Águia  3- Cágado  4- Ornitorrinco  5- Cão\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 4){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
		
		
		if (cont == 13){
			System.out.println("1- 7   2- 12  3- 8  4- 6  5- 9\n\nResposta:\n");
			resp=leitura.nextInt();
			System.out.println("\n\n");
			if (resp == 3){
				System.out.println("Resposta correta!!!\n");
			certas++;	
			}
			else {
				System.out.println("Resposta incorreta! :(\n");
				erradas++;
			}
			
		
		}
	//**************************************************************************************
		
		return 0;
	}
}
