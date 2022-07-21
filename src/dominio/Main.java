package dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setTitulo("Curso java");
		curso.setDescricao("Descrição curso java");
		curso.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso javascript");
		curso2.setDescricao("Descrição curso javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(curso2);
	}

}
