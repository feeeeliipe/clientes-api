package br.com.felipe.clientesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.felipe.clientesapi.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
