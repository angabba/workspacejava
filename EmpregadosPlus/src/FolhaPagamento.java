
public class FolhaPagamento {
	
	public static void main(String args[]) {
		
	
	Empregado lista[];
	
	lista = new Empregado[4];
	
	lista[0] = new Empregado("Ana","diretora",5000);
	lista[1] = new Empregado("Caio","superintendente",4500);
	lista[2] = new Empregado("Paulo","gerente",4000);
	lista[3] = new Empregado("Jose","coordenador",3000);
	
	for (int posicao=0; posicao < 4; posicao++) {
		System.out.println("nome: "+lista[posicao].getNome());
		System.out.println("cargo: "+lista[posicao].getCargo());
		System.out.println("salário: "+lista[posicao].getSalario());
		System.out.println("imposto: "+lista[posicao].imposto());
		System.out.println("salario reajustado "+lista[posicao].aumentarSalario(20));
		System.out.println("salario liquido "+lista[posicao].salarioliquido());
		System.out.println("__________________________");
		
	}
	
	}

}
