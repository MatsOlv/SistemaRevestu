package models;

import jakarta.persistence.Embedded;

public class Avaliacao {
    private String CicloVida;
    private String Comentario;
    private int Nota;
    @Embedded
    private Usuario Usuario;
    @Embedded
    private Produto Produto;
}
