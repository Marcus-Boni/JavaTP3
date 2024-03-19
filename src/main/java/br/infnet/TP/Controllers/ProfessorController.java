package br.infnet.TP.Controllers;

import br.infnet.TP.Professor;
import br.infnet.TP.Services.ProfessorService;
import br.infnet.TP.Services.ViaCEPService;
import br.infnet.TP.ViaCEPResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    private final ViaCEPService viaCEPService;

    @GetMapping("/{escolaId}")
    public List<Professor> listarProfessoresPorEscola(@PathVariable Long escolaId) {
        return professorService.listarPorEscola(escolaId);
    }

    @PostMapping("/{escolaId}")
    public Professor criarProfessor(@PathVariable Long escolaId, @RequestBody Professor professor) {
        return professorService.criar(escolaId, professor);
    }

    @DeleteMapping("/{id}")
    public void excluirProfessor(@PathVariable Long id) {
        professorService.excluir(id);
    }

    public ProfessorController(ViaCEPService viaCEPService) {
        this.viaCEPService = viaCEPService;
    }

    @GetMapping("/{cep}/endereco")
    public ViaCEPResponse obterEnderecoPorCEP(@PathVariable String cep) {
        return viaCEPService.consultarCEP(cep);
    }
}
