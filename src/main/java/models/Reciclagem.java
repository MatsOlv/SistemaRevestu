package models;

import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

public class Reciclagem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID IdReciclagem;
    private String TipoMaterial;
    private String PontoColeta;
    private LocalDateTime Data;
    @Embedded
    private Usuario Usuario;
    @Embedded
    private Produto Produto;
}
