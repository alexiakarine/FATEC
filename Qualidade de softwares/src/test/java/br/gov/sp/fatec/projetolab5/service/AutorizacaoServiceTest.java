package br.gov.sp.fatec.projetolab5.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetolab5.controller.AutorizacaoController;
import br.gov.sp.fatec.projetolab5.entity.Autorizacao;
import br.gov.sp.fatec.projetolab5.repository.AutorizacaoRepository;

@SpringBootTest

public class AutorizacaoServiceTest {
    @Autowired
    private AutorizacaoService service;

     @MockBean
     private AutorizacaoRepository repo;

    @BeforeEach
    public void setUp() {
        List<Autorizacao> auto = new ArrayList<Autorizacao>();
         Mockito.when(repo.findAll()).thenReturn(auto);
    }

    @Test
    public void buscarTodasTeste(){
        assertEquals(service.buscarTodas().isEmpty(), true);
    }

    
    
}
