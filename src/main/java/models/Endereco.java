package models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Endereco {
    private String Cep;
    private String Numero;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Pais;
}
