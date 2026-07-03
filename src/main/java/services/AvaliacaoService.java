package services;

import models.Avaliacao;
import repositories.AvaliacaoRepository;
import lombok.RequiredArgsConstructor;
import java.util.UUID;

@RequiredArgsConstructor
public class AvaliacaoService {
    private final AvaliacaoRepository avaliacaoRepository;

    public void cadastrar (Avaliacao avaliacao){
        avaliacaoRepository.cadastrarAvaliacao(avaliacao);
    }

    public Avaliacao buscar (UUID idAvaliacao){
        var avaliacao = avaliacaoRepository.buscarAvaliacao(idAvaliacao);
        if(avaliacao.isEmpty())
            throw new RuntimeException("");
        return avaliacao.get();
    }

   public void atualizar (Avaliacao avaliacao){
     avaliacaoRepository.atualizarAvaliacao(avaliacao);
    }

   public void deletar (Avaliacao avaliacao){
      avaliacaoRepository.deletarAvaliacao(avaliacao);
    }

}
