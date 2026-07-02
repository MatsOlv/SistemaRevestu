package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idProduto;
    private String tamanho;
    private String genero;

    @ManyToOne
    @JoinColumn(name = "marca_cnpj", referencedColumnName = "cnpj")
    private Marca Marca;

    @OneToMany(mappedBy = "produto" )
    private List<Avaliacao> avaliacao;

    @ManyToMany(mappedBy = "produto" )
    private List<Reciclagem> reciclagem;

}
