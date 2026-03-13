package Dados;

import java.util.Scanner;

public class Identidade {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int number = idade.nextInt();

        boolean seraqtem;

        if (number >= 18) {
            System.out.println("Você é de maior");
        }else
        System.out.println("Você é de menor");

    }
}
