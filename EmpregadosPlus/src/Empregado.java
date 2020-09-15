
	public class Empregado {
		
		private String nome;
		private String cargo;
		private double salario;
		

		public Empregado(String nome, String cargo, double salario) {
			super();
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		}
	
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getCargo() {
			return cargo;
		}


		public void setCargo(String cargo) {
			this.cargo = cargo;
		}


		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}

		
		double aumentarSalario(double percentual) {
			salario = salario + (salario*percentual)/100;
			return salario;
		}
		
		
		double imposto() {
			double imposto;
			imposto=0;
			if (salario <= 2000.0 ) {
				imposto = 0.0;			
			}
			else if (salario > 2000.0 && salario <= 4500.0) {
				imposto = salario * 0.2;
			}
			else{
				imposto = 1200.0;
			}
			return imposto;
			
		}
		
		double salarioliquido() {
			double salarioliq;
			salarioliq = salario - imposto();
			return salarioliq;
		}

	}



