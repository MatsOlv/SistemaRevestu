package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idAvaliacao;
    private String cicloVida;
    private String comentario;
    private int nota;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;
}
