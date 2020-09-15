
public class SistemaBiblioteca {
	
	public static void main(String args[]) {
		
		Biblioteca livro1, livro2, livro3, livro4, livro5;
		
		livro1 = new Biblioteca("Ana",2010,"Comedia",5,false);
		livro2 = new Biblioteca("Carlos",2020,"Drama",3,false);
		livro3 = new Biblioteca("Luis",2007,"Terror",2,false);
		livro4 = new Biblioteca("Luis",2007,"Terror",2,true);
		livro5 = new Biblioteca("Luis",2007,"Terror",2,true);
		
		System.out.println("*** INFORMACOES ***");
		livro1.imprimir();
		System.out.println("--------------------");
		livro2.imprimir();
		System.out.println("--------------------");
		livro3.imprimir();
		System.out.println("--------------------");
		livro4.imprimir();
		System.out.println("--------------------");
		livro5.imprimir();
		
		
	}

}
