package repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Usuario;

import java.util.Optional;

public interface UsuarioRepository {

    @Insert
    void cadastrarUsuario (Usuario usuario);

    @Find
    Optional <Usuario>  buscarUsuario (String cpf);

    @Update
    void atualizarUsuario (Usuario usuario);

    @Delete
    void deletarUsuario (Usuario usuario);
    
}
