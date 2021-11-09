package Controllers.Controllers;

import model.entities.Produto;
import model.entities.ProdutoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepositories ProdutoRepositories;

    @PostMapping
    public @ResponseBody Produto NovoProduto(Produto produto) {
        ProdutoRepositories.save(produto);

        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return ProdutoRepositories.findAll();
    }

    /*@GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorID(int id) {
        return ProdutoRepositories.findAllById(id);
    }*/
}
