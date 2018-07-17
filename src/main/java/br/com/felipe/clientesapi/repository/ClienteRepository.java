package br.com.felipe.clientesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.felipe.clientesapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
