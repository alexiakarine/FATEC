package br.gov.sp.fatec.projetolab5.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

// import org.hibernate.internal.build.AllowPrintStacktrace;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.projetolab5.entity.Usuario;


@SpringBootTest
@Transactional //transações onde faz as operações e caso de problema desfaz tudo
@Rollback
public class UsuarioRepositoryTest{
    @Autowired
    private UsuarioRepository usuarioRepo;

    @Test
    public void novoUsuarioTest(){
        Usuario usuario = new Usuario();
        usuario.setNome("TESTE---");
        usuario.setSenha("123");
        usuario = usuarioRepo.save(usuario);
        assertNotNull(usuario.getId());
    }
}