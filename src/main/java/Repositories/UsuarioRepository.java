package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Marca;
import models.Usuario;

public interface UsuarioRepository {
    @Insert
    void criar (Usuario Usuario);

    @Find

    @Update

    @Delete
}
