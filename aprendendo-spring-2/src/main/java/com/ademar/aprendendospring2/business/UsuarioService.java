package com.ademar.aprendendospring2.business;

import com.ademar.aprendendospring2.infrastructure.entity.Usuario;
import com.ademar.aprendendospring2.infrastructure.exceptions.ConflictException;
import com.ademar.aprendendospring2.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    //metodo responsavel por salver o usuario
    public Usuario salvaUsuario(Usuario usuario){
        try{
            emailExiste(usuario.getEmail());
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
            return usuarioRepository.save(usuario);
        } catch (ConflictException e){
            throw new ConflictException("Emal já cadastrado", e.getCause());

        }
    }


    public void emailExiste(String email){
        try{
            boolean existe = verificaEmailExistente(email);
            if (existe){
                throw new ConflictException("Email já cadastrado" + email);
            }
        }catch (ConflictException e){
            throw new ConflictException("Email já cadastrado" + e.getCause());
        }
    }

    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }

}
