package cinema.dominio;

public class Ingresso {
	private String[] ingresso;
	public String[] horarios = {"16h","18h","20h"};
	
	
	
	public String[] getIngresso() {
		return ingresso;
	}
	public void setIngresso(String[] ingresso) {
		this.ingresso = ingresso;
	}
	public String[] getHorarios() {
		return horarios;
	}
	public void setHorarios(String[] horarios) {
		this.horarios = horarios;
	}

}
