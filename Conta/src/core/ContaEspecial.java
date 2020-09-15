package core;
import core.Conta;


public class ContaEspecial extends Conta {
	
	float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean debitar(float valor) {
		if (saldoConta + limite >= valor) {
			saldoConta = saldoConta - valor;
			return true;
		}
		else {
			return false;
		}
		
	}


}
