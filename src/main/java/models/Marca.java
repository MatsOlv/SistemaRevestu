package models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marca {
    @Id
    private String Cnpj;
    private String NivelSustentabilidade;
    @Embedded
    private Pessoa Pessoa;
}
