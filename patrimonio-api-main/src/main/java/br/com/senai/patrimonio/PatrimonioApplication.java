package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Enum.Nivel;
import br.com.senai.patrimonio.avaliacao.Enum.StatusEvento;
import br.com.senai.patrimonio.avaliacao.Evento;
import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.model.Funcionario;
import br.com.senai.patrimonio.model.Sala;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.Pagamento;
import br.com.senai.patrimonio.model.enums.PagamentoComposto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.crypto.spec.PSource;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);
	Participante participante = new Participante("rafael","48996119904","Andrade10rafa@gmail.com","1234567", Nivel.avancado);
		System.out.println("participante: " + participante.getNome() + ", " + participante.getTelefone() + ", " + participante.getEmail() + ", " + participante.getMatricula() + ", " + participante.getNivel());
	// evento
		Evento evento = new Evento(1, "Palestra sobre IA", "Auditório Senai", StatusEvento.EVENTO_PLANEJADO, participante);
		System.out.println("evento: "+ evento.getNome()+" local: "+ evento.getLocal() +" Status " +evento.getStatus().getDescricao());

	}


}