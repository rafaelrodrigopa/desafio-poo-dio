package dominio;

public class Curso extends Conteudo {
	int cargaHoraria;
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super();
		setTitulo(titulo);
		setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	
	
}
