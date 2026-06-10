package Repositories;

import jakarta.data.repository.Insert;
import models.Pessoa;

public interface PessoaRepository {

    @Insert
    void criar (Pessoa Pessoa);


}
