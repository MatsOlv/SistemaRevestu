package models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Usuario {
    @Id
    private String Cpf;
    private String NomeUsuario;
    @Embedded
    private Pessoa Pessoa;

    //fazer mappedby de avaliação
}
