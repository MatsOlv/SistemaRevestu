package models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Indica {
    @Embedded
    private Reciclagem Reciclagem;
    @Embedded
    private Ponto Ponto;
    @Embedded
    private Marca Marca;
}
