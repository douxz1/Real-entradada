package Dados;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        sc.nextLine();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: \n" + area);
        sc.close();
    }
}
