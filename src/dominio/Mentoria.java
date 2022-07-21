package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	LocalDate data;
	
	public Mentoria() {
		// TODO Auto-generated constructor stub
	}

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		setTitulo(titulo);
		setDescricao(descricao);
		this.data = data;
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

	
	
}

