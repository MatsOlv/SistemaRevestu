package models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Reciclagem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID IdReciclagem;
    private String TipoMaterial;
    private String PontoColeta;
    private LocalDateTime Data;

    @ManyToMany
    private Usuario usuario;

    @ManyToMany
    private Produto produto;

    //fazer o mappedby dos many
}
