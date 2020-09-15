package userInterface;
import core.QuestaoSimples;
import core.QuestaoMultiplaEscolha;
import core.QuestaoDica;
import java.util.Scanner;

public class AplicarProva {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		QuestaoSimples questao[] = new QuestaoSimples[3];
		
		questao[0] = new QuestaoSimples("Quanto é 2 + 2?","4");
		questao[1] = new QuestaoMultiplaEscolha("Quanto é 2 + 2?","4","1","2","3","4");
		questao[2] = new QuestaoDica("Quanto é 2 + 2?","4","conte os dedos");
			
		for (QuestaoSimples q : questao) {
			
			System.out.println(q.aplicarQuestao());
			String respostaAluno;
			respostaAluno = teclado.nextLine();
			
			if (q.corrigir(respostaAluno) == true) {
				System.out.println("Resposta Correta!");
			}
			else {
				System.out.println("Resposta incorreta!");
			}
			
		}
		
		
		teclado.close();
		
	}
	
}


