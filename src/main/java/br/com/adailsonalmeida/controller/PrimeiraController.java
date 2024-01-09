package br.com.adailsonalmeida.controller;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class PrimeiraController {

    /*
     * GET - Busca uma informação
     * POST - Adiciona um dado/informação
     * PUT - Altera um dado/informação
     * DELETE - Remove um dado/informação
     * PATCH - Altera somente uma parte do dado/informação
     */
    
    
    public String primeiraMensagem() {
        return "Funcionou";
    }
     
}