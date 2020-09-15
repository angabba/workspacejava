
public class Time {
	
	int hora;
	int minuto;
	int segundo;
	
	public void setTime(int hora, int minuto, int segundo){
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
	}
	
	public String exibirHoraUniversal() {
		String horaUni;
		horaUni = hora+":"+minuto+":"+segundo;
		return horaUni;	
	}
	
	public String exibirHoraPadrao() {
		String horaPadrao;
		String tipo;
		
		if (hora == 0) {
			hora = 12;
			tipo = "AM";
		}
		else {
			if (hora > 0 && hora < 12) {
				tipo = "PM";
			}
			else
				hora = hora - 12;
				tipo = "PM";
		}
		
		horaPadrao = hora+":"+minuto+":"+segundo+" "+tipo;
		return horaPadrao;		
	}
	
}
