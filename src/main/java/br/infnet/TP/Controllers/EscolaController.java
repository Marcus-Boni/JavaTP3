package br.infnet.TP.Controllers;

import br.infnet.TP.Escola;
import br.infnet.TP.Services.EscolaService;
import br.infnet.TP.Services.ViaCEPService;
import br.infnet.TP.ViaCEPResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escolas")
public class EscolaController {
    @Autowired
    private EscolaService escolaService;

    private final ViaCEPService viaCEPService;

    @GetMapping
    public List<Escola> listarEscolas() {
        return escolaService.listarTodas();
    }

    @PostMapping
    public Escola criarEscola(@RequestBody Escola escola) {
        return escolaService.criar(escola);
    }

    @DeleteMapping("/{id}")
    public void excluirEscola(@PathVariable Long id) {
        escolaService.excluir(id);
    }

    public EscolaController(ViaCEPService viaCEPService) {
        this.viaCEPService = viaCEPService;
    }

    @GetMapping("/{cep}/endereco")
    public ViaCEPResponse obterEnderecoPorCEP(@PathVariable String cep) {
        return viaCEPService.consultarCEP(cep);
    }
}

