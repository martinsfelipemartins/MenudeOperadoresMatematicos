package br.com.alunodh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        float escolha;
        float valorA;
        float valorB;

        System.out.println("Escolher a operação matemática desejada: \n" +
                "1 - Somar\n" +
                "2 - Subtrair\n" +
                "3 - Multiplicar\n" +
                "4 - Dividir\n" +
                "5 - Sair\n" +
                "Digite o numero com a opção desejada: ");
        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Muito bem! Você deseja somar a+b!. Defina o valor de a: ");
            valorA = scanner.nextInt();

            System.out.println("Legal, o seu operador 'a' vale " + valorA + ". Agora defina o valor de b: ");
            valorB = scanner.nextInt();

            System.out.println("Parabéns! O resultado da sua operação de a+b é: " + soma.calcula(valorA, valorB));
            System.exit(0);
        }

        if (escolha == 2) {
            System.out.println("Muito bem! Você deseja subtrair a-b!. Defina o valor de a: ");
            valorA = scanner.nextInt();

            System.out.println("Legal, o seu operador 'a' vale " + valorA + ". Agora defina o valor de b: ");
            valorB = scanner.nextInt();

            System.out.println("Parabéns! O resultado da sua operação de a-b é: " + subtracao.calcula(valorA, valorB));
            System.exit(0);
        }

        if (escolha == 3) {
            System.out.println("Muito bem! Você deseja multiplicar a*b!. Defina o valor de a: ");
            valorA = scanner.nextInt();

            System.out.println("Legal, o seu operador 'a' vale " + valorA + ". Agora defina o valor de b: ");
            valorB = scanner.nextInt();

            System.out.println("Parabéns! O resultado da sua operação de a*b é: " + multiplicacao.calcula(valorA, valorB));
            System.exit(0);
        }
        if (escolha == 4) {
            System.out.println("Muito bem! Você deseja dividir a/b!. Defina o valor de a: ");
            valorA = scanner.nextInt();

            System.out.println("Legal, o seu operador 'a' vale " + valorA + ". Agora defina o valor de b: ");
            valorB = scanner.nextInt();

            System.out.println("Parabéns! O resultado da sua operação de a/b é: " + divisao.calcula(valorA, valorB));
            System.exit(0);
        }

        if (escolha == 5) {
            System.out.println("Até mais!");
            System.exit(0);
        }

        if (escolha > 5) {
            System.out.println("Opção inválida!");
            System.exit(0);


        }


    }
}