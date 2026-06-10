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
@Embeddable
public class Marca {
    @Id
    private String Cnpj;
    private String NivelSustentabilidade;
    @Embedded
    private Pessoa Pessoa;
    @OneToMany(mappedBy = "marca")
    private List<Produto> produtos = new ArrayList<>();
}
