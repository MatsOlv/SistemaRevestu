package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Ponto;
import java.util.Optional;

public interface PontoRepository {

    @Insert
    void cadastrarPonto (Ponto ponto);

    @Find
    Optional<Ponto> buscarPonto (String idPonto);

    @Update
    void atualizarPonto (Ponto ponto);

    @Delete
    void deletarPonto (Ponto ponto);
}
