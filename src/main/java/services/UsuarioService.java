package services;

import Repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import models.Usuario;

@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public void cadastrar(Usuario usuario) {
    }
}
