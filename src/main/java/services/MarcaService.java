package services;

import models.Marca;
import repositories.MarcaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MarcaService {

    private final MarcaRepository marcaRepository;

    public void cadastrar (Marca marca){
        marcaRepository.cadastrarMarca(marca);
    }

    public Marca buscar (String cnpj){
        var marca = marcaRepository.buscarMarca(cnpj);
        if(marca.isEmpty())
            throw new RuntimeException("");
        return marca.get();
    }

    public void atualizar (Marca marca){
        marcaRepository.atualizarMarca(marca);
    }

    public void deletar (Marca marca){
        marcaRepository.deletarMarca(marca);
    }

}
