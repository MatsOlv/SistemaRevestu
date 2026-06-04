package models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Embeddable
public class Pessoa {
    @Id
    private String IdPessoa;
    private String Nome;
    @Embedded
    private Endereco Endereco;
    @Embedded
    private Contato Contato;
}
