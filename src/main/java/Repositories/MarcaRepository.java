package Repositories;

import jakarta.data.repository.Insert;
import models.Marca;
import models.Pessoa;

public interface MarcaRepository {
    @Insert
    void criar (Marca Marca);

}
