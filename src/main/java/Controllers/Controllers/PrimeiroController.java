package Controllers.Controllers;

import model.entities.ProdutoRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @Autowired
    private ProdutoRepositories ProdutoRepositories;

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "Ola Spring Boot";
    }
}
