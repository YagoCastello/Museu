package saloman.yago.musuem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import saloman.yago.musuem.Model.Obra;

public interface ObraRepository extends JpaRepository<Obra, Long> {
}
