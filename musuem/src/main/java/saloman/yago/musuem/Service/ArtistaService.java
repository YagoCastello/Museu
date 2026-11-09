package saloman.yago.musuem.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import saloman.yago.musuem.Model.Artista;
import saloman.yago.musuem.Repository.ArtistaRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtistaService {

    private final ArtistaRepository artistaRepository;

    public List<Artista> findAll() {
        return artistaRepository.findAll();
    }

    public Optional<Artista> findById(long id) {
        return artistaRepository.findById(id);
    }

    public Artista save(Artista artista) {
        return artistaRepository.save(artista);
    }
}
