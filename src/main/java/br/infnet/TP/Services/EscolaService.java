package br.infnet.TP.Services;

import br.infnet.TP.Escola;
import br.infnet.TP.Repositories.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaService {
    @Autowired
    private EscolaRepository escolaRepository;

    public List<Escola> listarTodas() {
        return escolaRepository.findAll();
    }

    public Escola criar(Escola escola) {
        return escolaRepository.save(escola);
    }

    public void excluir(Long id) {
        escolaRepository.deleteById(id);
    }
}
