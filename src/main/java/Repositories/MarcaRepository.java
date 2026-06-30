package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Marca;
import java.util.Optional;

public interface MarcaRepository {
    @Insert
    void cadastrarMarca (Marca Marca);

    @Find
    Optional <Marca> buscarMarca (String Cnpj);

    @Update
    void atualizarMarca (Marca Marca);

    @Delete
    void deletarMarca (Marca Marca);

}
