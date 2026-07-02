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
    @Id
    private String cnpj;
    private String nivelSustentabilidade;
    @OneToMany(mappedBy = "marca")
    private List<Produto> produtos;
}
