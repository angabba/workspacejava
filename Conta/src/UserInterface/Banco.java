package UserInterface;
import core.Conta;

public class Banco {
	
	public static void main(String args[]) {
		
		Conta conta = new Conta();
		
		conta.setNomeTitular("Ana");
		conta.setCpf("11415878976");
		conta.setNumeroConta(145);
		
		System.out.println("Nome titular: "+conta.getNomeTitular()+ " CPF: "+conta.getCpf()+ " Número da conta: "+conta.getNumeroConta()+ " Saldo: "+conta.getSaldoConta());
		
		conta.creditar(200.0f);
		
		System.out.println("Nome titular: "+conta.getNomeTitular()+ " CPF: "+conta.getCpf()+ " Número da conta: "+conta.getNumeroConta()+ " Saldo: "+conta.getSaldoConta());
		
		boolean valida = conta.debitar(300.0f);
		
		if (valida == true) {
			System.out.println("Débito feito com sucesso");
			System.out.println("Saldo atual "+conta.getSaldoConta());
		}
		else {
			System.out.println("Sem saldo para débito");
		}
		
		System.out.println("Nome titular: "+conta.getNomeTitular()+ " CPF: "+conta.getCpf()+ " Número da conta: "+conta.getNumeroConta()+ " Saldo: "+conta.getSaldoConta());
						
	}

}
