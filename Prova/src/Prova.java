import java.util.Scanner;

public class Prova {
	
	public static void main(String args[]) {
		
		Questao lista[];
		
		lista = new Questao[3];
		
		
		lista[0] = new Questao("Quanto � 2 + 2:?","4");
		lista[1] = new Questao("Quanto � 2 + 3:?","5");
		lista[2] = new Questao("Quanto � 2 + 4:?","6");
		
		Scanner teclado = new Scanner(System.in);
		String respostaUser;
		
				
		for (int posicao=0; posicao<3; posicao++) {
			System.out.println("quest�o: "+lista[posicao].getPergunta());
			respostaUser = teclado.nextLine();
			if (lista[posicao].corrigir(respostaUser) == true) {
				System.out.println("Voc� acertou!");
			}
			else
				System.out.println("Voc� errou!");
			
		}
		
		teclado.close();
		
	}
	
}
