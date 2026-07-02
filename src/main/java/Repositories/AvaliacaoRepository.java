package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Avaliacao;
import java.util.Optional;
import java.util.UUID;

public interface AvaliacaoRepository {

    @Insert
    void cadastrarAvaliacao (Avaliacao avaliacao);

    @Find
    Optional <Avaliacao> buscarAvaliacao (UUID idAvaliacao);

    @Update
    void atualizarAvaliacao (Avaliacao avaliaca);

    @Delete
    void deletarAvaliacao (Avaliacao avaliaca);

}
