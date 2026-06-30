package models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}
