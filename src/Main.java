import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o ano de nascimento:");
        int ano = scanner.nextInt();

        int anoAtual = 2026;
        int idade = anoAtual - ano;

        System.out.println("Olá, " + nome + ", você tem " + idade + " anos.");

        scanner.close();
    }
}