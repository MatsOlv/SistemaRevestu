package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Usuario;

import java.util.Optional;

public interface UsuarioRepository {

    @Insert
    void cadastrarUsuario (Usuario Usuario);

    @Find
    Optional <Usuario>  buscarUsuario (String CPF);

    @Update
    void atualizarUsuario (Usuario Usuario);

    @Delete
    void deletarUsuario (Usuario Usuario);
    
}
