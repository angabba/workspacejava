package core;
import core.CartaoPrePago;

public class CartaoCashBack extends CartaoPrePago{
	
	private int tipo;
	
	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if (valor < super.saldo) {
			super.saldo = saldo - valor;
			if (tipo == 1) {
				super.saldo = saldo + (valor*0.02);			
			}
			else if (tipo == 2) {
					super.saldo = saldo + (valor*0.05);
			}else {
					super.saldo = saldo + (valor*0.08);
			}
			return true;
		}
			else {
				return false;
			}
				
		}
		
			
		public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	
	
	

}
