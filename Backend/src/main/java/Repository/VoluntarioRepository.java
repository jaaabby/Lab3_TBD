package Repository;

import Models.Voluntario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoluntarioRepository extends MongoRepository<Voluntario, String> {
}
