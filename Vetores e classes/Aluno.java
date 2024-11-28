public class Aluno {
    String nome;
    int matricula;
    double mediaFinal;

    Aluno() {
    }

    Aluno(String nome, int matricula, double mediaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaFinal = mediaFinal;
    }

    public String toString() {
        return "Nome - " + this.nome + " Matrícula - " + this.matricula + " Nota Final - " + this.mediaFinal;
    }
}

