package gestione.incendi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gestione.incendi.models.Sonda;

@Repository
public interface SondaRepo extends CrudRepository<Sonda, Long> {

}
