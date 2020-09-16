package core;

public class empreiteiro extends funcionario{
	
	private float valorEmpreita;

	@Override
	public float calcularSalario() {
		return this.valorEmpreita;
	}
	
	public String toString() {
		return "Empreiteiro "+ "("+super.nome+")";
	}
	
	public empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	
	
	

}
