package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario extends Pessoa{

    public Usuario(String cpf, String nomeUsuario) {
        super("nome", new Endereco(), new Contato());
        this.cpf = cpf;
        this.nomeUsuario = nomeUsuario;
    }

    @Id
    private String cpf;
    private String nomeUsuario;

    @OneToMany(mappedBy = "usuario" )
    private List<Avaliacao> avaliacao;

    @ManyToMany(mappedBy = "usuario" )
    private List<Reciclagem> reciclagem;

    public static Usuario Cadastrar() {


    }

    }
