package cinema.dominio;

public class Ingresso {
	private Filme filme;
	private String[] ingresso;
	public String[] horarios = {"16h","18h","20h"};
	
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
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
