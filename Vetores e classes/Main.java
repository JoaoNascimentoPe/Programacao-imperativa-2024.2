import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static final int QTD_ALUNO = 10;
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[QTD_ALUNO];
        preencherNotas(alunos);

        int qtdAprovados = verificarAprovados(alunos);
        int qtdReprovados = verificarReprovados(alunos);

        Aluno[] aprovados = new Aluno[qtdAprovados];
        Aluno[] reprovados = new Aluno[qtdReprovados];

        preencherVetores(alunos, aprovados, reprovados);

        imprimir(alunos, aprovados, reprovados);
    }

    public static void imprimir(Aluno[] alunos, Aluno[] aprovados, Aluno[] reprovados) {
        System.out.println("=============Listagem de Alunos=============");
        for (int i = 0; i < alunos.length; ++i) {
            System.out.println(alunos[i].toString());
        }
        System.out.println("=============Listagem de Aprovados=============");
        for (int i = 0; i < aprovados.length; i++) {
            System.out.println(aprovados[i].toString());
        }
        System.out.println("=============Listagem de Reprovados=============");
        for (int i = 0; i < reprovados.length; i++) {
            System.out.println(reprovados[i].toString());
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
            if (notas[i].mediaFinal >= 5) {
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

    public static void preencherVetores(Aluno[] notas, Aluno[] aprovados, Aluno[] reprovados) {
        int indexAprovados = 0;
        int indexReprovados = 0;

        for (int i = 0; i < notas.length; i++){
            if (notas[i].mediaFinal >= 5) {
                aprovados[indexAprovados] = notas[i];
                indexAprovados++;
            } else {
                reprovados[indexReprovados] = notas[i];
                indexReprovados++;
            }
        }
    }
}
