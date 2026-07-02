package models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ponto {
    @Id
    private String idPonto;
    private String nomePonto;
    private String localizacao;
}
