package services;

import repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import models.Produto;
import java.util.UUID;

@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public void cadastrar (Produto produto){
        produtoRepository.cadastrarProduto(produto);
    }

    public Produto buscar (UUID idProduto){
        var produto = produtoRepository.buscarProduto(idProduto);
        if(produto.isEmpty())
            throw new RuntimeException("");
        return produto.get();
    }

    public void atualizar (Produto produto){
       produtoRepository.atualizarProduto(produto);
    }

    public void deletar (Produto produto){
        produtoRepository.deletarProduto(produto);
    }

}
