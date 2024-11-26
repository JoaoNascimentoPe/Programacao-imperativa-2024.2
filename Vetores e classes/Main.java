import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static final int QTD_ALUNO = 2;
    public static void main(String[] args) {
        Aluno[] notasAlunos = new Aluno[QTD_ALUNO];
        preencherNotas(notasAlunos);

        int qtdAprovados = verificarAprovados(notasAlunos);
        int qtdReprovados = verificarReprovados(notasAlunos);

        int[] aprovados = new int[qtdAprovados];
        int[] reprovados = new int[qtdReprovados];

        //imprimir(notasAlunos);
    }

    public static void imprimir(Aluno[] alunos) {
        System.out.println("=============Listagem de Alunos=============");
        for (int i = 0; i < alunos.length; ++i) {
            System.out.println("Aluno: " + alunos[i].nome + " matriculua: " + alunos[i].matricula + " nota: " + alunos[i].mediaFinal);
        }
    }

    public static void preencherNotas(Aluno[] notas) {
        for (int i = 0; i < notas.length; ++i) {
            notas[i] = lerAluno();
        }
    }

    public static Aluno lerAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        System.out.print("Digite a matricula do aluno: ");
        int matricula = ler.nextInt();
        System.out.print("Digite a média do aluno: ");
        double mediaFinal = ler.nextDouble();
        ler.nextLine();
        return new Aluno(nome, matricula, mediaFinal);
    }

    public static int verificarAprovados(Aluno[] notas) {
        int qtdAprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i].mediaFinal > 5) {
                qtdAprovados++;
            }
        };
        return qtdAprovados;
    }

    public static int verificarReprovados(Aluno[] notas) {
        int qtdReprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i].mediaFinal < 5) {
                qtdReprovados++;
            }
        };
        return qtdReprovados;
    }

    public static void preencherVetores(Aluno[] notas, int[] aprovados, int[] reprovados) {
        for (int i = 0; i < aprovados.length; i++){
            for (int j = 0; j < notas.length; i++){
                if (notas[i].mediaFinal > 5) {
                    aprovados[j] = (int) notas[i].mediaFinal;
                }
            }
        }
    }
}
