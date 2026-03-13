package Dados;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o ano atual? ");
        int number1  = sc.nextInt();

        System.out.println("Qual ano você nasceu?");
        int number2 = sc.nextInt();

        int idade = number1 - number2;
        System.out.println("Essa é a sua idade: " + idade);
    }
}
