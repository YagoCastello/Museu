package saloman.yago.musuem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import saloman.yago.musuem.Model.Museu;

public interface MuseuRepository extends JpaRepository<Museu, Long> {
}
