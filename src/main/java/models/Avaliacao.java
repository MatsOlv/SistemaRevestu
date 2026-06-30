package models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
@Entity
public class Avaliacao {
    private String CicloVida;
    private String Comentario;
    private int Nota;
}
