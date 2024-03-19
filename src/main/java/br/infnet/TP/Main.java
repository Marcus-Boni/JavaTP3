package br.infnet.TP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcus", 19, "Engenharia de Software", 8.5);
        Aluno aluno2 = new Aluno("Lucas", 17, "Ciência de Dados", 5.0);
        Aluno aluno3 = new Aluno("Pedro", 21, "Engenharia da computação", 3.5);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Média de Notas: " + aluno1.getMediaNotas());
        System.out.println("Status: " + aluno1.getStatus());

        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/endereco/{cep}")
    public ViaCEPResponse obterEndereco(@PathVariable String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, ViaCEPResponse.class);
    }
}
