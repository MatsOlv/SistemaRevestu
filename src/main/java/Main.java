import models.Contato;
import models.Endereco;
import models.Marca;
import models.Usuario;
import services.*;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int escolha;
        AvaliacaoService avaliacaoService = new AvaliacaoService();
        MarcaService marcaService = new MarcaService();
        PontoService pontoService = new PontoService();
        ProdutoService produtoService = new ProdutoService();
        ReciclagemService reciclagemService = new ReciclagemService();
        UsuarioService usuarioService = new UsuarioService();



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

                System.out.println("Digite seu nome completo:");
                String nome = sc.nextLine();

                System.out.println("Digite seu CEP:");
                String cep = sc.nextLine();

                System.out.println("Digite o numero da casa");
                String numeroCasa = sc.nextLine();

                System.out.println("Digite o nome da rua:");
                String rua = sc.nextLine();

                System.out.println("Digite seu bairro:");
                String bairro = sc.nextLine();

                System.out.println("Digite sua Cidade:");
                String cidade = sc.nextLine();

                System.out.println("Digite seu Estado:");
                String estado = sc.nextLine();

                System.out.println("Digite seu Pais:");
                String pais = sc.nextLine();

                System.out.println("Digite seu Email:");
                String email = sc.nextLine();

                System.out.println("Digite seu Telefone:");
                String telefone = sc.nextLine();

                System.out.println("Digite seu CPF:");
                String cpf = sc.nextLine();

                System.out.println("Digite seu nome de usuario:");
                String nomeUsuario = sc.nextLine();

                Endereco endereco = new Endereco(cep, numeroCasa,rua, bairro, cidade, estado, pais);
                Contato contato = new Contato(email, telefone);
                Usuario usuario = new Usuario(nome, endereco, contato, cpf, nomeUsuario);
                usuarioService.cadastrar(usuario);

            }else if (escolha == 2) {

                System.out.println("Digite o nome da Marca:");
                String nome = sc.nextLine();

                System.out.println("Digite seu CEP:");
                String cep = sc.nextLine();

                System.out.println("Digite o numero da Residencia");
                String numeroCasa = sc.nextLine();

                System.out.println("Digite o nome da rua:");
                String rua = sc.nextLine();

                System.out.println("Digite seu bairro:");
                String bairro = sc.nextLine();

                System.out.println("Digite sua Cidade:");
                String cidade = sc.nextLine();

                System.out.println("Digite seu Estado:");
                String estado = sc.nextLine();

                System.out.println("Digite seu Pais:");
                String pais = sc.nextLine();

                System.out.println("Digite seu Email:");
                String email = sc.nextLine();

                System.out.println("Digite seu Telefone:");
                String telefone = sc.nextLine();

                System.out.println("Digite seu CNPJ:");
                String cnpj = sc.nextLine();

                System.out.println("Digite seu Nivel de Sustentabilidade:");
                String nivelSustentabilidade = sc.nextLine();

                Endereco endereco = new Endereco(cep, numeroCasa,rua, bairro, cidade, estado, pais);
                Contato contato = new Contato(email, telefone);
                Marca marca = new Marca(nome, endereco, contato, cnpj, nivelSustentabilidade);
                marcaService.cadastrar(marca);

            }else if (escolha == 3) {
                if (usuario == null || marca == null ){
                    System.out.println("Não há cadastros aqui");
                }


            }else {
                System.out.println("Comando Invalido, Digite novamente");
            }
        } while (escolha != 0);

    }
}
