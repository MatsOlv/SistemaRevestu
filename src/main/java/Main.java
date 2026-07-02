import Repositories.UsuarioRepository;
import models.Usuario;
import services.UsuarioService;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int escolha;
        UsuarioService usuarioService = new UsuarioService();

// fazer os metodos dos cadastros (entender como usa o @ do jakarta nisso)

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
                System.out.println("Digite o cpf do usuario");
                String cpf = sc.nextLine();
                System.out.println("Digite o nome do usuario");
                String nome = sc.nextLine();
                Usuario usuario =new Usuario(cpf, nome);
                usuarioService.cadastrar(usuario);


            }else if (escolha == 2) {

            }else if (escolha == 3) {

            }else {
                System.out.println("Comando Invalido, Digite novamente");
            }
        } while (escolha != 0);

    }
}
