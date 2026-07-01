import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int escolha;

        do {
            System.out.println(
                    "--------------------\n" +
                            "0 - Fechar Sistema\n" +
                            "1 - Cadastrar Usuario\n" +
                            "2 - Cadastrar Marca\n" +
                            "3 - Fazer Login\n" +
                            "--------------------\n"
            );
            escolha = sc.nextInt();

            if (escolha == 0) {
                System.out.println("Encerrando o Sistema.....");
            }else if (escolha == 1) {

            }else if (escolha == 2) {

            }else if (escolha == 3) {

            }else {
                System.out.println("Comando Invalido, Digite novamente");
            }
        } while (escolha != 0);

    }
}
