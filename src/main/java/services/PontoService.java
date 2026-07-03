package services;

import models.Ponto;
import repositories.PontoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PontoService {

    private final PontoRepository pontoRepository;

    public void cadastrar(Ponto ponto){
       pontoRepository.cadastrarPonto(ponto);
    }

    public Ponto buscar (String idPonto){
        var ponto = pontoRepository.buscarPonto(idPonto);
        if(ponto.isEmpty())
            throw new RuntimeException("");
        return ponto.get();
    }

    public void atualizar (Ponto ponto){
        pontoRepository.atualizarPonto(ponto);
    }

    public void deletar (Ponto ponto){
        pontoRepository.deletarPonto(ponto);
    }

}
