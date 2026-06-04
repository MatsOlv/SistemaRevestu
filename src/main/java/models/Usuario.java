package models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Usuario {
    private String Cpf;
    private String NomeUsuario;
    @Embedded
    private Pessoa Pessoa;
}
