package core;

public class comissionado extends funcionario{
	
	private float salariobase;
	private float comissao;
		
	public comissionado(String nome, int numeroRegistro, float salariobase, float comissao) {
		super(nome, numeroRegistro);
		this.salariobase = salariobase;
		this.comissao = comissao;
	}
	
	@Override
	public float calcularSalario() {
		float salario;
		salario = this.salariobase + (this.salariobase*this.comissao)/100;
		return salario;
	}
	
	public String toString() {
		return "Comissionado "+ "("+super.nome+")";
	}
	
	public float getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(float salariobase) {
		this.salariobase = salariobase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	

}
