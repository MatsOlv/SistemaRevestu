package models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Embeddable
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID IdProduto;
    private String Tamanho;
    private String Genero;
    @ManyToOne
    @JoinColumn(name = "marca_cnpj", referencedColumnName = "cnpj")
    private Marca Marca;

    //fazer mappedby de avaliação
}
