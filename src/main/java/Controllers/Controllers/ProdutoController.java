package Controllers.Controllers;

import model.entities.Produto;
import model.entities.ProdutoRepositories;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public @ResponseBody ProdutoView NovoProduto(Produto produto) {
        return produtoService.save(produto);
    }

//    @GetMapping
//    public Iterable<Produto> obterProdutos() {
//        return ProdutoRepositories.findAll();
//    }

    @GetMapping(path = "/{id}/{asdasdasdas}")
    public ProdutoView obterProdutoPorID(@PathVariable int id, @PathVariable("asdasdasdas") String a) {
        return produtoService.get(id);
    }
}

class ProdutoView {
    private int id;
    private String nome;

    public ProdutoView(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}