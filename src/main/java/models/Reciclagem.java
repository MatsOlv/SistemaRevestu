package models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Reciclagem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idReciclagem;
    private String tipoMaterial;
    private String pontoColeta;
    private LocalDateTime data;

    @ManyToMany
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

    @ManyToMany
    @JoinColumn(name = "id_produto")
    private Produto produto;

}
