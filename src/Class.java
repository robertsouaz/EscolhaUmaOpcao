import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("(A) Adicionar");
        System.out.println("(R) Remover");
        System.out.println("(S) Sair");

        char opcao = scanner.next().charAt(0); // Captura a primeira letra digitada

        switch (Character.toUpperCase(opcao)) {
            case 'A':
                System.out.println("Você escolheu adicionar.");
                break;
            case 'R':
                System.out.println("Você escolheu remover.");
                break;
            case 'S':
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
