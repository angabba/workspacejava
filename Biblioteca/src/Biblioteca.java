
public class Biblioteca {
	
	private String autor;
	private int ano;
	private String categoria;
	private int numEstante;
	private boolean emprestado;
	
	public Biblioteca(String autor, int ano, String categoria, int numEstante, boolean emprestado) {
		this.autor = autor;
		this.ano = ano;
		this.categoria = categoria;
		this.numEstante = numEstante;
		this.emprestado = emprestado;
		
	}
		
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNumEstante() {
		return numEstante;
	}
	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}
	
	
	public boolean isEmprestado() {
		return emprestado;
	}

	public void emprestar() {
		emprestado = false;
	}
	
	public void devolver() {
		emprestado = true;
	}
		
	public void imprimir() {
		System.out.println("Autor: " + autor);
		System.out.println("Ano: " + ano);
		System.out.println("Categoria: " + categoria);
		System.out.println("Numero estante: " + numEstante);
		if (emprestado) {
			System.out.println("Disponível");
		}
		else {
			System.out.println("Emprestado");
		}
		
	}
	
}
