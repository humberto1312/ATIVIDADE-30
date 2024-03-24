import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do pão: R$ ");
        double precoPao = scanner.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        // Loop para calcular e exibir os preços de 1 a 50 pães
        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double precoTotal = quantidade * precoPao;
            System.out.println(quantidade + " - R$ " + precoTotal);
        }

        scanner.close();
    }
}
