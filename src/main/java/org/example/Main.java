package org.example;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcus", 19, "Engenharia de Software", 8.5);
        Aluno aluno2 = new Aluno("Lucas", 17, "Ciência de Dados", 5.0);
        Aluno aluno3 = new Aluno("Pedro", 21, "Engenharia da computação", 3.5);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Média de Notas: " + aluno1.getMediaNotas());
        System.out.println("Status: " + aluno1.getStatus());
    }
}
