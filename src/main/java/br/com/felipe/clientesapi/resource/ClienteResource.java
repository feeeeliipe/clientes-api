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
import br.com.felipe.clientesapi.repository.ClienteRepository;
import br.com.felipe.clientesapi.model.Cliente;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteResource {
	
	@Autowired
	private ClienteRepository clienteRepository;


	@GetMapping("/clientes")
	public List<Cliente> buscarTodos() {
		System.out.println("Buscando todos os clientes...");
		return clienteRepository.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente buscaPorId(@PathVariable Long id) {
		System.out.println("Buscando cliente por id "+id+"...");
		return clienteRepository.findOne(id);
	}
	
	@PostMapping("/clientes")
	public Cliente salvar(@RequestBody @Valid Cliente cliente) {
		System.out.println("Salvando cliente...");
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void remover(@PathVariable Long id) {
		System.out.println("Chamou o remover");
		clienteRepository.delete(id);
	}

}
