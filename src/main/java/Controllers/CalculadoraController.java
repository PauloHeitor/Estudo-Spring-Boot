package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping(path = "/sum/{num1}/{num2}")
    public int Soma(int num1, int num2) {

        return num1 + num2;
    }

    @GetMapping(path = "/sub")
    public int Subtracao(
            @RequestParam(name = "num1") int num1,
            @RequestParam(name = "num2") int num2) {

        return num1 - num2;
    }
}
