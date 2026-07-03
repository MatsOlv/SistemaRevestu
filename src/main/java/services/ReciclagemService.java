package services;

import models.Reciclagem;
import repositories.ReciclagemRepository;
import lombok.RequiredArgsConstructor;
import java.util.UUID;

@RequiredArgsConstructor
public class ReciclagemService {
    private final ReciclagemRepository reciclagemRepository;

    public void cadastrar (Reciclagem reciclagem){
        reciclagemRepository.cadastrarReciclagem(reciclagem);
    }

    public Reciclagem buscar (UUID idReciclagem){
        var reciclagem = reciclagemRepository.buscarReciclagem(idReciclagem);
        if(reciclagem.isEmpty())
            throw new RuntimeException("");
        return reciclagem.get();
    }

    public void atualizar(Reciclagem reciclagem){
        reciclagemRepository.atualizarReciclagem(reciclagem);
    }

    public void deletar (Reciclagem reciclagem){
        reciclagemRepository.deletarReciclagem(reciclagem);
    }

}
