package core;
import  core.QuestaoSimples;

public class QuestaoDica extends QuestaoSimples{
	
	private String dica;

	public QuestaoDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String aplicarQuestao() {
		return super.enunciado+" \n  Dica:"+dica;
		
	}
	
	public boolean corrigir(String respostaUser) {
		return this.resposta.equals(respostaUser);
		
	}
	
	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	
	
	
	
	

}
