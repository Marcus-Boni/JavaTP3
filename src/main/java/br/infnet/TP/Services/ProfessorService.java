package br.infnet.TP.Services;

import br.infnet.TP.Escola;
import br.infnet.TP.Professor;
import br.infnet.TP.Repositories.EscolaRepository;
import br.infnet.TP.Repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private EscolaRepository escolaRepository;

    public List<Professor> listarPorEscola(Long escolaId) {
        return professorRepository.findByEscolaId(escolaId);
    }

    public Professor criar(Long escolaId, Professor professor) {
        Escola escola = escolaRepository.findById(escolaId).orElseThrow(() -> new RuntimeException("Escola não encontrada"));
        professor.setEscola(escola);
        return professorRepository.save(professor);
    }

    public void excluir(Long id) {
        professorRepository.deleteById(id);
    }
}