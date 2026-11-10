package saloman.yago.musuem.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import saloman.yago.musuem.Model.Artista;
import saloman.yago.musuem.Repository.ArtistaRepository;
import saloman.yago.musuem.Repository.ObraRepository;
import saloman.yago.musuem.Response.ArtistaResponse;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtistaService {

    private final ArtistaRepository artistaRepository;
    private final ObraRepository obraRepository;

    @Transactional(readOnly = true)
    public List<ArtistaResponse> findAll() {
        return artistaRepository.findAll().stream().map(ArtistaResponse::de).toList();
    }

    @Transactional(readOnly = true)
    public ArtistaResponse findById(long id) {
        return ArtistaResponse.de(buscar(id));
    }




    /** Usado por outros services que precisam do artista como entidade. */
    public Artista buscar(long id) {
        return artistaRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Artista", id));

    }

    public Artista save(Artista artista) {
        return artistaRepository.save(artista);
    }
}
