package Controllers.Controllers;

import model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123456789");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorID1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorID2(
            @RequestParam(name = "id") int id) {
        return new Cliente(id, "João Augusto", "987.654.321-00");
    }
}
