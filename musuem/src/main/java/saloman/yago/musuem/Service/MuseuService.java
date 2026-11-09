package saloman.yago.musuem.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import saloman.yago.musuem.Model.Museu;
import saloman.yago.musuem.Repository.MuseuRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MuseuService {

    private final MuseuRepository museuRepository;

    public List<Museu> findAll() {
        return museuRepository.findAll();
    }

    public Optional<Museu> findById(Long id) {
        return museuRepository.findById(id);
    }

    public Museu save(Museu museu) {
        return museuRepository.save(museu);
    }
}
