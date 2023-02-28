import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Curso Java");
        cursoJavaBasico.setDescricao("Curso básico");
        cursoJavaBasico.setCargaHoraria(15);

        Curso cursoJavaIntermediario = new Curso();
        cursoJavaIntermediario.setTitulo("Curso Java");
        cursoJavaIntermediario.setDescricao("Curso intermediario");
        cursoJavaIntermediario.setCargaHoraria(10);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Curso Java");
        cursoJavaAvancado.setDescricao("Curso avançado");
        cursoJavaAvancado.setCargaHoraria(5);


        Mentoria mentoriaJavaBasico = new Mentoria();
        mentoriaJavaBasico.setTitulo("Logica de programação");
        mentoriaJavaBasico.setDescricao("Curso teorico e pratico");
        mentoriaJavaBasico.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJavaBasico);
        bootcamp.getConteudos().add(cursoJavaIntermediario);
        bootcamp.getConteudos().add(cursoJavaAvancado);
        bootcamp.getConteudos().add(mentoriaJavaBasico);

        Dev devCledilson = new Dev();
        devCledilson.setNome("Cledilson");
        devCledilson.inscricaoBootcamp(bootcamp);
        devCledilson.progrecao();
        devCledilson.progrecao();
        System.out.println("XP: " + devCledilson.calculandoTotalXp());

        Dev devAluno = new Dev();
        devAluno.setNome("Aluno X");
        devAluno.inscricaoBootcamp(bootcamp);
        devAluno.progrecao();
        devAluno.inscricaoBootcamp(bootcamp);
        System.out.println("XP: " + devAluno.calculandoTotalXp() + "\n");

        System.out.println("Inscritos" + devCledilson.getConteudosInscritos() + "\n" + devAluno.getConteudosInscritos());
        System.out.println("---");
        System.out.println("Concluídos" + devCledilson.getConteudosConcluidos() + "\n" + devAluno.getConteudosConcluidos());


    }
}
