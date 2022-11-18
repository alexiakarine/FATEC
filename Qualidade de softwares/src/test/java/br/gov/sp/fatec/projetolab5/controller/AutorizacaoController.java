package br.gov.sp.fatec.projetolab5.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import br.gov.sp.fatec.projetolab5.entity.Autorizacao;
import br.gov.sp.fatec.projetolab5.service.AutorizacaoService;
import static org.mockito.ArgumentMatchers.any;

import org.apache.tomcat.util.http.parser.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@WebMvcTest(AutorizacaoController.class)
public class AutorizacaoController {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private AutorizacaoService service;


    @Test
    public void novaAutorizacao() throws Exception{
    Autorizacao auto = new Autorizacao("alexia");
    auto.setId(1L);
    Mockito.when(service.novaAutorizacao(any())).thenReturn(auto);
    
    mvc.perform(post("/autorizacao")
        .content("{\"nome\"}")
        .contentType(MediaType.APPLICATION_JSON))
        .andDo(print()).andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value(1L));
    


    }
    
}
