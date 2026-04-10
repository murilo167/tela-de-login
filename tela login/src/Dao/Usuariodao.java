package dao;

import dto.usuariodto;

public class Usuariodao {

    public boolean autenticarUsuario(usuariodto usuarioDTO) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        return usuarioDTO.getUsuario().equals(usuarioCorreto)
                && usuarioDTO.getSenha().equals(senhaCorreta);
    }
}
