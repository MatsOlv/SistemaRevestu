package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Reciclagem;
import java.util.Optional;
import java.util.UUID;

public interface ReciclagemRepository {
        @Insert
        void cadastrarReciclagem(Reciclagem reciclagem);

        @Find
        Optional<Reciclagem> buscarReciclagem(UUID idReciclagemem);

        @Update
        void atualizarReciclagem(Reciclagem reciclagem);

        @Delete
        void deletarReciclagem(Reciclagem reciclagem);
    }

