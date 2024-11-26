import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        //calculadoraSimples();
        //calcularImc();
        //calculoInss();
        //calculoImpostoRenda();
        paresImpares();
    }

    public static void calculadoraSimples() {
        int num1, num2, soma, sub, mult, div;
        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = ler.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;

        System.out.println("Soma dos números = " + soma);
        System.out.println("Subtração dos números = " + sub);
        System.out.println("Multiplicação dos números = " + mult);
        if(num2 != 0){
            div = num1 / num2;
            System.out.println("Divisão dos números = " + div);
        }
    }

    public static void calcularImc() {
        double peso, altura, imc;
        System.out.print("Digite seu peso: ");
        peso = ler.nextDouble();
        System.out.print("Digite sua altura (em metros): ");
        altura = ler.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("Seu IMC é de: " + imc);

        if ( imc < 18.5 ) {
            System.out.print("Você está com Baixo Peso.");
        } else if ( imc < 24.99 ) {
            System.out.print("Você está com o IMC Normal.");
        } else if ( imc < 29.99 ) {
            System.out.print("Você está com Sobre Peso.");
        } else {
            System.out.println("Você está Obeso(a).");
        }
    }

    public static void calculoInss() {
        double salarioBruto, desconto, salarioLiquido;
        System.out.print("Digite so valor do seu salário: ");
        salarioBruto = ler.nextDouble();

        if (salarioBruto <= 1412.00) {
            desconto = salarioBruto * 0.075;
            salarioLiquido = salarioBruto - desconto;
            System.out.print("Aplicando as contribuições de: "+ desconto + "R$ em seu salário resulta em: " + salarioLiquido +"R$");
        } else if (salarioBruto <= 2666.68) {
            desconto = (1412.00 * 0.075) + ((salarioBruto - 1412.00) * 0.09);
            salarioLiquido = salarioBruto - desconto;
            System.out.print("Aplicando as contribuições de: "+ desconto + "R$ em seu salário resulta em: " + salarioLiquido +"R$");
        } else if (salarioBruto <= 4000.03) {
            desconto = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09) + ((salarioBruto - 2666.68) * 0.12);
            salarioLiquido = salarioBruto - desconto;
            System.out.print("Aplicando as contribuições de: "+ desconto + "R$ em seu salário resulta em: " + salarioLiquido +"R$");
        } else if (salarioBruto <= 7786.02) {
            desconto = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09) + ((4000.03 - 2666.68) * 0.12) + ((salarioBruto - 4000.03) * 0.14);
            salarioLiquido = salarioBruto - desconto;
            System.out.print("Aplicando as contribuições de: "+ desconto + "R$ em seu salário resulta em: " + salarioLiquido +"R$");
        }
    }

    public static void calculoImpostoRenda() {
        double salarioBruto, imposto;

        System.out.print("Digite seu salário bruto: ");
        salarioBruto = ler.nextDouble();

        if (salarioBruto <= 2112.00) {
            imposto = 0.0;
            System.out.println("O valor do seu imposto de renda é: " + imposto);
        } else if (salarioBruto <= 2826.65) {
            imposto = (salarioBruto - 2112.00) * 0.075;
            System.out.print("O valor do seu imposto de renda é: " + imposto);
        } else if (salarioBruto <= 3751.05) {
            imposto = (salarioBruto - 2826.05) * 0.15 + 53.60;
            System.out.print("O valor do seu imposto de renda é: " + imposto);
        } else if (salarioBruto <= 4664.67) {
            imposto = (salarioBruto - 3751.05) * 0.225 + 151.13;
            System.out.print("O valor do seu imposto de renda é: " + imposto);
        } else {
            imposto = (salarioBruto - 4664.68) * 0.275 + 341.85;
            System.out.print("O valor do seu imposto de renda é: " + imposto);
        }
    }

    public static void paresImpares() {
        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();

        if (num1 % 2 == 0) {
            for (int i = num1; i <= num2; i = i + 2) {
                System.out.println(i);
            }
            for (int j = num1; j <= num2; j++) {
                if (j % 2 == 1) {
                    System.out.println(j);
                }
            }
        }
    }
}
