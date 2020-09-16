package userInterface;
import core.funcionario;
import core.chefe;
import core.comissionado;
import core.horista;
import core.empreiteiro;


public class calcularSalario {
	
	public static void main(String args[]) {
		
		funcionario func[] = new funcionario[4];
		
		func[0] = new chefe("Ana",1234,1000.0f,5.0f,2.0f);
		func[1] = new comissionado("Laura",2541,1000.0f,50.0f);
		func[2] = new horista("Luiz",1487,25.0f,10);
		func[3] = new empreiteiro("Helio",1478,1000.0f);
		
		for (funcionario f : func) {
			
			System.out.println(f +" Salário: R$ "+f.calcularSalario());
			
		}		
		
	}

}
