package userInterface;
import core.CartaoPrePago;
import core.CartaoCashBack;

public class Compra {
	
	public static void main(String args[]) {
		
		CartaoPrePago cartao = new CartaoPrePago("123","Ana",2028,6,500.0);
		CartaoCashBack cartao2 = new CartaoCashBack("142","João",2026,5,500.0,1);
		
		System.out.println("Número do cartão PP: "+cartao.getNumeroCartao()+" Titular: "+cartao.getNomeTitular()+" "+"Mês/Ano: "+cartao.getMesValidade()+"/"+cartao.getAnoValidade()+" "+"Saldo R$: "+cartao.getSaldo());
		System.out.println("Número do cartão CB: "+cartao2.getNumeroCartao()+" Titular: "+cartao2.getNomeTitular()+" "+"Mês/Ano: "+cartao2.getMesValidade()+"/"+cartao2.getAnoValidade()+" "+"Saldo R$: "+cartao2.getSaldo()+" Tipo:"+cartao2.getTipo());
		
		
		cartao.adicionarCredito(100.0);
		cartao2.adicionarCredito(100.0);
		
		System.out.println("*** CRÉDITO ADICIONADO ***");
		System.out.println("Número do cartão PP: "+cartao.getNumeroCartao()+" Titular: "+cartao.getNomeTitular()+" "+"Mês/Ano: "+cartao.getMesValidade()+"/"+cartao.getAnoValidade()+" "+"Saldo R$: "+cartao.getSaldo());
		System.out.println("Número do cartão CB: "+cartao2.getNumeroCartao()+" Titular: "+cartao2.getNomeTitular()+" "+"Mês/Ano: "+cartao2.getMesValidade()+"/"+cartao2.getAnoValidade()+" "+"Saldo R$: "+cartao2.getSaldo()+" Tipo:"+cartao2.getTipo());
		System.out.println("                           ");
		
		boolean valida = cartao.comprar(100.0);
		
		if (valida == true) {
			System.out.println("Cartão Pré: Compra feita com sucesso");
			System.out.println("Saldo atual: "+cartao.getSaldo());			
			
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		cartao2.comprar(100);
		System.out.println("Cartão CashBack: Compra feita com sucesso");
		System.out.println("Saldo atual: "+cartao2.getSaldo());
	}

}
