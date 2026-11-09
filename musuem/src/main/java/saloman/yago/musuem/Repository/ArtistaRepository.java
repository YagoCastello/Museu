package saloman.yago.musuem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import saloman.yago.musuem.Model.Artista;


public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
