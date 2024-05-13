import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida;
        double valorASerConvertido;

        do {
            System.out.println("=========================================");
            System.out.println("|          Conversor de Moeda           |");
            System.out.println("=========================================");
            System.out.println("| Escolha a conversão de moeda:         |");
            System.out.println("| 1. USD para BRL                       |");
            System.out.println("| 2. BRL para USD                       |");
            System.out.println("| 3. EUR para USD                       |");
            System.out.println("| 4. USD para EUR                       |");
            System.out.println("| 5. GBP para USD                       |");
            System.out.println("| 6. USD para GBP                       |");
            System.out.println("| 0. Sair                               |");
            System.out.println("=========================================");

            System.out.print("Digite o número da opção desejada: ");
            opcaoEscolhida = scanner.nextInt();
            if (opcaoEscolhida != 0) {
                System.out.print("Digite o valor a ser convertido: ");
                valorASerConvertido = scanner.nextDouble();
                Conversores conversor = new Conversores();
                opcaoEscolhida = conversor.converter(opcaoEscolhida, valorASerConvertido);
            }
        } while (opcaoEscolhida != 0);
    }
}