package services;


import repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import models.Usuario;

@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public void cadastrar (Usuario usuario){
      usuarioRepository.cadastrarUsuario(usuario);
    }

    public Usuario buscar (String cpf){
        var usuario = usuarioRepository.buscarUsuario(cpf);
        if(usuario.isEmpty())
            throw new RuntimeException("");
        return usuario.get();
    }

    public void atualizar (Usuario usuario){
       usuarioRepository.atualizarUsuario(usuario);
    }

    public void deletar (Usuario usuario){
        usuarioRepository.deletarUsuario(usuario);
    }
}
