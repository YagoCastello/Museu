package saloman.yago.musuem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import saloman.yago.musuem.Model.Obra;
import saloman.yago.musuem.Model.TipoObra;

import java.util.List;

public interface ObraRepository extends JpaRepository<Obra, Long> {

    List<Obra> findByTipo(TipoObra tipo);

    List<Obra> findByTituloContainingIgnoreCase(String titulo);

    List<Obra> findByArtistaId(Long artistaId);

    List<Obra> findByMuseuId(Long museuId);

    boolean existsByArtistaId(Long artistaId);

    boolean existsByMuseuId(Long museuId);

    long countByMuseuId(Long museuId);
}
