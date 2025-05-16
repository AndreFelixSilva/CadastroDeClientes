package dev.andrefelix.CadastroDeClientes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class Controller {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Olá! Bem vindo";
    }
}
