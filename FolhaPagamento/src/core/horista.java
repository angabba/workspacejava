package core;

public class horista extends funcionario{
	
	private float valorHora;
	private int numeroHoras;
	
	
	@Override
	public float calcularSalario() {
		float salario;
		salario = this.valorHora*this.numeroHoras;
		return salario;
	}
	
	public String toString() {
		return "Horista "+ "("+super.nome+")";
	}
	
	public horista(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	

}
