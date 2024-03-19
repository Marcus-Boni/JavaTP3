package br.infnet.TP;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double mediaNotas;

    public Aluno(String nome, int idade, String curso, double mediaNotas) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.mediaNotas = mediaNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public String getStatus() {
        if (mediaNotas >= 7.0) {
            return "Aprovado";
        } else if (mediaNotas >= 4.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
