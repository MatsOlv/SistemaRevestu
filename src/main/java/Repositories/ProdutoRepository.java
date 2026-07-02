package Repositories;

import jakarta.data.repository.Delete;
import jakarta.data.repository.Find;
import jakarta.data.repository.Insert;
import jakarta.data.repository.Update;
import models.Produto;

import java.util.Optional;
import java.util.UUID;

public interface ProdutoRepository {

    @Insert
    void cadastrarProduto (Produto produto);

    @Find
    Optional <Produto> buscarProduto (UUID idProduto);

    @Update
    void atualizarProduto (Produto produto);

    @Delete
    void deletarProduto (Produto produto);
}
