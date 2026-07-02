package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Marca;
import java.util.Optional;

public interface MarcaRepository {
    @Insert
    void cadastrarMarca (Marca marca);

    @Find
    Optional <Marca> buscarMarca (String cnpj);

    @Update
    void atualizarMarca (Marca marca);

    @Delete
    void deletarMarca (Marca marca);

}
