package br.com.elb.screenmatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/filmes")
public class FilmeController {


    @GetMapping
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }
}
