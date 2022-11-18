package br.gov.sp.fatec.projetolab5.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestExecutionListeners;

import br.gov.sp.fatec.projetolab5.entity.Autorizacao;

@SpringBootTest
@Transactional //transações onde faz as operações e caso de problema desfaz tudo
@Rollback

public class AutorizazcaoRepositoryTest {
    
    @Autowired
    private AutorizacaoRepository repository;

    @Test
    public void novaAutorizacao(){
        Autorizacao novaAuto = new Autorizacao(); 
        novaAuto.setNome("Alexia");
        novaAuto = repository.save(novaAuto);
        assertNotNull(novaAuto.getId());

    }


    
}
