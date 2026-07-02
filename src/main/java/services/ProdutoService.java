package services;

import Repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import models.Produto;

@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public void criar(Produto produto){
        if(produto.getIdProduto() == null){

        }
        produtoRepository.cadastrarProduto(produto);
    }
}
