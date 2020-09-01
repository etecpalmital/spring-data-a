package homecare.repositories;

import org.springframework.data.repository.CrudRepository;
import homecare.models.Servico;

public interface ServicoRepository extends CrudRepository <Servico, Integer> {

}