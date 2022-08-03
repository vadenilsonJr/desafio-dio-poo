package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Descrição curso POO");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria do Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Springboot Expirence");
        bootcamp.setDescricao("Descrição Bootcamp Springboot Expirence");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Vadenilson");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Vadenilson: " + dev1.getConteudosIncritos());
        System.out.println("----------");
        dev1.progredir();
        System.out.println("----");
        dev1.progredir();
        System.out.println("----");
        dev1.progredir();
        System.out.println("----");
        System.out.println("Conteudos inscritos Vadenilson: " + dev1.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Vadenilson:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila: " + dev2.getConteudosIncritos());
        System.out.println("----------");
        dev2.progredir();
        System.out.println("----");
        dev2.progredir();
        System.out.println("----");
        System.out.println("Conteudos inscritos Camila: " + dev2.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Camila:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());


    }
}
