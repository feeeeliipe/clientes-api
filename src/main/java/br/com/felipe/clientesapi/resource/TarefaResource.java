package br.com.felipe.clientesapi.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipe.clientesapi.model.Tarefa;
import br.com.felipe.clientesapi.repository.TarefaRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TarefaResource {

	@Autowired
	private TarefaRepository tarefaRepository;
	
	@GetMapping("/tarefas")
	public List<Tarefa> buscarTodos() {
		System.out.println("TarefaResourceLOG: Buscando todos as tarefas...");
		return tarefaRepository.findAll();
	}
	
	@GetMapping("/tarefas/{id}")
	public Tarefa buscaPorId(@PathVariable Long id) {
		System.out.println("TarefaResourceLOG: Buscando tarefa por id "+id+"...");
		return tarefaRepository.findOne(id);
	}
	
	@PostMapping("/tarefas")
	public Tarefa salvar(@RequestBody @Valid Tarefa tarefa) {
		System.out.println("TarefaResourceLOG: Salvando tarefa...");
		return tarefaRepository.save(tarefa);
	}
	
	@DeleteMapping("/tarefas/{id}")
	public void remover(@PathVariable Long id) {
		System.out.println("TarefaResourceLOG: Excluindo tarefa...");
		tarefaRepository.delete(id);
	}
}
