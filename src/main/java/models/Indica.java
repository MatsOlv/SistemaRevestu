package models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Indica {
    @ManyToOne
    @JoinColumn(name = "id_reciclagem")
    private Reciclagem reciclagem;
    @ManyToOne
    @JoinColumn(name = "id_ponto")
    private Ponto ponto;
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;
}
