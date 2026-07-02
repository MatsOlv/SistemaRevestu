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
public class  Endereco {
    private String cep;
    private String numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
}
