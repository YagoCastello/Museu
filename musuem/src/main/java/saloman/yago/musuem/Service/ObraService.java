package saloman.yago.musuem.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import saloman.yago.musuem.Model.Obra;
import saloman.yago.musuem.Repository.ObraRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ObraService {

    private final ObraRepository obraRepository;

    public List<Obra> findAll() {
        return obraRepository.findAll();
    }

    public Optional<Obra> findById(Long id) {
        return obraRepository.findById(id);
    }

    public Obra save(Obra obra) {
        return obraRepository.save(obra);
    }



}
