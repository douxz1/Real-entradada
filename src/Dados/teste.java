package Dados;

import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sei filme favorito? ");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento? ");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Diga seua avaliação para esse filme: ");
        double avalicao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avalicao);

    }

    }
