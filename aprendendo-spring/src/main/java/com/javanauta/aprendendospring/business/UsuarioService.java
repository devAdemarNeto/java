package com.javanauta.aprendendospring.business;

import com.javanauta.aprendendospring.infrastructure.entity.Usuario;
import com.javanauta.aprendendospring.infrastructure.excepitions.ConflictException;
import com.javanauta.aprendendospring.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;

    public Usuario salvaUsuario(Usuario usuario){
        try{
            emailExiste(usuario.getEmail());
            return usuarioRepository.save(usuario);
        }catch (ConflictException e){
            throw new ConflictException("Email já cadastrado" + e.getCause());
        }

    }

    public void emailExiste(String email){
        try{
            boolean existe = verificaEmailExistente(email);
            if (existe){
                throw new ClassCastException("Email já cadastrado" + email);
            }
        } catch (ClassCastException e) {
            throw new ConflictException("Email já cadastrado" + e.getCause());
        }
    }
    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }


}
