package Dados;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double n4 = scanner.nextDouble();

        double media = n1 + n2 + n3 + n4;
        System.out.println("Essa é a sua média: " + media);

        boolean notas;
        {
            if (media >= 30)
                System.out.println("Aprovado!");
            else
                System.out.println("Reprovado!");
        }
    }
}