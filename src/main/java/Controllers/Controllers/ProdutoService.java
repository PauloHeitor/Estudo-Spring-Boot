package Controllers.Controllers;

import model.entities.Produto;
import model.entities.ProdutoRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepositories ProdutoRepositories;

    public ProdutoView save(Produto produto) {
        Produto saved = ProdutoRepositories.save(produto);
        return new ProdutoView(saved.getId(), saved.getNome());
    }

    public ProdutoView get(Integer id) {
        Produto find = ProdutoRepositories.findById(id).orElse(null);
        return new ProdutoView(find.getId(), find.getNome());
    }
}
