package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Marca extends Pessoa{

    public Marca(String nome, Endereco endereco, Contato contato, String cnpj, String nivelSustentabilidade) {
        super(nome, endereco, contato);
        this.cnpj = cnpj;
        this.nivelSustentabilidade = nivelSustentabilidade;
    }

    @Id
    private String cnpj;
    private String nivelSustentabilidade;
    @OneToMany(mappedBy = "marca")
    private List<Produto> produtos;
}
