package calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        char continuar;

        do {
            System.out.println("\nCalculadora 2000");
            System.out.println("[1] Somar");
            System.out.println("[2] Dividir");
            System.out.println("[3] Subtrair");
            System.out.println("[4] Multiplicar");
            System.out.println("[5] Sair do sistema");
            System.out.print("Digite sua opção: ");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.print("Digite o primeiro número: ");
                double n1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        somar(n1, n2);
                        break;
                    case 2:
                        dividir(n1, n2);
                        break;
                    case 3:
                        subtrair(n1, n2);
                        break;
                    case 4:
                        multiplicar(n1, n2);
                        break;
                }
            } else if (opcao != 5) {
                System.out.println("\nOpção inválida");
            }

            if (opcao != 5) {
                System.out.println("Deseja continuar? (s/n)");
                continuar = sc.next().charAt(0);

                if (continuar == 'n' || continuar == 'N') {
                    break;
                }

            }

        } while (opcao != 5);

        System.out.println("Encerrando calculadora...");
        sc.close();
    }

    static void somar(double n1, double n2) {
        System.out.println("Resultado: " + (n1 + n2));
    }

    static void dividir(double n1, double n2) {
        if (n2 != 0) {
            System.out.println("Resultado: " + (n1 / n2));
        } else {
            System.out.println("Não é possível dividir por zero!");
        }
    }

    static void subtrair(double n1, double n2) {
        System.out.println("Resultado: " + (n1 - n2));
    }

    static void multiplicar(double n1, double n2) {
        System.out.println("Resultado: " + (n1 * n2));
    }
}
